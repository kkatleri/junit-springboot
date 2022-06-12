package com.autobots.petclinic.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class JunitExtensionTest {

    @Mock
    Map<String, Object> mapMock;

    @Test
    void testMock() {
        mapMock.put("optimus", "prime"); //fake put, size() still returns 0 below

        assertEquals(mapMock.size(), 0);
    }
}
