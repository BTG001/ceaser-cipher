import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public String getHello() {
        return "Hello World!";
    }
    public static void main(String[] args) {
        System.out.println(new App().getHello());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word or a sentence");
        try {
            String stringUserInput = bufferedReader.readLine();
            System.out.println("enter a number as key");
            String stringInputKey = bufferedReader.readLine();
            int inputKey = Integer.parseInt(stringInputKey);

            Encode encode = new Encode(inputKey, stringUserInput);
            String encodedString = encode.encodePhrase(inputKey, stringUserInput);
            System.out.println("Encrypted string: " + encodedString);

            System.out.println("enter THE number as key");
            String stringDecodeKey = bufferedReader.readLine();
            int decodeKey = Integer.parseInt(stringDecodeKey);

            Decode decode = new Decode(inputKey, encodedString);
            String decodedString = decode.decodePhrase(inputKey, stringUserInput);
            System.out.println("Decrypted String: " + decodedString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
