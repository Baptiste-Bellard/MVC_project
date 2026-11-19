package model;

import javafx.application.Platform;
import model.building.Building;
import model.map.Map;
import model.map.MapBuilder;
import model.resource.Resource;
import view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GameManager {
    private List<Building> buildings;
    private Map map;
    private ScheduledExecutorService scheduler;
    private View view;
    private static int day = 0;

    public GameManager(Map map, View view) {
        this.buildings = new ArrayList<>();
        this.map = map;
        this.view = view;
        this.scheduler = Executors.newScheduledThreadPool(1);
        startResourceManagementTask();
    }

    public void addBuilding(Building building, int x, int y) {
        if (map.canPlaceBuilding(building, x, y)) {
            map.placeBuilding(building, x, y);
            buildings.add(building);
        } else {
            throw new IllegalArgumentException("Cannot place building at the specified location.");
        }
    }

    public void removeBuilding(Building building, int x, int y) {
        buildings.remove(building);
        map.removeBuilding(building, x, y);
    }

 /*   public void addWorkers(Building building, int workers) {
        if (buildings.contains(building)) {
            building.setWorkers(building.getWorkers() + workers);
        } else {
            throw new IllegalArgumentException("Building not found.");
        }
    }

    public void removeWorkers(Building building, int workers) {
        if (buildings.contains(building)) {
            building.setWorkers(building.getWorkers() - workers);
        } else {
            throw new IllegalArgumentException("Building not found.");
        }
    }
    */

    public void produceResources() {
        for (Building building : buildings) {
            building.produce();
        }
    }

    public void consumeResources() {
        for (Building building : buildings) {
            building.consume();
        }
    }

    private void startResourceManagementTask() {
        scheduler.scheduleAtFixedRate(() -> {
            produceResources();
            consumeResources();
            Platform.runLater(() -> view.updateResourceDisplay(Resource.getInstance()));
            day += 1;
        }, 0, 3, TimeUnit.SECONDS);
    }

    public static int getDay() {
        return day;
    }
}