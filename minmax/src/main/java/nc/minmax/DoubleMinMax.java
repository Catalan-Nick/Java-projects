package nc.minmax;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static nc.minmax.DemoGenerics.getHighest;
import static nc.minmax.DemoGenerics.getLowest;

/**
 * @author Nicholas Catalan
 * INEW-2338 2801 8W2 Advanced JAVA
 * Date 11/28/2021
 * 
 * finds and outputs the Min and max of doubles.
 */
public class DoubleMinMax {
    public static void getMinMaxDouble(){
//create a array for holding doubles
    ArrayList<Double> inputD = new ArrayList<>();

//ask user for two doubles
    inputD.add(Double.parseDouble(JOptionPane.showInputDialog("Please enter a real number (decimal): ")));      //input comes in as string, is cast to double, 
    inputD.add(Double.parseDouble(JOptionPane.showInputDialog("Please enter second real number (decimal): ")));//then added to arraylist

//min/max doubles
    //call lowest
        Double lowerD = getLowest(inputD.get(0), inputD.get(1));
    //call highest
        Double higherD = getHighest(inputD.get(0), inputD.get(1));

//output doubles
    String outputD = String.format("Higher real number (decimal) is: %.2f\n Lower real number (decimal) is: %.2f", higherD, lowerD);
    JOptionPane.showMessageDialog(null, outputD);
        
}
}