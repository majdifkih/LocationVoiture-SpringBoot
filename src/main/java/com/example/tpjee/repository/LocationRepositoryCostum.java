package com.example.tpjee.repository;

import com.example.tpjee.Entity.Location;

import java.util.Date;

public interface LocationRepositoryCostum {
    Location getLocationByClient(long client_id);
}
