package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void myName() {
        assertEquals("Aswin", new Demo().myName());
    }
}