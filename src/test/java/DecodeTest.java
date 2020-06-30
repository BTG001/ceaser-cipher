import org.junit.*;
import static org.junit.Assert.*;

public class DecodeTest {
    @Test
    public void newDecode_instantiatesCorrectly() throws Exception {
        Decode newDecode = new Decode(2, "nobu");
        assertEquals(true, newDecode instanceof Decode);
    }
}
