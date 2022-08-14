package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> listCars (List<Car> list, int count) {
        if (count < 5) {
            return list.subList(0, count);
        } else return list;
    }
}
