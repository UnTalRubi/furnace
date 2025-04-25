package edu.estatuas.furnace;

import edu.estatuas.furnace.devices.GasHeater;
import edu.estatuas.furnace.devices.Controller;
import edu.estatuas.furnace.devices.Sensor;
import edu.estatuas.furnace.devices.Jedi;
import edu.estatuas.furnace.interfaces.Heater;
import edu.estatuas.furnace.interfaces.Thermometer;
import edu.estatuas.furnace.miscelaneus.RoomTemperature;

public class App {
    public static void main(String[] args) {
        final double MIN_TEMP = 15.0d;
        final double MAX_TEMP = 21.0d;

        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(17);
        Heater heater = new GasHeater();
        Thermometer thermometer = new Sensor();

        Controller regulator = new Controller();

        System.out.println("Starting...");
        regulator.regulate(thermometer, heater, MIN_TEMP, MAX_TEMP, temperature);

        temperature = RoomTemperature.getInstance();
        Jedi yoda = new Jedi("Yoda");
        System.out.println("\nYoda shows up: ");
        regulator.regulate(thermometer, yoda, MIN_TEMP, MAX_TEMP, temperature);
        yoda.speak();

        Heater grogu = new Jedi("Grogu");
        ((Jedi) grogu).speak();
    }
}
