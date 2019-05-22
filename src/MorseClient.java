import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * jmk3378 @rit
 * <p>
 * MorseClient is a work in progress to create a java program which can convert strings to morse code and sends it
 * using a print stream to another client or server.
 */
public class MorseClient {

    /**
     * Takes a message and encodes each word into morse code.
     *
     * @param text message to be encoded.
     * @return encoded message to be sent.
     */
    public static String codify(String text) {
        String message = "";
        String[] words = text.split(" ");
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                switch ((String.valueOf(c)).toUpperCase()) {
                    case "A":
                        message += MorseCode.A + MorseCode.LETTER_SPACE;
                    case "B":
                        message += MorseCode.B + MorseCode.LETTER_SPACE;
                    case "C":
                        message += MorseCode.C + MorseCode.LETTER_SPACE;
                    case "D":
                        message += MorseCode.D + MorseCode.LETTER_SPACE;
                    case "E":
                        message += MorseCode.E + MorseCode.LETTER_SPACE;
                    case "F":
                        message += MorseCode.F + MorseCode.LETTER_SPACE;
                    case "G":
                        message += MorseCode.G + MorseCode.LETTER_SPACE;
                    case "H":
                        message += MorseCode.H + MorseCode.LETTER_SPACE;
                    case "I":
                        message += MorseCode.I + MorseCode.LETTER_SPACE;
                    case "J":
                        message += MorseCode.J + MorseCode.LETTER_SPACE;
                    case "K":
                        message += MorseCode.K + MorseCode.LETTER_SPACE;
                    case "L":
                        message += MorseCode.L + MorseCode.LETTER_SPACE;
                    case "M":
                        message += MorseCode.M + MorseCode.LETTER_SPACE;
                    case "N":
                        message += MorseCode.N + MorseCode.LETTER_SPACE;
                    case "O":
                        message += MorseCode.O + MorseCode.LETTER_SPACE;
                    case "P":
                        message += MorseCode.P + MorseCode.LETTER_SPACE;
                    case "Q":
                        message += MorseCode.Q + MorseCode.LETTER_SPACE;
                    case "R":
                        message += MorseCode.R + MorseCode.LETTER_SPACE;
                    case "S":
                        message += MorseCode.S + MorseCode.LETTER_SPACE;
                    case "T":
                        message += MorseCode.T + MorseCode.LETTER_SPACE;
                    case "U":
                        message += MorseCode.U + MorseCode.LETTER_SPACE;
                    case "V":
                        message += MorseCode.V + MorseCode.LETTER_SPACE;
                    case "W":
                        message += MorseCode.W + MorseCode.LETTER_SPACE;
                    case "X":
                        message += MorseCode.X + MorseCode.LETTER_SPACE;
                    case "Y":
                        message += MorseCode.Y + MorseCode.LETTER_SPACE;
                    case "Z":
                        message += MorseCode.Z + MorseCode.LETTER_SPACE;
                    case "1":
                        message += MorseCode.ONE + MorseCode.LETTER_SPACE;
                    case "2":
                        message += MorseCode.TWO + MorseCode.LETTER_SPACE;
                    case "3":
                        message += MorseCode.THREE + MorseCode.LETTER_SPACE;
                    case "4":
                        message += MorseCode.FOUR + MorseCode.LETTER_SPACE;
                    case "5":
                        message += MorseCode.FIVE + MorseCode.LETTER_SPACE;
                    case "6":
                        message += MorseCode.SIX + MorseCode.LETTER_SPACE;
                    case "7":
                        message += MorseCode.SEVEN + MorseCode.LETTER_SPACE;
                    case "8":
                        message += MorseCode.EIGHT + MorseCode.LETTER_SPACE;
                    case "9":
                        message += MorseCode.NINE + MorseCode.LETTER_SPACE;
                    case "0":
                        message += MorseCode.ZERO + MorseCode.LETTER_SPACE;
                }


            }
        }

        return message;
    }

    /**
     * decode takes a message which is in morse code and decodes it to letters.
     *
     * @param code encoded message received.
     * @return decoded message received.
     */
    public static String decode(String code) {
        String message = "";
        String[] CodeMessage = code.split(MorseCode.WORD_SPACE);
        for (String word : CodeMessage) {
            String[] letters = word.split(MorseCode.LETTER_SPACE);
            for (String letter : letters) {
                switch (letter) {
                    case MorseCode.A:
                        message += "A";
                    case MorseCode.B:
                        message += "B";
                    case MorseCode.C:
                        message += "C";
                    case MorseCode.D:
                        message += "D";
                    case MorseCode.E:
                        message += "E";
                    case MorseCode.F:
                        message += "F";
                    case MorseCode.G:
                        message += "G";
                    case MorseCode.H:
                        message += "H";
                    case MorseCode.I:
                        message += "I";
                    case MorseCode.J:
                        message += "J";
                    case MorseCode.K:
                        message += "K";
                    case MorseCode.L:
                        message += "L";
                    case MorseCode.M:
                        message += "M";
                    case MorseCode.N:
                        message += "N";
                    case MorseCode.O:
                        message += "O";
                    case MorseCode.P:
                        message += "P";
                    case MorseCode.Q:
                        message += "Q";
                    case MorseCode.R:
                        message += "R";
                    case MorseCode.S:
                        message += "S";
                    case MorseCode.T:
                        message += "T";
                    case MorseCode.U:
                        message += "U";
                    case MorseCode.V:
                        message += "V";
                    case MorseCode.W:
                        message += "W";
                    case MorseCode.X:
                        message += "X";
                    case MorseCode.Y:
                        message += "Y";
                    case MorseCode.Z:
                        message += "Z";
                    case MorseCode.ONE:
                        message += "1";
                    case MorseCode.TWO:
                        message += "2";
                    case MorseCode.THREE:
                        message += "3";
                    case MorseCode.FOUR:
                        message += "4";
                    case MorseCode.FIVE:
                        message += "5";
                    case MorseCode.SIX:
                        message += "6";
                    case MorseCode.SEVEN:
                        message += "7";
                    case MorseCode.EIGHT:
                        message += "8";
                    case MorseCode.NINE:
                        message += "9";
                    case MorseCode.ZERO:
                        message += "0";
                    case MorseCode.PERIOD:
                        message += ".";
                    case MorseCode.COMMA:
                        message += ",";
                    case MorseCode.QUESTION_MARK:
                        message += "?";
                    case MorseCode.NEW_LINE:
                        message += "\n";

                }

            }


            message += " ";
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
            String message = codify(text);
            printer.println(message);
            if (text.equals(MorseCode.QUIT)) {
                break;
            }
            String CodeMessage = scanner.nextLine();
            String DecodeMessage = decode(CodeMessage);
            System.out.println(DecodeMessage);
        }
        socket.shutdownOutput();
        socket.shutdownInput();
    }


}



