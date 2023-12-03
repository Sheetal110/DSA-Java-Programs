package Strings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String str){

        String finalstr = "";
        finalstr = finalstr + str.charAt(0);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) != str.charAt(i-1)){
                finalstr = finalstr+str.charAt(i);
            }
        }
        return finalstr;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        
        System.out.print(removeConsecutiveDuplicates(str));

        sc.close();
    }
}
