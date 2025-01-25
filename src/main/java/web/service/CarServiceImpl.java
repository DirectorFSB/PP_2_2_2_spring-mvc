package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCars(Integer count,List<Car> cars) {
        if (count == null|| count>=5){return cars;}
        return cars.subList(0,count);
    }
}
