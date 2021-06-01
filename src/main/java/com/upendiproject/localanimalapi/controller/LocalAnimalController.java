package com.upendiproject.localanimalapi.controller;

import com.upendiproject.localanimalapi.model.Animal;
import com.upendiproject.localanimalapi.model.Sighting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

public class LocalAnimalController extends BaseController {

    @GetMapping("/localanimals")
    public @ResponseBody List<Animal> localAnimals() {
        return new ArrayList<Animal>();
    }

    @GetMapping("/localsightings")
    public @ResponseBody List<Sighting> localSightings() {
        return new ArrayList<Sighting>();
    }

}
