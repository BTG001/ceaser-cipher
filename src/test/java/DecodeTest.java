import org.junit.*;
import static org.junit.Assert.*;

public class DecodeTest {
    @Test
    public void newDecode_instantiatesCorrectly() {
        Decode testDecode = new Decode(2, "nobu");
        assertEquals(true, testDecode instanceof Decode);
    }
}
