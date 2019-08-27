
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class Client {


    public static void main(String[] args) {
        
        try
        {
            Socket string = new Socket("localhost",9999);

            PrintStream print = new PrintStream(string.getOutputStream());

            System.out.print("Enter your message: ");

            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader buffuerread = new BufferedReader(read);

            String str = buffuerread.readLine();

            print.println(str);

            BufferedReader buff = new BufferedReader(new InputStreamReader(string.getInputStream()));

            String str1 = buff.readLine();
            System.out.print(str1);

        }
        catch(Exception ex)
        {

        }
    }
    }
    

