package model.building.SteelMill;

import model.building.Building;
import model.building.BuldingFactory;
import model.resource.ResourceType;

import java.util.HashMap;
import java.util.Map;

public class SteelMillFactory implements BuldingFactory {
    public Building createBuilding() {
        Map<ResourceType, Integer> constructionCost = new HashMap<>();
        Map<ResourceType, Integer> consumption = new HashMap<>();
        Map<ResourceType, Integer> production = new HashMap<>();


        constructionCost.put(ResourceType.WOOD,100);
        constructionCost.put(ResourceType.STONE,50);

        consumption.put(ResourceType.IRON,4);
        consumption.put(ResourceType.COAL,2);

        production.put(ResourceType.STEEL,4);

        return new SteelMill(constructionCost, consumption, production);
    }
}
