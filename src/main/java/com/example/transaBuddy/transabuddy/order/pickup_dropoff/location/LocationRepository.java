package com.example.transaBuddy.transabuddy.order.pickup_dropoff.location;

import com.example.transaBuddy.temp.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    @Query("select l from Location l where l.id = ?1")
    Location findLocationById(Integer id);


}