/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2.pkg1;


import java.io.FileNotFoundException;
import java.io.IOException;



/**
 *
 * @author A Temple
 * @Nov20, 2021
 * DataAnalyzer contains the main method to run the ReadFiles.java class
 */
public class DataAnalyzer {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        /*
        Instantiate a new ReadFiles object as f1
        */
        ReadFiles f1 = new ReadFiles();
        f1.checkFile();
        f1.countLines();
	
	//Example of data being analyzed below is Manulife Financial Stocks from 2000 - 2013
        System.out.println("\n*****    Manulife Financial Corporation Stocks  2000 - 2013  *****\n");
        f1.setUpCSVArray(); 
        f1.getArray();
       
         
    }
    
}
