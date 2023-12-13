package Strings;

import java.util.Scanner;

public class RemoveCharacter {
    
    // Written program is to remove character from the string

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String finalstr = "";
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter the character which you want to remove: ");
        char ch = sc.next().charAt(0);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ch){
                finalstr = finalstr + str.charAt(i);
            }
        }
        System.out.println(finalstr);
        sc.close();
    }

}
