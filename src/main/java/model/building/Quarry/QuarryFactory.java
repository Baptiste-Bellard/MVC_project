package model.building.Quarry;

import model.building.Building;
import model.building.BuldingFactory;
import model.resource.ResourceType;

import java.util.HashMap;
import java.util.Map;

public class QuarryFactory implements BuldingFactory {
    public Building createBuilding() {
        Map<ResourceType, Integer> constructionCost = new HashMap<>();
        Map<ResourceType, Integer> consumption = new HashMap<>();
        Map<ResourceType, Integer> production = new HashMap<>();


        constructionCost.put(ResourceType.WOOD,50);

        production.put(ResourceType.STONE,4);
        production.put(ResourceType.IRON,4);
        production.put(ResourceType.COAL,4);
        return new Quarry(constructionCost, consumption, production);
    }
}
