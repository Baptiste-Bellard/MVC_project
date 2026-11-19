package model.building.WoodenCabin;

import model.building.Building;
import model.resource.Resource;
import model.resource.ResourceType;

import java.util.Map;

public class WoodenCabin extends Building {
    public WoodenCabin(Map<ResourceType,Integer> constructionCost, Map<ResourceType,Integer> consumptionCost, Map<ResourceType,Integer> production) {
        super(1, 1, 2, 2,  constructionCost, consumptionCost, production, 2, 9);
    }
}
