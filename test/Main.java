package test;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Main{
    public static void main(String [] args) throws FileNotFoundException{
        
        
        File tempFile= new File("test/temp.html"); //Clear tempFile
        try{
            if(tempFile.delete()) 
            { 
                System.out.println("TempFile deleted successfully"); 
            } 
        }catch(Exception e){
            System.out.println(e);
        }


        File file = new File("test/urlContents.html"); //URL html contents
        Scanner sc = new Scanner(file);
        try{
            FileWriter fw = new FileWriter("test/temp.html"); //Add new stuff to temp file
            while(sc.hasNextLine()){
                fw.append(sc.nextLine()+"\n");
            }
            sc.close();
            fw.close();
        
        }catch(Exception IOException){
            System.out.println("writer error");
        }
        
        
        
       
        try{
            if(file.createNewFile()){
                System.out.println("File Created");
            }
        }catch(Exception iException){
            System.out.println("File format incomplete");
        }
    }
}