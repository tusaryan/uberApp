package com.tusaryan.project.uber.uberApp.services;

import com.tusaryan.project.uber.uberApp.dto.DriverDto;
import com.tusaryan.project.uber.uberApp.dto.RideDto;
import com.tusaryan.project.uber.uberApp.dto.RiderDto;
import com.tusaryan.project.uber.uberApp.entities.Driver;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DriverService {

    RideDto acceptRide(Long rideRequestId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId, String otp);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Driver getCurrentDriver();

    Driver updateDriverAvailability(Driver driver, boolean available);

    Driver createNewDriver(Driver driver);
}
