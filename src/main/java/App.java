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

            Encode encode = new Encode(inputKey, stringInputKey);
            String encodedString = encode.encodePhrase(inputKey, stringInputKey);
            System.out.println(encodedString);
        }
    }
}
