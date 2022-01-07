/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2.pkg1;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import static java.nio.file.AccessMode.READ;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 *
 * @author A Temple
 * @Nov 20, 2021
 * The ReadFile class will read the data in the csv file and convert it into an array.
 */

public class ReadFiles {
 
  
    /*
    Path to the csv file.
    */
    Path filePath = Paths.get("add file path here");
    
    
    
     String[][] myArray; 
     String InputLine = " ";
     Scanner scanIn = null;
     String xFileLocation;
     int numberOfRows;
     int rowNumber = 0;
     int columnNumber = 0; 
     String line = " ";
     
     
                 
    
    
    /*
    the checkFile() method checks to make sure the file exists.
    */
    public void checkFile() {
        
     System.out.println("Path is " + filePath.toString()); 
    
    try
    {
        filePath.getFileSystem().provider().checkAccess(filePath, READ);
        System.out.println("File can be read and executed");
        
    }
    /*
    If file cannot be found then it is caught and "File cannot be found" is 
    printed. 
    */
    catch(IOException e)
    {
        System.out.println("File cannot be found");
    }
        
    
}
        
        /*
        countLines() method counts the number of rows in the file
        if it exists. It first checks to make sure the file exists, then
        uses a try/catch block to read the number of lines(rows)
        */
    
  public int countLines() throws FileNotFoundException {

      File filePath1 = new File("file path here");
      if(filePath1.exists()) {
          FileReader fr = new FileReader(filePath1);
          LineNumberReader lr = new LineNumberReader(fr);
          int lineNumberCount = 0;
          try {
              while(lr.readLine() != null) {
                  lineNumberCount++;
                  
              }
              /*
              Prints out number of rows in the csv file 
              */
              System.out.println("Total number of rows is " + lineNumberCount);
              
          } catch (IOException e) {
              System.out.println(e);
             
          }
          
      }
        return 0;
      
         
  }
  
  /*
  Sets up the csv file as a multi dimensional array
  */
    public void setUpCSVArray() throws IOException, IOException, IOException {
        
      
      
     
      myArray = new String[rowNumber][columnNumber];
      xFileLocation = "file path here";
      
      
      try
      {
         
        BufferedReader br = new BufferedReader(new FileReader(xFileLocation));
          /*
                String Tokenizer used instead of split() because it is faster with this large file. 
                It breaks up the lines of data into "chunks"
                */
            
              StringTokenizer st = null;
              while((xFileLocation = br.readLine()) != null)
              {
                  rowNumber++;
                  numberOfRows++;
                  
                 st = new StringTokenizer(xFileLocation, ",");
                  
                  while(st.hasMoreTokens())
                  {
                      /*
                      Prints out each item of the array with the correct Row#, Column# and Heading.
                      */
                      columnNumber++;
                      System.out.println("Row  " + rowNumber + ", Column " + columnNumber++  + ", Date: " + st.nextToken());
                      System.out.println("Row  " + rowNumber + ", Column " + columnNumber++  + ", Open: " + st.nextToken());
                      System.out.println("Row  " + rowNumber + ", Column " + columnNumber++  + ", High: " + st.nextToken());
                      System.out.println("Row  " + rowNumber + ", Column " + columnNumber++ + ", Low: " + st.nextToken());
                      System.out.println("Row  " + rowNumber + ", Column " + columnNumber++ + ", Close: " + st.nextToken());
                      System.out.println("Row  " + rowNumber + ", Column " + columnNumber++ + ", Adj Close: " + st.nextToken());
                      System.out.println("Row  " + rowNumber + ", Column " + columnNumber++ + ", Volume: " + st.nextToken());
                      
                                                                       
                  }
                  columnNumber = 0; 
              }
      
              
         
      } catch(IOException e)
      {
          System.out.println(e);
      }
    
        
    }
    
     
   
   
    
    
    /*
        The getMyArray() method returns the full array
   */
  
 String[][] getArray() throws FileNotFoundException, IOException
 {
     
     
     InputStream input = new BufferedInputStream(Files.newInputStream(filePath));
     BufferedReader reader = new BufferedReader(new InputStreamReader(input));
   
     
      try {
          
         System.out.println("\n*****    Manulife Financial Corporation Stocks 2000 - 2013   *****\n");
         System.out.println("  Date       Open     High     Low      Close  AdjClose Volume");
         System.out.println("=================================================================");
          
         input = Files.newInputStream(filePath);
         
          while((line = reader.readLine()) != null)  
           
          {
              
              line = reader.readLine(); 
              System.out.println(line);  
             
                        
          }
          input.close(); 
          
            }

      
      catch(IOException e)
      {
          System.out.println("Message: " + e);
      }   


     
  
 return myArray;
 }
}
      


    


     
     
     
  
  
  
        
     

    
    
    

