import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        int port = 8010;
        try (Socket socket = new Socket("localhost", port);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            out.println("Клиент: Сообщение от клиента");

            reader.lines().forEach(System.out::println);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());

        }


    }


}
