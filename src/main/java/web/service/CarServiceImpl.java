package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarListUpd(List<Car> carList, int count) {
        if (count >= 5)
            return carList;
        else
            return carList.stream().limit(count).toList();
    }

    @Override
    public List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "car1", "color1"));
        carList.add(new Car(2, "car2", "color2"));
        carList.add(new Car(3, "car3", "color3"));
        carList.add(new Car(4, "car4", "color4"));
        carList.add(new Car(5, "car5", "color5"));
        return carList;
    }
}
