package model.building.CementPlant;

import model.building.Building;
import model.resource.ResourceType;

import java.util.Map;

public class CementPlant extends Building {
    public CementPlant(Map<ResourceType,Integer> constructionCost, Map<ResourceType,Integer> consumptionCost, Map<ResourceType,Integer> production) {
        super(4, 3, 0, 10, constructionCost, consumptionCost, production, 4, 2);
    }
}
