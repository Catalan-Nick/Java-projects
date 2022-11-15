
/**
 *
 * @author Nicholas Catalan
 */
public class Win {
    public static int win(int r1, int r2, int r3){
    int amount = 0;
    if (r1 == r2 && r1 == r3){
            
            switch(r1){
                case 1:
                    amount += 1;
                    
                    break;
                case 2:
                    amount += 5;
                    
                    break;
                case 3:
                    amount += 20;
                    
                    break;
                case 4:
                    amount += 50;
                    
                    break;
                case 5:
                    amount += 100;
                    
                    break;
                case 6:
                    amount += 300;
                    
                    break;
                            }
    }
return amount;
}
}
