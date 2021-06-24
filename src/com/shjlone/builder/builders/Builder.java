package com.shjlone.builder.builders;

import com.shjlone.builder.cars.CarType;
import com.shjlone.builder.components.Engine;
import com.shjlone.builder.components.GPSNavigator;
import com.shjlone.builder.components.Transmission;
import com.shjlone.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
