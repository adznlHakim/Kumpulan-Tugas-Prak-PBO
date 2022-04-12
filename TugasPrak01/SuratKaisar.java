import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int n = scan.nextInt();
        String hasileksekusi = excute(input, n);
        System.out.println(hasileksekusi);
    }
    
    public static String excute(String input, int n){
        String huruf2 = "";
        for(int i = 0; i < input.length(); i++){
            char karakter = input.charAt(i);
            int huruf = karakter;
            int count = huruf + n;
            if(karakter >= 'a' && karakter <= 'z'){
                if(count > 122 ){
                     count = 96 + (count - 122);
                }
                    huruf2 += String.valueOf((char)count);   
            }else if(karakter >= 'A' && karakter <= 'Z'){
                if(count > 90 ){
                     count = 64 + (count - 90);
                }
                    huruf2 += String.valueOf((char)count); 
            }else{
                    huruf2 += String.valueOf(karakter);
            }
        }
        return huruf2;
    }
}