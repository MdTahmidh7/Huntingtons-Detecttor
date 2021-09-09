import java.util.Arrays;

public class Huntingtons {
    public static void main(String[] args) {
	String mainString = "wAABABCABabaBDnHjABsssabAbaBABAbsababAbaBABAb";
	String subString = "AB";
	int count =0,maxCount=0;
        mainString = mainString.toUpperCase();
        subString = subString.toUpperCase();

        System.out.println("   -----    ");
        for (int i=0,j=2;j<=mainString.length();i++,j++){
            String temp = mainString.substring(i,j);
            System.out.println(temp);
            if (temp.equals(subString)){
                count++;
                //System.out.println(count+" Match Found");
                for (i=i+2,j=j+2;j<=mainString.length();i=i+2,j=j+2){
                    String temp1 = mainString.substring(i,j);
                    if (temp1.equals(subString)){
                        count++;
                        if (maxCount<count){
                            maxCount = count;
                        }
                    }
                    else {
                        count=0;
                        break;
                    }

                }
            }
        }
        System.out.println(maxCount+" Repeat Found ");
    }
}
