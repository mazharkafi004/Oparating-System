import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) {

        try
        {
            ServerSocket socketserver = new ServerSocket(9999);
            Socket sick = socketserver.accept();

            BufferedReader buf = new BufferedReader(new InputStreamReader(sick.getInputStream()));
            String bump = buf.readLine();
            System.out.print("Message recieved :"+bump);

        }
        catch(Exception ex){

        }
    }
}
