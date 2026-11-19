package model.building.Farm;

import model.building.Building;
import model.building.BuldingFactory;
import model.resource.ResourceType;

import java.util.HashMap;
import java.util.Map;

public class FarmFactory implements BuldingFactory {
    public Building createBuilding(){
        Map<ResourceType, Integer> constructionCost = new HashMap<>();
        Map<ResourceType, Integer> consumption = new HashMap<>();
        Map<ResourceType, Integer> production = new HashMap<>();


        constructionCost.put(ResourceType.WOOD,5);
        constructionCost.put(ResourceType.STONE,5);

        production.put(ResourceType.FOOD,10);

        return new Farm(constructionCost, consumption, production);
    }
}
