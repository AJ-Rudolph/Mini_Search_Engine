package app;

import java.util.Hashtable;
import java.util.Scanner;
import java.io.File;


public class BookReader {
    
    private String filename;
    private String filepath;


    private Hashtable<String, Integer> bookHash;

    public BookReader(String filepath, String filename){
        this.filename=filename;
        this.filepath= filepath;

        this.bookHash= new Hashtable<String, Integer>();
    }

    public void  readFile(){
        
        
        //sees if there is a file and if it exitsts or not 
        try{
            String fullFilePath= filepath+filename;
            File file= new File(fullFilePath);

            Scanner filelines= new Scanner(file);
            while(filelines.hasNext()) {
                String line =filelines.nextLine();
                System.out.println(line);
            }

           
        } catch(Exception e) {
            e.printStackTrace(); //print error
            System.exit(1); //stops the program

        }
      

    }








}