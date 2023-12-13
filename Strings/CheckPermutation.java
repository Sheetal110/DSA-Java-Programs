package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {

    public static boolean isPermutation(String str1,String str2){

        int strlen1 = str1.length();
        int strlen2 = str2.length();

        if (strlen1 != strlen2) {
            return false;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        for(int i=0;i<strlen1;i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        System.out.println(isPermutation(str1,str2));

        sc.close();

    }

}
