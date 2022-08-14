package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowCars {

    @GetMapping(value = "/car")
    public String showCar(HttpServletRequest request, ModelMap model) {
        int count = Integer.parseInt(request.getParameter("count"));
        CarServiceImp car = new CarServiceImp();
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ferrari", "F450", "Series 1"));
        cars.add(new Car("Tesla", "Model", "Series X"));
        cars.add(new Car("Ford", "Focus", "Series 2"));
        cars.add(new Car("Mazda", "RX", "Series 7"));
        cars.add(new Car("Mitsubishi", "Lancer Evo", "Series 9"));
        model.addAttribute("cars", car.listCars(cars,count));
        return "cars";
    }
}
