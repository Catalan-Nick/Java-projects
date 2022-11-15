package nc.minmax;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static nc.minmax.DemoGenerics.getHighest;
import static nc.minmax.DemoGenerics.getLowest;

/**
 *@author Nicholas Catalan
 * INEW-2338 2801 8W2 Advanced JAVA
 * Date 11/28/2021
 * 
 * finds and outputs the Min and max of integers
 */
public class IntegerMinMax {
    public static void minMaxInt(){
//create a array for holding numbers
    ArrayList<Integer> inputN = new ArrayList<>();//done with arraylist just to see if i could

//ask user for two numbers
    inputN.add(Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer: ")));      //input comes in as string, is cast to int, 
    inputN.add(Integer.parseInt(JOptionPane.showInputDialog("Please enter a second integer: ")));//then added to arraylist

//min/max numbers
    //call lowest
        int lowerI = getLowest(inputN.get(0), inputN.get(1));
    //call highest
        int higherI = getHighest(inputN.get(0), inputN.get(1));

//output numbers
    String outputI = String.format("Higher integer is: %d\n Lower integer is: %d", higherI, lowerI);
    JOptionPane.showMessageDialog(null, outputI);
    }
}
