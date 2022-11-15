package nc.strong;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*Nicholas Catalan

INEW-2338 2801 8W2 Advanced JAVA

Date: 11/19/2021

A program to see if a given password is a "strong" password. 
Update 11/29/2021
    remove file chooser
    output lines moved to method to provide detail on fails
    methods changed to void

*/
public class PaswordGrader {
    
    public static void main(String[] args) throws FileNotFoundException{
         
    ArrayList<String> passwords = new ArrayList<>();//array list of flexable size of type String
    int numberOfPasswords = 0;//number off passwords to check
    
    //file input
    File file = new File("strong.txt");    
    try (Scanner inputFile = new Scanner(file)) {
        numberOfPasswords = Integer.parseInt(inputFile.nextLine());//number comes in casted to int
 
        for(int i = 0; i < numberOfPasswords; i++){//adds passwords from file into arraylist
        passwords.add(inputFile.next());
        }
    } 
   
    for(int i = 0;i < numberOfPasswords; i++){//sends each password to be tested
        passwordVerifier(passwords.get(i));       
    }
    
    JOptionPane.showMessageDialog(null, "Thank you. \nGoodbye.");
    
    System.exit(0);

    }//ends main
    
    
 public static void  passwordVerifier(String pWords){
 if (pWords.length() < 8){//Must be at least 8 characters long
     JOptionPane.showMessageDialog(null, pWords + " is INVALID:\n(Too short - not 8 characters long)");
 }
 
 //Can contain only upper case and lower case alphabetic characters, special characters, and digits
 else if (!pWords.matches("[!@#$%^&*()_+=A-Za-z0-9]+")){//invalidates illigal characters
    JOptionPane.showMessageDialog(null, pWords + " is INVALID:\n(contains invalid character)");
 }
 
// has to have 1 special character or upper case
 else if (!pWords.matches(".*[!@#$%^&*()_+=]|.*[A-Z].*")){
    JOptionPane.showMessageDialog(null, pWords + " is INVALID:\n(Needs an upper case letter or a special character)");
 }
 
 //at least one number
 else if(!pWords.matches(".*[0-9].*")){
    JOptionPane.showMessageDialog(null, pWords + " is INVALID:\n(Needs a digit)");
    
 }

// the case is the password passes all checks
 else
     JOptionPane.showMessageDialog(null, pWords + " is STRONG");    
     
 }//ends pwVerifier
}//ends class
