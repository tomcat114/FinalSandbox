package Compareables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by rickx058 on 12/17/15.
 */
public class Car implements Comparable<Car> {

    public enum CarType{
        SUV,SEDAN,COUPE,TRUCK;
    }
    private String model = "";
    private String make = "";
    private int year;
    private int numPassengers;
    private CarType type = null;

    public Car(CarType type, String model, String make, int year, int numPassengers) {
        this.type = type;
        this.model = model;
        this.make = make;
        this.year = year;
        this.numPassengers = numPassengers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", numPassengers=" + numPassengers +
                ", type=" + type +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    //Default compare by Model name
    @Override
    public int compareTo(Car o) {
        return model.compareTo(o.getModel());
    }


    public static void main(String args[]){
        List<Car> carlist = new ArrayList<Car>();
        Car car1 = new Car(CarType.COUPE,"FRS","Scion",2013,4);
        Car car2 = new Car(CarType.SEDAN,"xB","Scion",2014,5);
        Car car3 = new Car(CarType.COUPE,"M4","BMW",2015,5);
        Car car4 = new Car(CarType.TRUCK,"1500","RAM",2012,4);
        Car car5 = new Car(CarType.COUPE,"RX-7","Mazda",1986,4);
        Car car6 = new Car(CarType.SUV,"Durango","Dodge",2002,8);

        carlist.add(car1);
        carlist.add(car2);
        carlist.add(car3);
        carlist.add(car4);
        carlist.add(car5);
        carlist.add(car6);

        Collections.sort(carlist,new CarCompareByYear());

        for(Car car : carlist){
            System.out.println(car);
        }
    }
}
