package edu.estatuas.furnace.interfaces;

import edu.estatuas.furnace.miscelaneus.RoomTemperature;

public interface Heater {
    void engage(RoomTemperature temperature);

    void disengage(RoomTemperature temperature);
}
