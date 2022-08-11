import java.io.IOException;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class Reader {


    public String read(){
    String message= " Insert message to the server";
        Scanner t = new Scanner(System.in);
        String aswer1;
        System.out.println(message);
        try {
            aswer1 =t.nextLine();
        }catch(Exception e){
            System.out.println(" Please you should insert, Hit me.");
            return read();

        }
        return aswer1;
    }

}