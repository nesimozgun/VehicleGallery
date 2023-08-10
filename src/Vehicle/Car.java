package Vehicle;

import java.util.ArrayList;

public abstract class Car extends Vehicle{
    private String model;
    private int price;
    private boolean abs;
    private boolean sunroof;
    private boolean musicSystem;
    private boolean airBag;
    private ArrayList<String> options;

    public Car() {
        this.model = model;
        this.price = price;
        this.abs = abs;
        this.sunroof = sunroof;
        this.musicSystem = musicSystem;
        this.airBag = airBag;
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

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        if (sunroof == true){
            this.setPrice(2000);
            this.options.add("sunroof");

        }
        this.sunroof = sunroof;
    }

    public boolean isMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(boolean musicSystem) {
        if (musicSystem == true){
            this.setPrice(1000);
            this.options.add("Music System");

        }
        this.musicSystem = musicSystem;
    }

    public boolean isAirBag() {
        return airBag;
    }

    public void setAirBag(boolean airBag) {
        if (airBag == true){
            this.setPrice(3000);
            this.options.add("Airbag");

        }
        this.airBag = airBag;
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
