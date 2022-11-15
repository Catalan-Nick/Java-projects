package nc.minmax;

import javax.swing.JOptionPane;

/**
 *
 * @author Nicholas Catalan
 * INEW-2338 2801 8W2 Advanced JAVA
 * Date 11/28/2021
 * a generic class with a type parameter constrained to any type that implements Comparable.  
 * The classes have methods that output the maximum and minimum values in the array. 
 * 
 */
public class DemoGenerics {
    public static void main(String[] args){
       
        Object[] possibleValues = { "Words or phrases", "Integers", "Doubles", "Exit" };//creates the choices for what to 
        
        //a drop down selection joption panel to choose what to evaluate
        Object selectedValue = JOptionPane.showInputDialog(null,"Which would you like to evaluate?", "Choices",
                JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
        
        if (selectedValue == "Words or phrases"){//finds and outputs the Min and max of strings
            StringMinMax.getMinMaxString();
        }
        else if (selectedValue == "Integers"){//finds and outputs the Min and max of ints
            IntegerMinMax.minMaxInt();
        }
        else if (selectedValue == "Doubles"){//finds and outputs the Min and max of doubles
            DoubleMinMax.getMinMaxDouble();
        }
        else
        System.exit(0);//not only covers if user selects "exit" but also cancel
}//ends main

    
 //the generic list that compares two values, returns the higher one
    public static <T extends Comparable<T>> T getHighest(T a, T b){
T highest = null;
    if(a.compareTo(b) > 0){// if a returns a positive value, a is highest
    highest = a;
    }
    else
        highest = b;
return highest;
}//ends get highest
    
 //the generic list that compares two values, returns the lower one   
public static <T extends Comparable<T>> T getLowest(T a, T b){
T lowest = null;
if(a.compareTo(b) < 0){// if a returns a negitive value, a is highest
    lowest = a;
    }
    else
        lowest = b;
return lowest;
}//ends get lowest

}//ends class

    
