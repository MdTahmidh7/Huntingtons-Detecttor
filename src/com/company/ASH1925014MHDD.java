package com.company;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class ASH1925014MHDD {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("E:\\Language\\Java\\Huntingtons-Detecttor\\src\\com\\company\\String.txt"));
        Scanner InputScanner = new Scanner(System.in);
        String input = InputScanner.nextLine();
        List<String> lines = new ArrayList<String>();
        List<List<String>> listwords = new ArrayList<>();
        while (sc.hasNext()) {
            listwords.add(Arrays.asList(sc.nextLine().split(" ")));
        }
        List<String> s = listwords.get(2);

        for (int k = 0; k < listwords.size(); k++) {
           // System.out.println(listwords.get(k));
            String s1 = String.valueOf(listwords.get(k));
           // System.out.println(s1);
            /*------------------*/
            int inputLength = input.length();
            for (int i = 0, j = i + inputLength; j <= s1.length(); i++, j++) {
                String temp = s1.substring(i, j);
              //  System.out.println("Temp = "+temp);
                if (temp.equals(input)) {
                    int s1Length = s1.length();
                    s1 = s1.substring(1,s1Length-1);
                    System.out.println("input = "+input+"\t text found = "+s1);
                    }
                }
            }
        }
    }

