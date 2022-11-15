package firstgui2;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Your Name <Nicholas Catalan>
 */
public class FirstGUI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
       String int1 =
        JOptionPane.showInputDialog("Enter First interger: ");
        int num1 = Integer.parseInt(int1);
        
       String int2 =  
        JOptionPane.showInputDialog("Enter second interger:");
        int num2 = Integer.parseInt(int2);
        
        int sum = num1 + num2;
        int product = num1 * num2;
        int difference;
            if(num1 >= num2)
           difference = num1 - num2;
            else
            difference = num2 - num1;
        
        
        String message = 
                String.format("Sum of entered numbers is: %d\nProduct of entered numbers is: %d\n"
                        + "Difference of entered numbers is: %d", sum, product, difference);
        String message2 =
                String.format("Goodbye");
                
        JOptionPane.showMessageDialog(null, message);
        JOptionPane.showMessageDialog(null, message2);
        
        
    
    

        
        
    }

    
 
}
