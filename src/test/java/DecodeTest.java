import org.junit.*;
import static org.junit.Assert.*;

public class DecodeTest {
    @Test
    public void newDecode_instantiatesCorrectly() {
        Decode testDecode = new Decode(2, "nobu");
        assertEquals(true, testDecode instanceof Decode);
    }

    @Test
    public void newDecode_getKey_2() {
        Decode testDecode = new Decode(2, "btg");
        assertEquals(2, testDecode.getKey());
    }

    @Test
    public void newDecode_getPhrase_btg() {
        Decode testDecode = new Decode(2, "btg");
        assertEquals("btg", testDecode.getPhrase());
    }
}
