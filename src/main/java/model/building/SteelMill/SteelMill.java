package model.building.SteelMill;

import model.building.Building;
import model.resource.Resource;
import model.resource.ResourceType;

import java.util.Map;


public class SteelMill extends Building{
    public SteelMill(Map<ResourceType,Integer> constructionCost, Map<ResourceType,Integer> consumptionCost, Map<ResourceType,Integer> production) {
        super(4, 3, 0, 40,  constructionCost, consumptionCost, production, 6, 7);
    }
}
