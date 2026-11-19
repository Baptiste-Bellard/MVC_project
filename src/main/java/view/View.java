package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.building.Building;
import model.map.Map;
import model.resource.Resource;
import model.GameManager;

public class View {

    private final Label label;
    private final VBox vBox;
    private int CellSize = 40;
    private final VBox resourceBox;
    private ViewListener listener;
    private final GridPane gridPane;
    private final TextField xCoordinate;
    private final TextField yCoordinate;

    public View(Stage stage) {

        stage.setTitle("LA LOW TECH");
        vBox = new VBox();
        vBox.setAlignment(Pos.TOP_LEFT);
        vBox.setSpacing(8);

        label = new Label("Select an action");
        label.setFont(new Font("Arial", 24));
        vBox.getChildren().add(label);

        gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(0);
        gridPane.setVgap(0);
        VBox.setMargin(gridPane, new Insets(10, 10, 10, 10));

        xCoordinate = new TextField();
        yCoordinate = new TextField();

        HBox coordinateBox = new HBox(10, new Label("X :"), xCoordinate, new Label("Y : "), yCoordinate);

        Button addWoodenCabinButton = new Button("Add Wooden Cabin");
        Button addQuarryButton = new Button("Add Quarry");
        Button addToolFactoryButton = new Button("Add Tool Factory");
        Button addApartmentButton = new Button("Add Apartment");
        Button addHouseButton = new Button("Add House");
        Button addFarmButton = new Button("Add Farm");
        Button addLumberMillButton = new Button("Add Lumber Mill");
        Button addCementPlantButton = new Button("Add Cement Plant");
        Button addSteelMillButton = new Button("Add Steel Mill");

        VBox buttonBox = new VBox(10, addWoodenCabinButton, addQuarryButton, addToolFactoryButton, addApartmentButton, addHouseButton, addFarmButton, addLumberMillButton, addCementPlantButton, addSteelMillButton);
        buttonBox.setAlignment(Pos.TOP_LEFT);
        VBox.setMargin(buttonBox, new Insets(10, 10, 10, 10));

        resourceBox = new VBox();
        resourceBox.setSpacing(8);
        resourceBox.setAlignment(Pos.CENTER);
        VBox.setMargin(resourceBox, new Insets(10, 10, 10, 10));

        HBox mainBox = new HBox(10, buttonBox, gridPane, resourceBox);
        mainBox.setAlignment(Pos.CENTER);

        vBox.getChildren().addAll(coordinateBox, mainBox);

        // Pour chaque bouton, on associe la création de son batiment aux coordonnées spécifiées
        addWoodenCabinButton.setOnAction(e -> {
            if (listener != null) {
                int x = Integer.parseInt(xCoordinate.getText());
                int y = Integer.parseInt(yCoordinate.getText());
                listener.addWoodenCabinButtonClicked(x, y);
            }
        });

        addQuarryButton.setOnAction(e -> {
            if (listener != null) {
                int x = Integer.parseInt(xCoordinate.getText());
                int y = Integer.parseInt(yCoordinate.getText());
                listener.addQuarryButtonClicked(x, y);
            }
        });

        addToolFactoryButton.setOnAction(e -> {
            if (listener != null) {
                int x = Integer.parseInt(xCoordinate.getText());
                int y = Integer.parseInt(yCoordinate.getText());
                listener.addToolFactoryButtonClicked(x, y);
            }
        });

        addApartmentButton.setOnAction(e -> {
            if (listener != null) {
                int x = Integer.parseInt(xCoordinate.getText());
                int y = Integer.parseInt(yCoordinate.getText());
                listener.addApartmentButtonClicked(x, y);
            }
        });

        addHouseButton.setOnAction(e -> {
            if (listener != null) {
                int x = Integer.parseInt(xCoordinate.getText());
                int y = Integer.parseInt(yCoordinate.getText());
                listener.addHouseButtonClicked(x, y);
            }
        });

        addFarmButton.setOnAction(e -> {
            if (listener != null) {
                int x = Integer.parseInt(xCoordinate.getText());
                int y = Integer.parseInt(yCoordinate.getText());
                listener.addFarmButtonClicked(x, y);
            }
        });

        addLumberMillButton.setOnAction(e -> {
            if (listener != null) {
                int x = Integer.parseInt(xCoordinate.getText());
                int y = Integer.parseInt(yCoordinate.getText());
                listener.addLumberMillButtonClicked(x, y);
            }
        });

        addCementPlantButton.setOnAction(e -> {
            if (listener != null) {
                int x = Integer.parseInt(xCoordinate.getText());
                int y = Integer.parseInt(yCoordinate.getText());
                listener.addCementPlantButtonClicked(x, y);
            }
        });

        addSteelMillButton.setOnAction(e -> {
            if (listener != null) {
                int x = Integer.parseInt(xCoordinate.getText());
                int y = Integer.parseInt(yCoordinate.getText());
                listener.addSteelMillButtonClicked(x, y);
            }
        });

        Scene scene = new Scene(vBox, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public void setListener(ViewListener listener) {
        this.listener = listener;
    }

    public void updateResourceDisplay(Resource resource) {
        resourceBox.getChildren().clear();
        addResourceToBox("Day", GameManager.getDay(), "file:src/main/java/view/Image/Day.png");
        addResourceToBox("Food", resource.getFood().getQuantity(), "file:src/main/java/view/Image/Food.png");
        addResourceToBox("Wood", resource.getWood().getQuantity(), "file:src/main/java/view/Image/Wood.png");
        addResourceToBox("Steel", resource.getSteel().getQuantity(), "file:src/main/java/view/Image/Steel.png");
        addResourceToBox("Iron", resource.getIron().getQuantity(), "file:src/main/java/view/Image/Iron.png");
        addResourceToBox("Stone", resource.getStone().getQuantity(), "file:src/main/java/view/Image/Stone.png");
        addResourceToBox("Coal", resource.getCoal().getQuantity(), "file:src/main/java/view/Image/Coal.png");
        addResourceToBox("Cement", resource.getCement().getQuantity(), "file:src/main/java/view/Image/Cement.png");
        addResourceToBox("Lumber", resource.getLumber().getQuantity(), "file:src/main/java/view/Image/Lumber.png");
        addResourceToBox("Tools", resource.getTools().getQuantity(), "file:src/main/java/view/Image/Tools.png");
    }

    private void addResourceToBox(String resourceName, int quantity, String imagePath) {
        Image image = new Image(imagePath);
        if (image.isError()) {
            System.out.println("Error loading image: " + imagePath);
            return;
        }

        // Affichage de l'image de la ressource
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(CellSize);
        imageView.setFitWidth(CellSize);

        // Affichage de la quantité de ressources
        Label label = new Label(String.valueOf(quantity));
        label.setAlignment(Pos.CENTER);
        if (quantity < 0) {
            label.setStyle("-fx-text-fill: red;");
        }

        VBox vBox = new VBox(imageView, label);
        vBox.setAlignment(Pos.CENTER);

        resourceBox.getChildren().add(vBox);
    }

    public void displayGameGrid(Map map) {
        gridPane.getChildren().clear();

        Image image = new Image("file:src/main/java/view/Image/Grass.jpg");
        if (image.isError()) {
            System.out.println("Error loading image: " + "file:src/main/java/view/Image/Grass.jpg");
            return;
        }
        for (int row = 0; row < map.getHeight(); row++) {
            for (int col = 0; col < map.getWidth(); col++) {
                ImageView imageView = new ImageView(image);
                imageView.setFitHeight(CellSize);
                imageView.setFitWidth(CellSize);
                gridPane.add(imageView, col, row);
            }
        }
    }

    public void placeBuildingOnGrid(String imagePath, int x, int y, Building building) {
        // Vérification de l'existence de l'image
        Image image = new Image(imagePath);
        if (image.isError()) {
            System.out.println("Error loading image: " + imagePath);
            return;
        }

        int startDay = GameManager.getDay();
        int endDay = startDay + building.getConstructionTime();

        drawBuilding("file:src/main/java/view/Image/Time.png", x, y, building);
        while(startDay < endDay) {
            startDay ++;
        }
        drawBuilding(imagePath, x, y, building);


    }

    public void drawBuilding(String imagePath, int x, int y, Building building) {
        Image image = new Image(imagePath);
        for (int row = x; row < x + building.getHeight(); row++) {
            for (int col = y; col < y + building.getWidth(); col++) {
                int finalRow = row;
                int finalCol = col;
                gridPane.getChildren().removeIf(node -> GridPane.getRowIndex(node) == finalRow && GridPane.getColumnIndex(node) == finalCol);
            }
        }
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(CellSize*building.getHeight());
        imageView.setFitWidth(CellSize*building.getWidth());
        gridPane.add(imageView, y, x);
        GridPane.setColumnSpan(imageView, building.getWidth());
        GridPane.setRowSpan(imageView, building.getHeight());
    }
}