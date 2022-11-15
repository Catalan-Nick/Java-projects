
import java.util.Random;


/**
 *
 * @author Nicholas Catalan
 */
public class Roll {
    public static int rollNum(){
    Random rand = new Random(); //instance of random class
      int upperbound = 6;
     
      //generate three random numbers
      int roll = rand.nextInt(upperbound) + 1;
    
    return roll;
    }
}
