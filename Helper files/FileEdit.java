import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileEdit {

 public static void writeToFile(String fileName, String text){
  BufferedWriter bw = null;
  File file = new File(fileName);
  int exist = 0;
  if(file.exists()){
  exist = 1;
  //System.out.println("File found!");
  }
  else{
  //System.out.println("File not found!");
  }
  try {
  if(exist == 1){
  	  FileWriter fw = new FileWriter(file);
	  bw = new BufferedWriter(fw);
	  bw.write(text);
    // System.out.println("File written Successfully");
  }
  }
  catch (IOException ioe) {
  System.out.println("sad");
  }
  finally
	{ 
	   try{
	      if(bw!=null)
		 bw.close();
	   }catch(Exception ex){
	       System.out.println("Error in closing the BufferedWriter"+ex);
	    }
	}
  }

public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }

}