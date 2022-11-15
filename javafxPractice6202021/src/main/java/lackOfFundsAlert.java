
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 *
 * @author Nicholas Catalan
 */
public class lackOfFundsAlert {
    
    public static void display(String title, String message){
    Stage window = new Stage();
    
    window.initModality(Modality.APPLICATION_MODAL);
    window.setTitle(title);
    window.setMinWidth(300);
    window.getIcons().add(new Image("File:z.png"));
    Label label = new Label();
    label.setText(message);
    
    Button closeButton = new Button("Okay");
    closeButton.setOnAction(e -> window.close());
    
    VBox layout = new VBox();
    layout.getChildren().addAll(label, closeButton);
    layout.setAlignment(Pos.CENTER);
    
    Scene scene = new Scene(layout);
    window.setScene(scene);
    window.showAndWait();
    
    
    }//ends display
}//ends class
