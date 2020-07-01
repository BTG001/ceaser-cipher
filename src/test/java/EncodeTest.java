import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EncodeTest {
    @Test
    public void newEncode_instantiatesCorrectly() {
        Encode testEncode = new Encode(2, "bonu");
        assertEquals(true, testEncode instanceof Encode);
    }

    @Test
    public void newEncode_getKey_2() {
        Encode testEncode = new Encode(2, "bonu");
        assertEquals(2, testEncode.getKey());
    }

    @Test
    public void newEncode_getPhrase_bonu() {
        Encode testEncode = new Encode(2, "bonu");
        assertEquals("bonu", testEncode.getPhrase());
    }

    @Test
    public void newEncode_getNotPhrase_2() {
        assertThrows(
                NullPointerException.class,
                () -> { throw new NullPointerException(); }
        );
    }

    @Test
    public void exceptionTesting() {
        Encode testEncode = new Encode(2, "");
    }
}
