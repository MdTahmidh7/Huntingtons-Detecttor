package com.company.sequences;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Huntingtons {
    public static void main(String[] args) throws IOException {
        String mainString = "wAABABCABabaBDnHjABsssabAbaBABAbsababAbaBABAb";
        String subString = "AB";

        int count = 0, maxCount = 0;
        mainString = mainString.toUpperCase();
        subString = subString.toUpperCase();

        /* ____________Reading File_______________*/

        File file = new File("sequences\\1.txt");
        Scanner fileScanner = new Scanner(file);
        String DnaSequence = "";
        while (fileScanner.hasNextLine()) {
            DnaSequence = DnaSequence.concat(fileScanner.nextLine());
            //  System.out.println(fileScanner.nextLine()+"\n");
        }
        System.out.println(DnaSequence);


        System.out.println("   -----    ");

        mainString = DnaSequence;
        System.out.println(mainString);
        System.out.println("Enter DNA Sub-Sequence : ");
        Scanner subStingScanner = new Scanner(System.in);
        String s = subStingScanner.nextLine();
        s = s.toUpperCase();
        System.out.println("DNA sub sequence is : " + s);
        subString=s;
        System.out.println("\nSUB String is = "+subString);

        for (int i = 0, j = 2; j <= mainString.length(); i++, j++) {
            String temp = mainString.substring(i, j);
            System.out.println(temp);
            if (temp.equals(subString)) {
                count++;
                //System.out.println(count+" Match Found");
                for (i = i + 2, j = j + 2; j <= mainString.length(); i = i + 2, j = j + 2) {
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
        System.out.println(maxCount + " Repeat Found ");
    }
}
