import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


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

    @Test
    public void exceptionTesting() {
        Decode testDecode = new Decode(2, "");
    }

    @Test
    public void newEncode_getCharater_a() {
        Decode testDecode = new Decode(2, "c");
        assertEquals("a", testDecode.decodePhrase(2, "a"));
    }

    @Test
    public void newEncode_getPhraseWithSpace_i_play() {
        Decode testDecode = new Decode(2, "k rnca");
        assertEquals("i play", testDecode.decodePhrase(2, "k rnca"));
    }
}
