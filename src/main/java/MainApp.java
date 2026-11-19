import javafx.application.Application;
import javafx.stage.Stage;

import controller.Controller;
import model.GameManager;
import model.Model;
import model.map.Map;
import model.map.MapBuilder;
import view.View;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) {

        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.setSize(20, 15);
        mapBuilder.setResource();
        Map map = mapBuilder.build();

        View view = new View(stage);
        GameManager gameManager = new GameManager(map, view);
        Model model = new Model(gameManager);
        new Controller(view, model, map);
    }

}