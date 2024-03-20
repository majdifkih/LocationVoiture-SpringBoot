package com.example.tpjee.services.LocationService;

import com.example.tpjee.Entity.Location;
import com.example.tpjee.Entity.Modele;
import com.example.tpjee.repository.LocationRepository;
import com.example.tpjee.repository.Modele.ModeleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocationServiceImp implements LocationService{

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> getAllLocation(){
        return locationRepository.findAll();
    }
    @Override
    public Location createLocation(Location Location){
        return locationRepository.save(Location);
    }
    @Override
    public Location getLocationByID(Long id){
        return locationRepository.findById(id).get();
    }
    @Override
    public Location updateLocation(Location Location){
        return locationRepository.saveAndFlush(Location);
    }
    @Override
    public void deleteLocation(Long id){
        locationRepository.deleteById(id);
    }


}
