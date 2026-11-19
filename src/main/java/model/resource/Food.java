package model.resource;

public class Food {

    private int quantity;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return "Food quantity: " + quantity;
    }
}
