package Inventory;

import Vehicle.Vehicle;

import java.util.ArrayList;

public class Inventor {
    private ArrayList<Vehicle> inventory;

    public Inventor() {
        this.inventory = new ArrayList<Vehicle>();
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }
}
