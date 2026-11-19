package model.building.House;

import model.building.Building;
import model.resource.ResourceType;

import java.util.Map;

public class House extends Building {
    public House(Map<ResourceType,Integer> constructionCost, Map<ResourceType,Integer> consumptionCost, Map<ResourceType,Integer> production) {
        super(2, 2, 4, 0, constructionCost, consumptionCost, production, 4, 4);
    }
}
