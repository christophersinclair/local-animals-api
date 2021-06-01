package com.upendiproject.localanimalapi.dao;

import com.upendiproject.localanimalapi.model.Sighting;

public interface AddSightingDao {

    String addSighting = "INSERT INTO Sighting (id, animal_id, location_id, sighting_date, user_id, image_id) values (?, ?, ?, ?, ?, ?)";

    void addSighting(Sighting sighting);

}
