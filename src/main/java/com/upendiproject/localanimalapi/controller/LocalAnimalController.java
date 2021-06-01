package com.upendiproject.localanimalapi.controller;

import com.upendiproject.localanimalapi.model.Animal;
import com.upendiproject.localanimalapi.model.Sighting;
import com.upendiproject.localanimalapi.service.AddSightingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LocalAnimalController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(LocalAnimalController.class);

    @Autowired
    private AddSightingService addSightingService;

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

    @PostMapping("/add/sighting")
    public @ResponseBody ResponseEntity<String> addSighting(@RequestBody Sighting sighting) {
        if (addSightingService.isValidSighting(sighting)) {
            addSightingService.addSighting(sighting);
            logger.info("Added sighting " + sighting.toString());
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        logger.error("Bad sighting add request - POST failed");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

    }

}
