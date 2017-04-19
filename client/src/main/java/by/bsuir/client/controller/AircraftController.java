package by.bsuir.client.controller;

import by.bsuir.common.model.Aircraft;
import by.bsuir.common.service.IAircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AircraftController {
    @Autowired
    private IAircraftService aircraftService;

    @RequestMapping(value = {"/aircraft/{id}"}, method = RequestMethod.GET)
    public Aircraft getAircraftById(@PathVariable("id") long id){
        return aircraftService.getAircraftById(id);
    }
}
