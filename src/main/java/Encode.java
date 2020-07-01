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
    public String encodePhrase(int key, String phrase) {

        String ciphertext = "";
        for (int i = 0; i < phrase.length(); i++) {
            // Shift one character at a time
            char alphabet = phrase.charAt(i);
            // if alphabet lies between a and z
            if ((alphabet >= 'a' && alphabet <= 'z') ||
                    (alphabet >= 'A' && alphabet <= 'Z')) {
                // shift alphabet
                alphabet = (char) (alphabet + key);
            }
            // if shift alphabet greater than 'z'
            if (alphabet > 'z') {
                // reshift to starting position
                alphabet = (char) (alphabet + 'a' - 'z' - 1);
            }
            // if shift alphabet greater than 'Z'
            else if (alphabet > 'Z' && alphabet < 'a') {
                //reshift to starting position
                alphabet = (char) (alphabet + 'A' - 'Z' - 1);
            }
            ciphertext = ciphertext + alphabet;
        }
        return ciphertext;
    }

}
