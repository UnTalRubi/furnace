package edu.estatuas.furnace.test;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

import edu.estatuas.furnace.miscelaneus.RoomTemperature;

public class SingletonTest {

    @Test
    public void testRoomTemperatureSingleton() {
        RoomTemperature temp1 = RoomTemperature.getInstance();
        RoomTemperature temp2 = RoomTemperature.getInstance();
        assertSame(temp1, temp2);
    }
}
