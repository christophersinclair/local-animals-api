package com.upendiproject.localanimalapi.controller;

import com.upendiproject.localanimalapi.model.Sighting;
import com.upendiproject.localanimalapi.service.AddSightingService;
import com.upendiproject.localanimalapi.service.RetrieveSightingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@Controller
public class SightingController {

    private static final Logger logger = LoggerFactory.getLogger(SightingController.class);

    @Autowired
    private AddSightingService addSightingService;

    @Autowired
    RetrieveSightingService retrieveSightingService;

    @GetMapping("/api/find/sighting")
    public @ResponseBody
    Sighting findSighting(@RequestParam("id") Long sightingID) {
        return retrieveSightingService.getSightingFromDB(sightingID);
    }

    @PostMapping("/api/add/sighting")
    public @ResponseBody
    ResponseEntity<String> addSighting(@RequestBody Sighting sighting) {
        if (addSightingService.isValidSighting(sighting)) {
            addSightingService.addSighting(sighting);
            logger.info("Added sighting " + sighting.toString());
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        logger.error("Bad sighting add request - POST failed");
        return new ResponseEntity<>("Sighting add request failed", HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public @ResponseBody String handleMissingParams(MissingServletRequestParameterException ex) {
        String name = ex.getParameterName();
        logger.error("Parameter is missing from request: " + name);
        return "Parameter is missing from request: '" + name + "'";
    }

}
