import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Huntington {
    public static void main(String[] args) throws IOException {
        String DnaSequence = "";
        String mainString = "";
        String subString = "CAG";
        int count = 0, maxCount = 0;
        mainString = mainString.toUpperCase();
        subString = subString.toUpperCase();

        Scanner scanner = new Scanner(System.in);
        mainString = scanner.nextLine();

        for (int i = 0, j = 3; j <= mainString.length(); i++, j++) {
            String temp = mainString.substring(i, j);
            if (temp.equals(subString)) {
                count++;
                for (i = i + 3, j = j + 3; j <= mainString.length(); i = i + 3, j = j + 3) {
                    String temp1 = mainString.substring(i, j);
                    if (temp1.equals(subString)) {
                        count++;
                        if (maxCount < count) {
                            maxCount = count;
                        }
                    } else {
                        count = 0;
                        break;
                    }

                }
            }
        }
        System.out.println( "Max number of CAG repeat = "+maxCount );

        if (maxCount <= 9) {
            System.out.println("Not Human");

        } else if (maxCount <= 35) {
            System.out.println("normal");
        } else if (maxCount <= 39) {
            System.out.println("high risk");
        } else if (maxCount <= 180) {
            System.out.println("Huntington's Disease");
        } else if (180 < maxCount) {
            System.out.println("not human");
        }
    }
}

