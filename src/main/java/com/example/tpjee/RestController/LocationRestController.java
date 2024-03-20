package com.example.tpjee.RestController;

import com.example.tpjee.Entity.Location;
import com.example.tpjee.services.LocationService.LocationServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationRestController {
    @Autowired
    private LocationServiceImp locationServiceImp;
    @PostMapping("/locationsave")
    public Location saveLocation(@RequestBody Location location){
        return locationServiceImp.createLocation(location);
    }
    @GetMapping("/listlocation")
    public List<Location> listelocation(){
        return locationServiceImp.getAllLocation();
    }

    @GetMapping("/onelocation/{id}")
    public Location getOneLocation(@PathVariable long id){
        return locationServiceImp.getLocationByID(id);
    }
    @PutMapping("/updatelocation/{id}")
    public Location updateLocation(@PathVariable long id,@RequestBody Location location){
        Location l = locationServiceImp.getLocationByID(id);
        if(l!=null) {
            location.setId(id);
            return locationServiceImp.updateLocation(location);
        }else {
            throw new RuntimeException("failed");
        }
    }
    @DeleteMapping("/deletelocation/{id}")
    public HashMap<String,String> deleteLocation(@PathVariable long id){
        HashMap<String,String> message= new HashMap<>();
        if(locationServiceImp.getLocationByID(id)==null){
            message.put("etat","Location not found");
            return message;
        }
        try{
            locationServiceImp.deleteLocation(id);
            message.put("etat","Location deleted");
            return message;
        }catch (Exception e){
            message.put("etat","Location not deleted");
            return message;
        }
    }
}
