package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> listCar;

    public CarServiceImp() {
        listCar = new ArrayList<>();
        listCar.add(new Car("Ferrari", "F450", "Series 1"));
        listCar.add(new Car("Tesla", "Model", "Series X"));
        listCar.add(new Car("Ford", "Focus", "Series 2"));
        listCar.add(new Car("Mazda", "RX", "Series 7"));
        listCar.add(new Car("Mitsubishi", "Lancer Evo", "Series 9"));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count < 5) {
            return listCar.subList(0, count);
        } else return listCar;
    }
}
