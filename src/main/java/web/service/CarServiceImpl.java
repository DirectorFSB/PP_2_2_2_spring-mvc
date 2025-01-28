package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW","M5","a111aa777"));
        cars.add(new Car("Mersedes","w221","o111oo77"));
        cars.add(new Car("LADA","granta","h632sd977"));
        cars.add(new Car("Lexus","lx570","l777ex777"));
        cars.add(new Car("Lamborgini","aventador","q333qq77"));
        if ( count == null || count >= 5 ){ return cars; }
        return cars.subList( 0 , count);
    }
}
