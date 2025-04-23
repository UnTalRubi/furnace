package edu.estatuas.furnace;

import edu.estatuas.furnace.miscelaneus.RoomTemperature;

public class App {
    public static void main(String[] args) {
        final double MIN_TEMP = 15.0d;
        final double MAX_TEMP = 21.0d;

        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(17);
    }
}
