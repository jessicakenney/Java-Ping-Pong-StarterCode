import models.PingPong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I'm a ping-pong application");
        System.out.println("Please enter a number to count up to: ");

        try {
            int userNumber = Integer.parseInt(reader.readLine());
            PingPong game = new PingPong();
            System.out.println(game.runPingPong(userNumber));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
