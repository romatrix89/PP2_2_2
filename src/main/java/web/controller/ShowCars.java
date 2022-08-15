package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarServiceImp;
import javax.servlet.http.HttpServletRequest;


@Controller
public class ShowCars {

    @GetMapping(value = "/car")
    public String showCar(HttpServletRequest request, ModelMap model) {
        CarServiceImp car = new CarServiceImp();
        model.addAttribute("cars", car.listCars(Integer.parseInt(request.getParameter("count"))));
        return "cars";
    }
}
