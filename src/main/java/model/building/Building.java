package model.building;

import model.resource.Resource;
import model.resource.ResourceType;

import java.util.Map;

public abstract class Building {
    private int width;
    private int height;
    private int inhabitants;
    private int workers;
    private Map<ResourceType, Integer> constructionCost;
    private Map<ResourceType, Integer> consumptionCost;
    private Map<ResourceType, Integer> production;
    private int constructionTime;
    private int id;

    public Building(int width, int height, int inhabitants, int workers, Map<ResourceType, Integer> constructionCost, Map<ResourceType, Integer> consumptionCost, Map<ResourceType, Integer> production, int constructionTime, int id) {
        this.width = width;
        this.height = height;
        this.inhabitants = inhabitants;
        this.workers = workers;
        this.constructionCost = constructionCost;
        this.consumptionCost = consumptionCost;
        this.production = production;
        this.constructionTime = constructionTime;
        this.id = id;
    }

    public Map<ResourceType, Integer> getConstructionCost() {
        return constructionCost;
    }

    public Map<ResourceType, Integer> getConsumptionCost() {
        return consumptionCost;
    }

    public Map<ResourceType, Integer> getProduction() {
        return production;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public int getWorkers() {
        return workers;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getId() {
        return id;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public boolean hasEnoughResources() {
        Resource resource = Resource.getInstance();
        Map<ResourceType, Integer> constructionCost = getConstructionCost();

        for (Map.Entry<ResourceType, Integer> entry : constructionCost.entrySet()) {
            ResourceType type = entry.getKey();
            int required = entry.getValue();
            switch (type) {
                case WOOD:
                    if (resource.getWood().getQuantity() < required) return true;
                    break;
                case FOOD:
                    if (resource.getFood().getQuantity() < required) return true;
                    break;
                case COAL:
                    if (resource.getCoal().getQuantity() < required) return true;
                    break;
                case IRON:
                    if (resource.getIron().getQuantity() < required) return true;
                    break;
                case CEMENT:
                    if (resource.getCement().getQuantity() < required) return true;
                    break;
                case TOOLS:
                    if (resource.getTools().getQuantity() < required) return true;
                    break;
                case STEEL:
                    if (resource.getSteel().getQuantity() < required) return true;
                    break;
                case LUMBER:
                    if (resource.getLumber().getQuantity() < required) return true;
                    break;
                case STONE:
                    if (resource.getStone().getQuantity() < required) return true;
                    break;
            }
        }
        return false;
    }

    public void constructionCost(){
        if (hasEnoughResources()) {
            throw new IllegalArgumentException("Not enough resources");
        }

        Resource resource = Resource.getInstance();
        Map<ResourceType, Integer> constructionCost = getConstructionCost();

        constructionCost.forEach((type, value) -> {
            switch (type) {
                case WOOD:
                    resource.setWood(resource.getWood().getQuantity() - value);
                    break;
                case FOOD:
                    resource.setFood(resource.getFood().getQuantity() - value);
                    break;
                case COAL:
                    resource.setCoal(resource.getCoal().getQuantity() - value);
                    break;
                case IRON:
                    resource.setIron(resource.getIron().getQuantity() - value);
                    break;
                case CEMENT:
                    resource.setCement(resource.getCement().getQuantity() - value);
                    break;
                case TOOLS:
                    resource.setTools(resource.getTools().getQuantity() - value);
                    break;
                case STEEL:
                    resource.setSteel(resource.getSteel().getQuantity() - value);
                    break;
                case LUMBER:
                    resource.setLumber(resource.getLumber().getQuantity() - value);
                    break;
                case STONE:
                    resource.setStone(resource.getStone().getQuantity() - value);
                    break;
            }
        });
    }

    public void destructionCost(){
        Resource resource = Resource.getInstance();
        Map<ResourceType, Integer> constructionCost = getConstructionCost();

        constructionCost.forEach((type, value) -> {
            switch (type) {
                case WOOD:
                    resource.setWood(resource.getWood().getQuantity() + value);
                    break;
                case FOOD:
                    resource.setFood(resource.getFood().getQuantity() + value);
                    break;
                case COAL:
                    resource.setCoal(resource.getCoal().getQuantity() + value);
                    break;
                case IRON:
                    resource.setIron(resource.getIron().getQuantity() + value);
                    break;
                case CEMENT:
                    resource.setCement(resource.getCement().getQuantity() + value);
                    break;
                case TOOLS:
                    resource.setTools(resource.getTools().getQuantity() + value);
                    break;
                case STEEL:
                    resource.setSteel(resource.getSteel().getQuantity() + value);
                    break;
                case LUMBER:
                    resource.setLumber(resource.getLumber().getQuantity() + value);
                    break;
                case STONE:
                    resource.setStone(resource.getStone().getQuantity() + value);
                    break;
            }
        });
    }

    public void produce(){
        Resource resource = Resource.getInstance();
        Map<ResourceType, Integer> production = getProduction();

        production.forEach((type, value) -> {
            switch (type) {
                case WOOD:
                    resource.setWood(resource.getWood().getQuantity() + value);
                    break;
                case FOOD:
                    resource.setFood(resource.getFood().getQuantity() + value);
                    break;
                case COAL:
                    resource.setCoal(resource.getCoal().getQuantity() + value);
                    break;
                case IRON:
                    resource.setIron(resource.getIron().getQuantity() + value);
                    break;
                case CEMENT:
                    resource.setCement(resource.getCement().getQuantity() + value);
                    break;
                case TOOLS:
                    resource.setTools(resource.getTools().getQuantity() + value);
                    break;
                case STEEL:
                    resource.setSteel(resource.getSteel().getQuantity() + value);
                    break;
                case LUMBER:
                    resource.setLumber(resource.getLumber().getQuantity() + value);
                    break;
                case STONE:
                    resource.setStone(resource.getStone().getQuantity() + value);
                    break;
            }
        });
    }

    public void consume(){
        if (hasEnoughResources()) {
            throw new IllegalArgumentException("Not enough resources");
        }

        Resource resource = Resource.getInstance();
        Map<ResourceType, Integer> consumptionCost = getConsumptionCost();

        consumptionCost.forEach((type, value) -> {
                switch (type) {
                    case WOOD:
                        resource.setWood(resource.getWood().getQuantity() - value);
                        break;
                    case FOOD:
                        resource.setFood(resource.getFood().getQuantity() - value);
                        break;
                    case COAL:
                        resource.setCoal(resource.getCoal().getQuantity() - value);
                        break;
                    case IRON:
                        resource.setIron(resource.getIron().getQuantity() - value);
                        break;
                    case CEMENT:
                        resource.setCement(resource.getCement().getQuantity() - value);
                        break;
                    case TOOLS:
                        resource.setTools(resource.getTools().getQuantity() - value);
                        break;
                    case STEEL:
                        resource.setSteel(resource.getSteel().getQuantity() - value);
                        break;
                    case LUMBER:
                        resource.setLumber(resource.getLumber().getQuantity() - value);
                        break;
                    case STONE:
                        resource.setStone(resource.getStone().getQuantity() - value);
                        break;
                }
            });
        resource.setFood(resource.getFood().getQuantity() - getInhabitants());
        resource.setFood(resource.getFood().getQuantity() - getWorkers());
    }

    public int getConstructionTime() {
        return constructionTime;
    }
}
