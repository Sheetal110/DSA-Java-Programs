package Strings;

import java.util.Scanner;

public class CompressString {

    public static String getCompressString(String str){

        String str1="";
        int count =1;
        str1 = str1+str.charAt(0);

        for(int i=1;i<str.length();i++){

            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                if(count>1){
                    str1 = str1+count+str.charAt(i);
                    count=1;
                }
                else{
                    str1 = str1+str.charAt(i);
                    count=1;
                }
            }

        }

        if(count>1){
            str1 = str1+count;
        }

        return str1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Enter the string to compress : ");
        System.out.println(getCompressString(str));
        sc.close();
    }
    
}
