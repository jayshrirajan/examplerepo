package example.com;

import java.io.File;
import java.io.IOException;

public class createagiventextfile {
	
	   public static void main( String[] args )
	   { 
	      try {
	      File file = new File("C:\\newfile.txt");
	     /*createNewFile() will return true if file gets 
	       * created or if the file is 
	       * already present it would return false
	       */
	             boolean filepresent = file.createNewFile();
	      if (filepresent){
	           System.out.println("File is created successfully");
	      }
	      else{
	           System.out.println("File is already present at the specified  location");
	      }
	     } catch (IOException e) {
	      System.out.println("Exception Occurred:");
	         e.printStackTrace();
	   }
	   
	   }
}



