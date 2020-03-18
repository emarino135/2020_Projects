/*
    To run this you must write a number in the args[0] which will choose how many
    times to shift the caesars cypher and also have a message written in the
    phrase.txt which will than be put in the encrypted.txt as an encrypted message

*/

package CC;
import java.util.*;
import java.io.*;

public class Encrypt{
    public String[] args;
    public static void main(String [] args) throws FileNotFoundException, IOException{
        Encrypt tester = new Encrypt(Integer.parseInt(args[0]));
        tester.hashCode();
    }
    public Encrypt(int Num) throws FileNotFoundException, IOException{
         //Getting original message from phrase.txt
         File file = new File("CC/phrase.txt");
         Scanner sc = new Scanner(file);
         String phrase = "";
         while(sc.hasNextLine()){
            phrase = phrase.concat(sc.nextLine());
         }
         sc.close();
 
         System.out.println("Original Phrase: " + phrase);
         //Creating encrypted message from phrase.txt and args[0]
         char[] arr = createCharArr(phrase);
         String encryptedMessage = encryptMessage(arr, Num);
 
         System.out.println("New encrypted message: " + encryptedMessage);
 
         //Writing new encrypted message to encrypted.txt
         File writeTo = new File("CC/encrypted.txt");
         FileWriter writer = new FileWriter(writeTo);
         writer.append(encryptedMessage);
         writer.close();
 
    }
    public static String encryptMessage(char[] arr, int num){ //shifts letters by the amount of args[0]
        for(int x = 0; x < num; x++){   //Repeate encryption
            for(int i = 0; i < arr.length; i++){    //encryption process
                if(arr[i]=='z'){
                    arr[i]='a';
                }
                else if(arr[i] == 'Z'){
                    arr[i] = 'A';
                }
                else if(arr[i] == ' '){
                    arr[i] = ' ';
                }
                else{
                    arr[i]++;
                }
            }
        }  
        String encrypted = String.valueOf(arr);
        return encrypted;
    }
    public static char[] createCharArr(String phrase){  //Creates char[] array from a string input
        char[] arr = new char [phrase.length()];
        for(int i = 0; i < phrase.length(); i++){
            arr[i] = phrase.charAt(i);
        }
        return arr;
    }
}