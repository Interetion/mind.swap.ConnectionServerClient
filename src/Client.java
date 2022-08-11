import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.DatagramSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        String ip = "localhost";
        int port = 9999;
        Socket s = new Socket(ip, port);
        Reader r= new  Reader();
        String sendingServerFromCli = r.read();
        
        if (sendingServerFromCli == "Hit me") {
            OutputStreamWriter  sendingToServerSide= new OutputStreamWriter(s.getOutputStream());
            PrintWriter   writeIntoServer= new PrintWriter(sendingToServerSide);
           writeIntoServer.write(sendingServerFromCli);
            writeIntoServer.flush();
        }
    }
}
