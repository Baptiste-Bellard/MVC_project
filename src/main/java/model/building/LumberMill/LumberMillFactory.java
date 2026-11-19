package model.building.LumberMill;

import model.building.Building;
import model.building.BuldingFactory;
import model.resource.ResourceType;

import java.util.HashMap;
import java.util.Map;

public class LumberMillFactory implements BuldingFactory {
    public Building createBuilding(){
        Map<ResourceType, Integer> constructionCost = new HashMap<>();
        Map<ResourceType, Integer> consumption = new HashMap<>();
        Map<ResourceType, Integer> production = new HashMap<>();


        constructionCost.put(ResourceType.WOOD,50);
        constructionCost.put(ResourceType.STONE,50);

        consumption.put(ResourceType.WOOD,5);

        production.put(ResourceType.LUMBER,4);
        return new LumberMill(constructionCost, consumption, production);
    }
}
