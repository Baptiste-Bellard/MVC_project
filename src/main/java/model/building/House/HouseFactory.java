package model.building.House;

import model.building.BuldingFactory;
import model.resource.ResourceType;

import java.util.HashMap;
import java.util.Map;

public class HouseFactory implements BuldingFactory {
    public House createBuilding() {
        Map<ResourceType, Integer> constructionCost = new HashMap<>();
        Map<ResourceType, Integer> consumption = new HashMap<>();
        Map<ResourceType, Integer> production = new HashMap<>();


        constructionCost.put(ResourceType.WOOD,2);
        constructionCost.put(ResourceType.STONE,2);

        return new House(constructionCost, consumption, production);
    }
}
