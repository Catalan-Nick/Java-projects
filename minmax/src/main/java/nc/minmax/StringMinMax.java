package nc.minmax;

import javax.swing.JOptionPane;
import static nc.minmax.DemoGenerics.getHighest;
import static nc.minmax.DemoGenerics.getLowest;

/**
 *
 * @author Nicholas Catalan
 * INEW-2338 2801 8W2 Advanced JAVA
 * Date 11/28/2021
 * 
 * finds and outputs the Min and max of strings
 */
public class StringMinMax {
    public static void getMinMaxString(){
//create a array for holding strings
    String[] inputS = new String[2];

//ask user for two strings
    //input 1st string
        inputS[0] = JOptionPane.showInputDialog("Please enter a word or phrase: ");
    //input 2nd string
        inputS[1] = JOptionPane.showInputDialog("Please enter second word or phrase: ");

//min/max strings
    // i could eliminate these assignments by putting them in the string formatter
    //call lowest
        String lowestS = getLowest(inputS[0], inputS[1]);
    //call highest
        String highestS = getHighest(inputS[0], inputS[1]);

//output strings    
    String outputS = String.format("Higher string is: %s\nLower string is: %s", highestS, lowestS);
    JOptionPane.showMessageDialog(null, outputS);
}
}