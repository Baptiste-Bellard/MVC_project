package model.building.Quarry;

import model.building.Building;
import model.resource.ResourceType;

import java.util.Map;

public class Quarry extends Building {
    public Quarry(Map<ResourceType,Integer> constructionCost, Map<ResourceType,Integer> consumptionCost, Map<ResourceType,Integer> production) {
        super(2, 2, 2, 30,  constructionCost, consumptionCost, production, 2, 6);
    }
}
