import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

/**
 * jmk3378 @rit
 *
 * MorseClient is a work in progress to create a java program which can convert strings to morse code and sends it
 * using a print stream to another client or server.
 */
public class MorseClient {

    //HashMap<String, MorseCode> AlphaToMorse;

    public String codify(String text) {
        String message = "";
        String[] split = text.split(" ");
        for (String word : split) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                switch ((String.valueOf(c)).toUpperCase()) {
                    case "A":
                        message += MorseCode.A;
                    case "B":
                        message += MorseCode.B;
                    case "C":
                        message += MorseCode.C;
                    case "D":
                        message += MorseCode.D;
                    case "E":
                        message += MorseCode.E;
                    case "F":
                        message += MorseCode.F;
                    case "G":
                        message += MorseCode.G;
                    case "H":
                        message += MorseCode.H;
                    case "I":
                        message += MorseCode.I;
                    case "J":
                        message += MorseCode.J;
                    case "K":
                        message += MorseCode.K;
                    case "L":
                        message += MorseCode.L;
                    case "M":
                        message += MorseCode.M;
                    case "N":
                        message += MorseCode.N;
                    case "O":
                        message += MorseCode.O;
                    case "P":
                        message += MorseCode.P;
                    case "Q":
                        message += MorseCode.Q;
                    case "R":
                        message += MorseCode.R;
                    case "S":
                        message += MorseCode.S;
                    case "T":
                        message += MorseCode.T;
                    case "U":
                        message += MorseCode.U;
                    case "V":
                        message += MorseCode.V;
                    case "W":
                        message += MorseCode.W;
                    case "X":
                        message += MorseCode.X;
                    case "Y":
                        message += MorseCode.Y;
                    case "Z":
                        message += MorseCode.Z;
                    case "1":
                        message += MorseCode.ONE;
                    case "2":
                        message += MorseCode.TWO;
                    case "3":
                        message += MorseCode.THREE;
                    case "4":
                        message += MorseCode.FOUR;
                    case "5":
                        message += MorseCode.FIVE;
                    case "6":
                        message += MorseCode.SIX;
                    case "7":
                        message += MorseCode.SEVEN;
                    case "8":
                        message += MorseCode.EIGHT;
                    case "9":
                        message += MorseCode.NINE;
                    case "0":
                        message += MorseCode.ZERO;
                }


            }
        }

        return message;
    }

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
            if (text.equals(MorseCode.QUIT)) {
                break;
            }
            String response = scanner.nextLine();
            System.out.println(response);
        }
        socket.shutdownOutput();
        socket.shutdownInput();
    }


}



