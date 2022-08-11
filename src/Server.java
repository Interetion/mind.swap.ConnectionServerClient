import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {


        ServerSocket ServerSocket= new ServerSocket(9999);
        System.out.println("Server is Waiting.");
        Socket objectRequestClient= ServerSocket.accept();
        System.out.println("client connect");
        BufferedReader fetchTheData= new BufferedReader(new InputStreamReader(objectRequestClient.getInputStream()));
            String readfromClient= fetchTheData.readLine();
        System.out.println("Client  data" + readfromClient);
    }


}
