package edu.estatuas.furnace.devices;

import edu.estatuas.furnace.interfaces.Heater;
import edu.estatuas.furnace.miscelaneus.RoomTemperature;

public class GasHeater implements Heater {

    private double heaterPower = 1.0d;

    @Override
    public void engage(RoomTemperature temperature) {
        temperature.incrementTemperature(heaterPower);
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        temperature.incrementTemperature(-heaterPower);
    }
}
