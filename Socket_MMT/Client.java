package Socket_MMT;
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception{
        // Tạo input stream
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("127.0.0.1", 6789);
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        System.out.println("Input lowercase sentence:");
        String sentence = inFromUser.readLine();
        outToServer.writeBytes(sentence + '\n');
        System.out.println("FROM CLIENT: " + sentence);
        String modifiedSentence = inFromServer.readLine();
        System.out.println("FROM SERVER: " + modifiedSentence);
        clientSocket.close();
    }
}