
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 *
 * @author Nicholas Catalan
 */
public class Spin {
    public static ImageView spinSlot(int roll){
    Image image = new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/" + roll + ".png");
    ImageView spun = new ImageView(image);
    return spun;
    }
    
    


}

