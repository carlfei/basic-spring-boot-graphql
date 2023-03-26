package com.graphql.demo.resolver;
import com.graphql.demo.repository.CarRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.demo.dto.Car;

public class Query implements GraphQLQueryResolver {

    private CarRepository carRepository;

    public Query(CarRepository carRepository){
        this.carRepository=carRepository;
    }

    public Iterable<Car> findAllCars(){
        return carRepository.findAll();
    }
    public Long countCars() {
        return carRepository.count();
    }
}
