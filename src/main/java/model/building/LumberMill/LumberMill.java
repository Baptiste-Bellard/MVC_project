package model.building.LumberMill;

import model.building.Building;
import model.resource.ResourceType;

import java.util.Map;

public class LumberMill extends Building {
    public LumberMill(Map<ResourceType,Integer> constructionCost, Map<ResourceType,Integer> consumptionCost, Map<ResourceType,Integer> production) {
        super(3, 3, 0, 10,  constructionCost, consumptionCost, production, 4, 5);
    }
}
