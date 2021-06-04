package com.upendiproject.localanimalapi.controller;

import com.upendiproject.localanimalapi.model.Animal;
import com.upendiproject.localanimalapi.model.Sighting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LocalAnimalController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(LocalAnimalController.class);


    @GetMapping("/localanimals")
    public @ResponseBody List<Animal> localAnimals() {
        Animal testAnimal = new Animal();
        testAnimal.setDescription("Lion");
        testAnimal.setHabitat("Africa");
        List<Animal> testAnimalList = new ArrayList<>();
        testAnimalList.add(testAnimal);
        return testAnimalList;
    }

    @GetMapping("/localsightings")
    public @ResponseBody List<Sighting> localSightings() {
        return new ArrayList<Sighting>();
    }



    /* Need controllers for:
    /add/animal
    /add/location
    /find/animal
    /find/location
     */

}
