package model.building.ToolFactory;

import model.building.Building;
import model.building.BuldingFactory;
import model.resource.ResourceType;

import java.util.HashMap;
import java.util.Map;

public class ToolFactoryFactory implements BuldingFactory {
    public Building createBuilding() {
        Map<ResourceType, Integer> constructionCost = new HashMap<>();
        Map<ResourceType, Integer> consumption = new HashMap<>();
        Map<ResourceType, Integer> production = new HashMap<>();


        constructionCost.put(ResourceType.WOOD,50);
        constructionCost.put(ResourceType.STONE,50);

        consumption.put(ResourceType.STEEL,4);
        consumption.put(ResourceType.COAL,4);

        production.put(ResourceType.TOOLS,4);

        return new ToolFactory(constructionCost, consumption, production);
    }
}
