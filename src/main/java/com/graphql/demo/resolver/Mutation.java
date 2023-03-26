package com.graphql.demo.resolver;
import com.graphql.demo.repository.CarRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.demo.dto.Car;

public class Mutation implements GraphQLMutationResolver {

    private CarRepository carRepository;

    public Mutation(CarRepository carRepository){
        this.carRepository=carRepository;
    }

    public Car newCar(String model, String year){
        Car car = new Car();
        car.setId(carRepository.getListCarId());
        car.setModel(model);
        car.setYear(year);
        carRepository.save(car);
        return car;

    }
}
