import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int p = 0;
        String catchall = "Enter your catchall here (don't include the @)";
        String[] emails = new String[10000];//You can change 10000 to how many catchalls that you want
        for (int g = 0; g < emails.length; g++) {
            for (int w = 0; w < 10; w++) {
                int max = 35;
                int min = 0;
                String num1;
                Double ma = (Math.random() * ((max - min) + 1)) + min;
                alpha[w] = alpha[ma.intValue()];
            }
            String done = alpha[0].concat(alpha[1]).concat(alpha[2]).concat(alpha[3]).concat(alpha[4]).concat(alpha[5]).concat(alpha[6]).concat(alpha[7]).concat(alpha[8]).concat(alpha[9]).concat("@" + catchall);
            if (Arrays.toString(emails).contains(done)) {
                System.out.println("ALREADY USED");
            } else {
                emails[g] = done;
                System.out.println(done);
            }
        }
    }
}
