package model.building.WoodenCabin;

import model.building.Building;
import model.building.BuldingFactory;
import model.resource.Resource;
import model.resource.ResourceType;

import java.util.HashMap;
import java.util.Map;

public class WoodenCabinFactory implements BuldingFactory {
    @Override
    public Building createBuilding() {
        Map<ResourceType, Integer> constructionCost = new HashMap<>();
        Map<ResourceType, Integer> consumption = new HashMap<>();
        Map<ResourceType, Integer> production = new HashMap<>();

        constructionCost.put(ResourceType.WOOD,1);

        production.put(ResourceType.WOOD,2);
        production.put(ResourceType.FOOD,2);

        return new WoodenCabin(constructionCost, consumption, production);
    }
}
