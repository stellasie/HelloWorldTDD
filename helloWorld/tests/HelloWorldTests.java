import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTests {

    @Test
    @DisplayName("When a name Pete is provided the Hello Pete message is returned")
    public void getMessageWithName_returnCorrectValue() {
        assertEquals("Hello Pete",HelloWorld.getMessage("Pete"));
    }

    @Test
    @DisplayName("When name not provided an UnsupportedOperationException is thrown")
    public void getMessageWithoutName_throwsException() {
        assertThrows(UnsupportedOperationException.class, () ->  HelloWorld.getMessage(null));
    }


}
