package model.resource;

public class Resource {
    private static Resource instance;

    private final Food food;
    private final Wood wood;
    private final Stone stone;
    private final Iron iron;
    private final Steel steel;
    private final Cement cement;
    private final Lumber lumber;
    private final Tools tools;
    private final Coal coal;

    private Resource() {
        food = new Food(200);
        wood = new Wood(200);
        stone = new Stone(200);
        iron = new Iron(0);
        steel = new Steel(0);
        cement = new Cement(0);
        lumber = new Lumber(0);
        tools = new Tools(0);
        coal = new Coal(0);
    }

    public static Resource getInstance() {
        if (instance == null) {
            instance = new Resource();
        }
        return instance;
    }

    // Add getters for each resource
    public Food getFood() {
        return food;
    }

    public Wood getWood() {
        return wood;
    }

    public Stone getStone() {
        return stone;
    }

    public Iron getIron() {
        return iron;
    }

    public Steel getSteel() {
        return steel;
    }

    public Cement getCement() {
        return cement;
    }

    public Lumber getLumber() {
        return lumber;
    }

    public Tools getTools() {
        return tools;
    }

    public Coal getCoal() { return coal;}

    // Add setters for each resource
    public void setFood(int quantity) {
        food.setQuantity(quantity);
    }

    public void setWood(int quantity) {
        wood.setQuantity(quantity);
    }

    public void setStone(int quantity) {
        stone.setQuantity(quantity);
    }

    public void setIron(int quantity) {
        iron.setQuantity(quantity);
    }

    public void setSteel(int quantity) {
        steel.setQuantity(quantity);
    }

    public void setCement(int quantity) {
        cement.setQuantity(quantity);
    }

    public void setLumber(int quantity) {
        lumber.setQuantity(quantity);
    }

    public void setTools(int quantity) {
        tools.setQuantity(quantity);
    }

    public void setCoal(int quantity) { coal.setQuantity(quantity); }
}