import java.io.*;
import java.net.*;

public class DailyAdviceClient {

    public void go() {
        try {
            Socket s = new Socket("127.0.0.1", 4242);

            //chain a BufferredReader to an InputStreamReader to the input stream from
            // the Socket
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferredReader reader = new BufferredReader(streamReader);



            String advice = reader.readLine();
            System.out.println("Today you should: " + advice);

            //this closes all the streams
            reader.close();

        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
