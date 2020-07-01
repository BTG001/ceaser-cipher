import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EncodeTest {
    @Test
    public void newEncode_instantiatesCorrectly() {
        Encode testEncode = new Encode(2, "bonu");
        assertEquals(true, testEncode instanceof Encode);
    }
}
