import java.io.*;
import java.net.Socket;

public class Receiver {
    Socket socket;
    {
        try {
            Socket socket = new Socket("localhost",2024);
            System.out.println("Connected to server");

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
