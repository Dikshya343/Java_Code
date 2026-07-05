import java.net.*;
import java.io.*;

public class TCPServer {
    public static void main(String[] args ) throws Exception{
        ServerSocket ss = new ServerSocket(999);
        System.out.println("server started......");
        System.out.println("waiting for client.....");
        Socket socket = ss.accept();
        System.out.println("client connected");
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        BufferedReader keyboard = new BufferedReader(
                new InputStreamReader(System.in));

        String clientMsg, serverMsg;
        while(true){
            clientMsg  = br.readLine();
            System.out.println("clientMsg:" +clientMsg);
            if(clientMsg.equalsIgnoreCase("exit") ){
                System.out.println("client ended the chat");
                break;
            }
            System.out.println("server:");
            serverMsg = keyboard.readLine();
            System.out.println("servermsg");
            if(serverMsg.equalsIgnoreCase("exit")){

                break;
            }
            out.println(serverMsg );
            out.flush() ;





        }
        socket.close();
        ss.close();
        System.out.println("connection ended");




    }

}
