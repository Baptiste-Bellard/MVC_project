package controller;

import model.GameManager;
import model.Model;
import model.building.ApartmentBuilding.ApartmentBuildingFactory;
import model.building.Building;
import model.building.CementPlant.CementPlantFactory;
import model.building.Farm.FarmFactory;
import model.building.House.HouseFactory;
import model.building.LumberMill.LumberMillFactory;
import model.building.Quarry.QuarryFactory;
import model.building.SteelMill.SteelMillFactory;
import model.building.ToolFactory.ToolFactoryFactory;
import model.building.WoodenCabin.WoodenCabinFactory;
import model.map.Map;
import model.resource.Resource;
import view.View;
import view.ViewListener;

public class Controller {

    private View view;
    private Model model;
    private Map map;

    public Controller(View view, Model model, Map map) {
        this.view = view;
        this.model = model;
        this.map = map;

        view.setListener(new ViewListener() {
            @Override
            public void addWoodenCabinButtonClicked(int x, int y) {
                Building woodenCabin = new WoodenCabinFactory().createBuilding();
                model.getGameManager().addBuilding(woodenCabin, x, y);
                map.print();
                view.updateResourceDisplay(Resource.getInstance());
                view.placeBuildingOnGrid("file:src/main/java/view/Image/WoodenCabin.png", x, y, woodenCabin);
            }

            @Override
            public void addQuarryButtonClicked(int x, int y) {
                Building quarry = new QuarryFactory().createBuilding();
                model.getGameManager().addBuilding(quarry, x, y);
                map.print();
                view.updateResourceDisplay(Resource.getInstance());
                view.placeBuildingOnGrid("file:src/main/java/view/Image/Quarry.png", x, y, quarry);
            }

            @Override
            public void addToolFactoryButtonClicked(int x, int y) {
                Building toolFactory = new ToolFactoryFactory().createBuilding();
                model.getGameManager().addBuilding(toolFactory, x, y);
                map.print();
                view.updateResourceDisplay(Resource.getInstance());
                view.placeBuildingOnGrid("file:src/main/java/view/Image/ToolFactory.png", x, y, toolFactory);
            }

            @Override
            public void addApartmentButtonClicked(int x, int y) {
                Building apartmentBuilding = new ApartmentBuildingFactory().createBuilding();
                model.getGameManager().addBuilding(apartmentBuilding, x, y);
                map.print();
                view.updateResourceDisplay(Resource.getInstance());
                view.placeBuildingOnGrid("file:src/main/java/view/Image/Apartment.png", x, y, apartmentBuilding);
            }

            @Override
            public void addHouseButtonClicked(int x, int y) {
                Building house = new HouseFactory().createBuilding();
                model.getGameManager().addBuilding(house, x, y);
                map.print();
                view.updateResourceDisplay(Resource.getInstance());
                view.placeBuildingOnGrid("file:src/main/java/view/Image/House.png", x, y, house);
            }

            @Override
            public void addFarmButtonClicked(int x, int y) {
                Building farm = new FarmFactory().createBuilding();
                model.getGameManager().addBuilding(farm, x, y);
                map.print();
                view.updateResourceDisplay(Resource.getInstance());
                view.placeBuildingOnGrid("file:src/main/java/view/Image/Farm.png", x, y, farm);
            }

            @Override
            public void addLumberMillButtonClicked(int x, int y) {
                Building lumberMill = new LumberMillFactory().createBuilding();
                model.getGameManager().addBuilding(lumberMill, x, y);
                map.print();
                view.updateResourceDisplay(Resource.getInstance());
                view.placeBuildingOnGrid("file:src/main/java/view/Image/LumberMill.png", x, y, lumberMill);
            }

            @Override
            public void addSteelMillButtonClicked(int x, int y) {
                Building steelMill = new SteelMillFactory().createBuilding();
                model.getGameManager().addBuilding(steelMill, x, y);
                map.print();
                view.updateResourceDisplay(Resource.getInstance());
                view.placeBuildingOnGrid("file:src/main/java/view/Image/SteelMill.png", x, y, steelMill);
            }

            @Override
            public void addCementPlantButtonClicked(int x, int y) {
                Building cementPlant = new CementPlantFactory().createBuilding();
                model.getGameManager().addBuilding(cementPlant, x, y);
                map.print();
                view.updateResourceDisplay(Resource.getInstance());
                view.placeBuildingOnGrid("file:src/main/java/view/Image/CementPlant.png", x, y, cementPlant);
            }
        });

        view.updateResourceDisplay(Resource.getInstance());
        view.displayGameGrid(map);
    }
}