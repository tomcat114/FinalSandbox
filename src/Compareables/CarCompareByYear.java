package Compareables;

import java.util.Comparator;

/**
 * Created by rickx058 on 12/17/15.
 */
public class CarCompareByYear implements Comparator<Car> {

    @Override
    public int compare(Car car, Car t1) {
        return ((Integer)t1.getYear()).compareTo(((Integer)car.getYear()));
    }
}
