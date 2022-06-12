package com.autobots.petclinic;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class InLineMockTest {

    @Test
    void testInlineMock() {
        Map mapMock = mock(Map.class);
        //mapMock.put("key", "value");
        assertEquals(mapMock.size(), 0);
    }
}
