public class Decode {
    private int key;
    private String phrase;

    public Decode(int key, String phrase) {
        this.key = key;
        this.phrase = phrase;
    }

    public int getKey() {
        return this.key;
    }
    public String getPhrase() {
        return this.phrase;
    }
    public String decodePhrase(int key, String phrase) {



        String decryptMessage = "";
        for(int i=0; i < this.phrase.length();i++)
        {
            // Shift one character at a time
            char alphabet = this.phrase.charAt(i);
            // if alphabet lies between a and z
            if((alphabet >= 'a' && alphabet <= 'z') ||
                    (alphabet >= 'A' && alphabet <= 'Z'))
            {
                // shift alphabet
                alphabet = (char) (alphabet - this.key);

                // shift alphabet lesser than 'A'
                if(alphabet < 'A') {
                    //reshift to starting position
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                // shift alphabet lesser than 'a'
                else if(alphabet < 'a' && alphabet > 'Z') {
                    // reshift to starting position
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
            }
            decryptMessage = decryptMessage + alphabet;
        }
        return decryptMessage;
    }
}
