package com.graphql.demo.resolver;
import com.graphql.demo.repository.CarRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.demo.dto.Car;

public class CarResolver implements GraphQLResolver<Car> {

    private CarRepository carRepository;

    public CarResolver(CarRepository carRepository){
        this.carRepository=carRepository;
    }

}
