import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class MorseClient {


    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 3456);
        OutputStream output = socket.getOutputStream();
        PrintStream printer = new PrintStream(output);
        InputStream input = socket.getInputStream();
        Scanner scanner = new Scanner(input);

        Scanner prompt = new Scanner(System.in);

        while (true) {
            System.out.println("Enter something");
            String text = prompt.nextLine();
            printer.println(text);
            if (text.equals("quit")) {
                break;
            }
            String response = scanner.nextLine();
            System.out.println(response);
        }
        socket.shutdownOutput();
        socket.shutdownInput();
    }


}



