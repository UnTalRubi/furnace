package edu.estatuas.furnace.devices;

import edu.estatuas.furnace.interfaces.Heater;
import edu.estatuas.furnace.miscelaneus.RoomTemperature;

public class Jedi implements Heater {

    private String name;

    public Jedi(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("\n"
                + "\t  __.-._   \n"
                + "\t  '-._\"7' \n"
                + "\t   /'.-c   \n"
                + "\t   |  /T   \n"
                + "\t  _)_/LI   \n"
                + "\nDo or do not. There is no try "
                + "\n" + this.name);
    }

    private double lightSaber() {
        final double lightSaberTemp = 1400.d;
        return lightSaberTemp;
    }

    private void forcePersuasion(RoomTemperature temperature) {
        temperature.incrementTemperature(-1400);
    }

    @Override
    public void engage(RoomTemperature temperature) {
        temperature.incrementTemperature(lightSaber());
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        this.forcePersuasion(temperature);
    }
}
