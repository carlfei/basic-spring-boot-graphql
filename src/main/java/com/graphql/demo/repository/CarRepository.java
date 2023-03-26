package com.graphql.demo.repository;

import com.graphql.demo.dto.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarRepository {

    List<Car> listCar = new ArrayList<>();

    public CarRepository(){
        creatorCar();
    }
    public void creatorCar(){
        listCar.add(new Car(1l,"car-mod","car-year"));
    }
    public long count() {
        return listCar.size();
    }
    public long getListCarId(){

        return ((long) listCar.size()+1);
    }
    public void save(Car car) {
        listCar.add(car);
    }
    public Iterable<Car> findAll(){
        listCar.add(new Car(getListCarId(),"car-mod","car-year"));
        return listCar;
    }

}
