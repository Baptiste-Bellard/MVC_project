package model.map;

import model.resource.Resource;

public class MapBuilder {
    private final Map map;

    public MapBuilder() {
        this.map = Map.getInstance();
    }

    public void setSize(int width, int height) {
        map.setWidth(width);
        map.setHeight(height);
    }

    public void setResource(){
        Resource resource = Resource.getInstance();
        resource.setWood(200);
        resource.setFood(200);
        resource.setCoal(200);
        resource.setIron(200);
        resource.setCement(200);
        resource.setTools(200);
        resource.setSteel(200);
        resource.setLumber(200);
        resource.setStone(200);
    }

    public Map build() {
        return map;
    }
}
