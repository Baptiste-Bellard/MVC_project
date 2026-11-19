package model.building.ApartmentBuilding;

import model.building.Building;
import model.resource.ResourceType;

import java.util.Map;

public class AparmentBuilding extends Building {
    public AparmentBuilding(Map<ResourceType,Integer> constructionCost, Map<ResourceType,Integer> consumptionCost, Map<ResourceType,Integer> production) {
        super(3, 2, 60, 0, constructionCost, consumptionCost, production, 6, 1);
    }
}
