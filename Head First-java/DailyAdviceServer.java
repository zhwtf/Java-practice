import java.io.*;
import java.net.*;

public class DailyAdviceServer {
    String[] adviceList = {"Take smaller bites", "weigheoirgh", "rughorij", "fioerg"};

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);

            while(true) {
                //when the request comes in, the method returns a Socket on some anonymous prot
                //for communicating with the client(it's the different socket)
                Socket sock = serverSock.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);

            }
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int)(Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args){
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
