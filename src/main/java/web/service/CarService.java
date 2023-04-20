package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarListUpd(List<Car> carList, int count);
    List<Car> getCarList();
}
