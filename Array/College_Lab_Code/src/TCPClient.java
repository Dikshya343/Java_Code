import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 999);
        System.out.println("Connected to Server!");

        BufferedReader br = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true);

        BufferedReader keyboard = new BufferedReader(
                new InputStreamReader(System.in));

        String clientMsg, serverMsg;

        while (true) {


            System.out.print("Client: ");
            clientMsg = keyboard.readLine();
            out.println(clientMsg);

            if (clientMsg.equalsIgnoreCase("exit")) {
                break;
            }


            serverMsg = br.readLine();
            System.out.println("Server: " + serverMsg);

            if (serverMsg.equalsIgnoreCase("exit")) {
                break;
            }
            out.println(clientMsg );
            out.flush() ;
        }


        socket.close();
        System.out.println("Connection closed.");
    }
}