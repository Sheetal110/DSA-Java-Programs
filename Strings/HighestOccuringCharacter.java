package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class HighestOccuringCharacter {

    public static void highestOccuringChar(String str){

        int[] index = new int[26];

        for(int i=0;i<str.length();i++){
            int p = str.charAt(i) - 'a';
            index[p]++;
        }

        System.out.println(Arrays.toString(index));

        int max = index[0];
        int finalIndex =0;
        
        for(int i=0;i<index.length;i++){
            if(index[i]>max){
                max = index[i];
                finalIndex = i;
            }
        }

        System.out.println("Max occurance character : " + (char) (finalIndex + 'a'));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");

        String str = sc.nextLine();

        highestOccuringChar(str);

        sc.close();
    }
}
