package com.tusaryan.project.uber.uberApp.strategies;

import com.tusaryan.project.uber.uberApp.entities.Driver;
import com.tusaryan.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
