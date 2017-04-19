package by.bsuir.client.controller;

import by.bsuir.common.model.Aviatour;
import by.bsuir.common.service.IAviatourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AviatourController {
    @Autowired
    private IAviatourService aviatourService;

    @RequestMapping(value = {"/aviatour/{id}"}, method = RequestMethod.GET)
    public Aviatour getAviatour(@PathVariable("id") Long id){
        return aviatourService.getAviatour(id);
    }

    @RequestMapping(value = {"/accesible_aviatours"}, method = RequestMethod.GET)
    public List<Aviatour> getAccessibleAviatours(){
        return aviatourService.getAccessibleAviatours();
    }
}
