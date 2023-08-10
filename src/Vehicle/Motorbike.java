package Vehicle;

import java.util.ArrayList;

public abstract class Motorbike extends Vehicle{
    private String model;
    private int price;
    private boolean seatHeating;
    private boolean abs;
    private ArrayList<String> options;

    public Motorbike() {
        this.model = model;
        this.price = price;
        this.seatHeating = seatHeating;
        this.abs = abs;
        this.options = new ArrayList<String>();
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price += price;
    }

    public boolean isSeatHeating() {
        return seatHeating;
    }

    public void setSeatHeating(boolean seatHeating) {
        if (seatHeating == true){
            this.setPrice(2000);
            this.options.add("Seat Heating");
        }
        this.seatHeating = seatHeating;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        if (abs == true){
            this.setPrice(5000);
            this.options.add("ABS");

        }
        this.abs = abs;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    @Override
    public int cost() {
        return this.getPrice();
    }

    @Override
    public String toString() {
        String opt ="";
        for (String str: this.getOptions())
            opt +=" " + str+",";
        opt = opt.substring(0, opt.length()-1);

        if (!this.getOptions().isEmpty())

            return this.getModel() +" with"+ opt + " having a total price of " + this.cost() + " TL";
        else
            return this.getModel() + " having a total price of " + this.cost() + " TL";
    }
}
