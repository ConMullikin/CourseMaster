package edu.gcc.comp350;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LauncherTest {
    @Test
    void myFavoriteNumber() {
        assertEquals(42, Launcher.myFavoriteNumber());
    }
}
