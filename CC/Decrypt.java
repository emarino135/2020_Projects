package CC;

import java.util.*;
import java.io.*;

public class Decrypt{
    public static void main(String [] args) throws FileNotFoundException{
        Decrypt tester = new Decrypt();
        tester.hashCode();
    }
    public Decrypt() throws FileNotFoundException{
         //Copy encrypted text from text file
         File file = new File("CC/encrypted.txt");
         Scanner sc = new Scanner(file);
         String phrase = "";
         while(sc.hasNextLine()){
             phrase = phrase.concat(sc.nextLine());
         }
         sc.close();
 
 
 
         char[] arr = createCharArr(phrase);
         printAll(arr);
     
    }
    public static void printAll(char[] arr) throws FileNotFoundException{// Prints all 26 combinations of phrase and Saves to decrypted file
        PrintStream o = new PrintStream(new File("CC/decrypted.txt"));
        PrintStream console = System.out;
        System.setOut(o);

        System.out.print("\nOriginal: ");
        System.out.println(arr);
        System.out.println("\nAlphabet Shifted Up:");
        
        for(int i = 0; i < 27; i++){
            if(i == 0){
                System.out.print("0"+i + "  ");
                System.out.println(arr);
            }
            else{
                
                shiftChars(arr);
                if(i<10){
                    System.out.print("0"+i + "  ");
                    System.out.println(arr);
                }
                else{
                    System.out.print(i + "  ");
                    System.out.println(arr);   
                }
            }
        }
        System.setOut(console);
    }
    
    public static char[] shiftChars(char[] arr){  //shifts a char into the next letter of alphabet by 1
        for(int i = 0; i < arr.length; i++){
            if(arr[i]=='z'){
                arr[i]='a';
            }
            else if(arr[i]=='Z'){
                arr[i] = 'A';
            }
            else if(arr[i] == ' '){
                arr[i] = ' ';
            }
            else{
                ++arr[i];
            }
        }
        return arr;
    }
    public static char[] createCharArr(String phrase){  //Creates char[] array from a string input
        char[] arr = new char [phrase.length()];
        for(int i = 0; i < phrase.length(); i++){
            arr[i] = phrase.charAt(i);
        }
        return arr;
    }
}