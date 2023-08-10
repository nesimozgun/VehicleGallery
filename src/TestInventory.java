import Cars.Sity;
import Cars.Sivic;
import Inventory.Inventor;
import Motorbikes.Racer;
import Motorbikes.Scooter;
import Vehicle.Car;
import Vehicle.Motorbike;
import Vehicle.Vehicle;

public class TestInventory {
    public static void main(String[] args) {
        Inventor inventory = new Inventor();


        Car car = new Sivic();
        car.setAbs(true);
        car.setMusicSystem(true);
        car.setAirBag(true);
        inventory.getInventory().add(car);

        car = new Sivic();
        car.setAbs(true);
        car.setSunroof(true);
        inventory.getInventory().add(car);

        car = new Sity();
        car.setMusicSystem(true);
        car.setSunroof(true);
        inventory.getInventory().add(car);

        Motorbike motorbike = new Racer();
        motorbike.setAbs(true);
        motorbike.setSeatHeating(true);
        inventory.getInventory().add(motorbike);

        motorbike = new Scooter();
        motorbike.setSeatHeating(true);
        inventory.getInventory().add(motorbike);




        int carCounter = 0;
        int motorBikeCounter = 0;
        int totalPriceInventory = 0;

        for (Vehicle vehicle : inventory.getInventory()){
            if (vehicle instanceof  Car){
                carCounter++;
                totalPriceInventory += vehicle.cost();
            }


            else{
                motorBikeCounter++;
                totalPriceInventory += vehicle.cost();
            }
        }

        for (Vehicle vehicle : inventory.getInventory()){
            System.out.println(vehicle.toString());
        }
        System.out.println("TOTAL: "+ (carCounter+motorBikeCounter) +" Vehicles including " + carCounter + " Cars " + motorBikeCounter +" Motorbikes having a total price of " + totalPriceInventory +" TL");
    }
}
