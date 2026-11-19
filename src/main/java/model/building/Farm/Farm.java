package model.building.Farm;

import model.building.Building;
import model.resource.ResourceType;

import java.util.Map;

public class Farm extends Building {
    public Farm(Map<ResourceType,Integer> constructionCost, Map<ResourceType,Integer> consumptionCost, Map<ResourceType,Integer> production) {
        super(3, 3, 5, 3, constructionCost, consumptionCost, production, 2, 3);
    }
}
