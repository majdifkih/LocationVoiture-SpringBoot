package com.example.tpjee.services.LocationService;

import com.example.tpjee.Entity.Location;


import java.util.List;

public interface LocationService {

    List<Location> getAllLocation();

    Location createLocation(Location location);

    Location getLocationByID(Long id);

    Location updateLocation(Location location);

    void deleteLocation(Long id);
}
