package model.building.ToolFactory;

import model.building.Building;
import model.resource.Resource;
import model.resource.ResourceType;

import java.util.Map;

public class ToolFactory extends Building {
    public ToolFactory(Map<ResourceType,Integer> constructionCost, Map<ResourceType,Integer> consumptionCost, Map<ResourceType,Integer> production) {
        super(4, 3, 0, 12,  constructionCost, consumptionCost, production, 8, 8);
    }
}
