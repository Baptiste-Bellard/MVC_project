package model.map;

import model.building.Building;
import model.resource.Resource;

public class Map {
    private static Map instance;
    private int height;
    private int width;
    private int[][] map;

    private Map(){}

    public static Map getInstance() {
        if (instance == null) {
            instance = new Map();
        }
        return instance;
    }

    public boolean canPlaceBuilding(Building building, int x, int y) {
        if (x < 0 || y < 0 || x + building.getWidth() > width || y + building.getHeight() > height) {
            return false;
        }
        for (int i = x; i < x + building.getWidth(); i++) {
            for (int j = y; j < y + building.getHeight(); j++) {
                if (map[i][j] != 0) {
                    return false;
                }
            }
        }
       return true;
    }

    public void placeBuilding(Building building, int x, int y) {
        if (canPlaceBuilding(building, x, y)) {
            building.constructionCost();
            for(int i = x; i < x + building.getWidth(); i++) {
                for(int j = y; j < y + building.getHeight(); j++) {
                    map[i][j] = building.getId();
                }
            }
        }else {
            throw new IllegalArgumentException("Can't place building here");
        }
    }

    public void removeBuilding(Building building, int x, int y) {
        for(int i = x; i < x + building.getWidth(); i++) {
            for(int j = y; j < y + building.getHeight(); j++) {
                map[i][j] = 0;
            }
        }
        building.destructionCost();

    }

    public void setWidth(int width) {
        this.width = width;
        initializeMap();
    }

    public void setHeight(int height) {
        this.height = height;
        initializeMap();
    }

    private void initializeMap() {
        if(width> 0 && height > 0){
            map = new int[width][height];
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void print() {
        Resource resource = Resource.getInstance();
        System.out.println("Food: " + resource.getFood().getQuantity());
        System.out.println("Wood: " + resource.getWood().getQuantity());
        System.out.println("Stone: " + resource.getStone().getQuantity());
        System.out.println("Iron: " + resource.getIron().getQuantity());
        System.out.println("Steel: " + resource.getSteel().getQuantity());
        System.out.println("Cement: " + resource.getCement().getQuantity());
        System.out.println("Lumber: " + resource.getLumber().getQuantity());
        System.out.println("Tools: " + resource.getTools().getQuantity());
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

}
