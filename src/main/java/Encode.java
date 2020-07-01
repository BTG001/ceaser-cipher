public class Encode {
    private int key;
    private String phrase;

    public Encode(int key, String phrase) {
        this.key = key;
        this.phrase = phrase;
        if ((this.phrase == null)) {
            throw new IllegalArgumentException("Kindly enter a string");
        }
    }
    public int getKey() {
        return this.key;
    }
    public String getPhrase() {
        return this.phrase;
    }
}
