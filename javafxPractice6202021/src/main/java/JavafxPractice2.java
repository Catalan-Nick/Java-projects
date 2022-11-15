
import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/*
to do
* a help button for bet guide and rupee amount
* indicators for which lines are active
* 
*
*/

public class JavafxPractice2 extends Application{
   
    int balance = 20;//for money amount
    
//9 random number containers
    int int_random1;
    int int_random2;
    int int_random3;
    int int_random4;
    int int_random5;
    int int_random6;
    int int_random7;
    int int_random8;
    int int_random9;
    
    //
    ImageView slot1;
    ImageView slot2;
    ImageView slot3;
    ImageView slot4;
    ImageView slot5;
    ImageView slot6;
    ImageView slot7;
    ImageView slot8;
    ImageView slot9;
    
    
    int resultAmount = 0; // how much the balance changed after last spin
    int resultAmount1 = 0; // how much the balance changed after last spin
    int resultAmount2 = 0; // how much the balance changed after last spin
    int resultAmount3 = 0; // how much the balance changed after last spin
    int resultAmount4 = 0; // how much the balance changed after last spin
    int resultAmount5 = 0; // how much the balance changed after last spin
    Scene gameOver;
   // public Stage primaryStage;
    MediaPlayer player, gameOverPlayer;
    int winSound;
    public static void main(String[] args){
   //launch the application
   launch(args);
   
   }
   
    @Override
   public void start(Stage primaryStage){
   
       //9 rolls for 9 images
    int_random1 = Roll.rollNum();
    int_random2 = Roll.rollNum();
    int_random3 = Roll.rollNum();
    int_random4 = Roll.rollNum();
    int_random5 = Roll.rollNum();
    int_random6 = Roll.rollNum();
    int_random7 = Roll.rollNum();
    int_random8 = Roll.rollNum();
    int_random9 = Roll.rollNum();
     
       //re-roll for colums to have one of each ** taken out in-game but left here just in case
    while(int_random4 == int_random1 || int_random4 == int_random7){
        int_random4 = Roll.rollNum();
        }
    while(int_random5 == int_random2 || int_random5 == int_random8){
        int_random5 = Roll.rollNum();
        }
    while(int_random6 == int_random3 || int_random6 == int_random9){
        int_random6 = Roll.rollNum();
        }
    while(int_random7 == int_random4 || int_random7 == int_random1){
        int_random7 = Roll.rollNum();
        }
    while(int_random8 == int_random5 || int_random8 == int_random2){
        int_random8 = Roll.rollNum();
        }
    while(int_random9 == int_random6 || int_random9 == int_random3){
        int_random9 = Roll.rollNum();
        }
    
       //mount the 9 images
    slot1 = Spin.spinSlot(int_random1);
    slot2 = Spin.spinSlot(int_random2);
    slot3 = Spin.spinSlot(int_random3);
    slot4 = Spin.spinSlot(int_random4);
    slot5 = Spin.spinSlot(int_random5);
    slot6 = Spin.spinSlot(int_random6);
    slot7 = Spin.spinSlot(int_random7);
    slot8 = Spin.spinSlot(int_random8);
    slot9 = Spin.spinSlot(int_random9);

       //format the images
    int height = 100;
    slot1.setFitHeight(height);
    slot1.preserveRatioProperty();
    slot2.setFitHeight(height);
    slot2.preserveRatioProperty();
    slot3.setFitHeight(height);
    slot3.preserveRatioProperty();
    slot4.setFitHeight(height);
    slot4.preserveRatioProperty();
    slot5.setFitHeight(height);
    slot5.preserveRatioProperty();
    slot6.setFitHeight(height);
    slot6.preserveRatioProperty();
    slot7.setFitHeight(height);
    slot7.preserveRatioProperty();
    slot8.setFitHeight(height);
    slot8.preserveRatioProperty();
    slot9.setFitHeight(height);
    slot9.preserveRatioProperty();
      
//balance label
    Image image = new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/bag.png");
    ImageView bagPic = new ImageView();
    bagPic.setImage(image);
    bagPic.setFitHeight(20);
    bagPic.setFitWidth(20);
    Label bag = new Label("You have: " + balance, bagPic);
    bag.setContentDisplay(ContentDisplay.RIGHT);
    bag.setTextFill(Color.GOLD);
    bag.setAlignment(Pos.TOP_RIGHT);
     
//results label
    ImageView resultPic = new ImageView(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/triforce.png"));
    resultPic.setFitHeight(75);
    resultPic.setFitWidth(90);
    Label result = new Label("Place your bet",resultPic);
    result.setContentDisplay(ContentDisplay.TOP);
    result.setTextFill(Color.GOLD);
//Wins table
    ImageView rupee1 = new ImageView(new Image("File:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/1.png"));
    ImageView rupee5 = new ImageView(new Image("File:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/2.png"));
    ImageView rupee20 = new ImageView(new Image("File:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/3.png"));
    ImageView rupee50 = new ImageView(new Image("File:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/4.png"));
    ImageView rupee100 = new ImageView(new Image("File:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/5.png"));
    ImageView rupee300 = new ImageView(new Image("File:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/6.png"));
    //format the win images
    int hSize = 30;
    int wSize = 20;
    rupee1.setFitHeight(hSize);
    rupee1.setFitWidth(wSize);
    rupee5.setFitHeight(hSize);
    rupee5.setFitWidth(wSize);
    rupee20.setFitHeight(hSize);
    rupee20.setFitWidth(wSize);
    rupee50.setFitHeight(hSize);
    rupee50.setFitWidth(wSize);
    rupee100.setFitHeight(hSize);
    rupee100.setFitWidth(wSize);
    rupee300.setFitHeight(hSize);
    rupee300.setFitWidth(wSize);

    Label worth1 = new Label(" = 1", rupee1);
    Label worth2 = new Label(" = 5", rupee5);
    Label worth3 = new Label(" = 20", rupee20);
    Label worth4 = new Label(" = 50", rupee50);
    Label worth5 = new Label(" = 100", rupee100);
    Label worth6 = new Label(" = 300", rupee300);
        
    worth1.setTextFill(Color.GOLD);
    worth2.setTextFill(Color.GOLD);
    worth3.setTextFill(Color.GOLD);
    worth4.setTextFill(Color.GOLD);
    worth5.setTextFill(Color.GOLD);
    worth6.setTextFill(Color.GOLD);
    
        
        //mount the labels to a vbox
    VBox winTable = new VBox(5, worth1, worth2, worth3, worth4, worth5, worth6);
    winTable.setAlignment(Pos.CENTER);
    winTable.setPadding(new Insets(0, 40, 0, 15));
//menu bar
MenuBar menu = new MenuBar();
Menu fileMenu = new Menu("_File");
MenuItem exitItem = new MenuItem("_Exit");
    exitItem.setOnAction(e -> primaryStage.close());

fileMenu.getItems().add(exitItem);
menu.getMenus().add(fileMenu);
//gameOver Scene
    Label youlost = new Label("Game Over");
    youlost.setMinSize(400, 300);
    youlost.setFont(new Font("Arial", 80));
    youlost.setTextFill(Color.RED);
    Button closeWindow = new Button("Close Window");
    closeWindow.setOnAction(e -> primaryStage.close());

    VBox lost = new VBox(youlost,closeWindow);
    lost.setAlignment(Pos.CENTER);
    lost.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
    gameOver = new Scene(lost);
    gameOver.getStylesheets().add("File:style.css");

/*
 win method in every button has unnecessary condition inside of it
    it could receive just one number
*/       
//create a button to bet 1
    Button smallBet = new Button("Spin for 1");
    smallBet.setStyle(" -fx-background-color: green");
    
    smallBet.setTextFill(Color.NAVY);
        //handle the event
    smallBet.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent e) {
        balance -= 1;// each spin cost 1
        //AudioClip
        new AudioClip(new File("C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/sounds/OOT_Get_Rupee.wav").toURI().toString()).play();
        rolledPics();
        //win condition
        if (int_random4 == int_random5 && int_random4 == int_random6){
            new AudioClip(new File("C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/sounds/OOT_SilverRupee1.wav").toURI().toString()).play();
            resultAmount = Win.win(int_random4, int_random5, int_random6);
        
        balance += resultAmount;
        result.setText("You Won " + resultAmount + " rupees!");
        resultPic.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/triforce.png"));
        bag.setText("You have: " + balance);  

    }
    else {
    if(balance == 0){
    gameOver(primaryStage);
    }
    else{
    result.setText("You loose 1 rupee");

    resultPic.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/triforce-down.png"));
    bag.setText("You have: " + balance); 
    }
        }
     }
    });
      
//create a button to bet 5
    Button mediumBet = new Button("Spin for 5");
    mediumBet.setStyle(" -fx-background-color: darkblue");
    
        //handle the event
    mediumBet.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent e) {
        if(balance >= 5 ){
        balance -= 5;// each spin cost 5
        new AudioClip(new File("C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/sounds/OOT_Get_Rupee.wav").toURI().toString()).play();
        rolledPics();
        //win conditions
            //if the middle is won
            winSound = 0;
        if (int_random4 == int_random5 && int_random4 == int_random6){
        resultAmount1 = Win.win(int_random4, int_random5, int_random6);
        winSound +=1;
        }
        
            //if the top is won
        if (int_random1 == int_random2 && int_random1 == int_random3){
        resultAmount2 = Win.win(int_random1, int_random2, int_random3);
        winSound +=1; 
        }
            //if the bottom is won
        if (int_random7 == int_random8 && int_random7 == int_random9){
        resultAmount3 = Win.win(int_random7, int_random8, int_random9);
        winSound +=1;
        }
        
        if (winSound > 0){
        new AudioClip(new File("C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/sounds/OOT_SilverRupee" + winSound + ".wav").toURI().toString()).play();
        }
        //total up the winnings
        resultAmount = resultAmount1 + resultAmount2 + resultAmount3;
        
        //if you won anything display how much else how much you lost
        if (resultAmount > 0){
        balance += resultAmount;  
        result.setText("You Won " + resultAmount + " rupees!");
        resultPic.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/triforce.png"));
        bag.setText("You have: " + balance);  
        }
        else{
        result.setText("You loose 5 rupees");
        resultPic.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/triforce-down.png"));
        bag.setText("You have: " + balance);
            }
        //if you're out of money, you loose.
        if(balance <= 0){
        gameOver(primaryStage);
        }

        resultAmount  = 0;
        resultAmount1 = 0;
        resultAmount2 = 0;
        resultAmount3 = 0;
        }//ends funds check if
        else{
           lackOfFundsAlert.display("Not enough rupees", "You don't have enough to bet this much.");
         
        } 
        }//ends the buttons event
        });//ends the button
    
//create a button to bet 20
    Button bigBet = new Button("Spin for 20");
    bigBet.setStyle(" -fx-background-color: darkred");
    
        //handle the event
    bigBet.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent e) {
        if(balance >= 20 ){
        
        balance -= 20;// each spin cost 20
        new AudioClip(new File("C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/sounds/OOT_Get_Rupee.wav").toURI().toString()).play();
        rolledPics();
        winSound = 0;
        //win conditions
            //if the middle is won
        if (int_random4 == int_random5 && int_random4 == int_random6){
            resultAmount1 = Win.win(int_random4, int_random5, int_random6);
            winSound +=1;
        }
        
            //if the top is won
        if (int_random1 == int_random2 && int_random1 == int_random3){
            resultAmount2 = Win.win(int_random1, int_random2, int_random3);
            winSound +=1;
        }
            //if the bottom is won
        if (int_random7 == int_random8 && int_random7 == int_random9){
            resultAmount3 = Win.win(int_random7, int_random8, int_random9);
            winSound +=1;
        }
            //if top left to bottom right is won
        if (int_random1 == int_random5 && int_random1 == int_random9){
            resultAmount4 = Win.win(int_random1, int_random5, int_random9);
            winSound +=1;
        }
            //if bottom left to top right is won
        if (int_random7 == int_random5 && int_random7 == int_random3){
        resultAmount4 = Win.win(int_random7, int_random5, int_random3);
            winSound +=1;
        }      
        if (winSound > 0){
            new AudioClip(new File("C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/sounds/OOT_SilverRupee4.wav").toURI().toString()).play();
        }
        //total up the winnings
        resultAmount = resultAmount1 + resultAmount2 + resultAmount3 + resultAmount4 + resultAmount5;
        
        //if you won anything display how much else how much you lost
        if (resultAmount > 0){
        balance += resultAmount;  
        result.setText("You Won " + resultAmount + " rupees!");
        resultPic.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/triforce.png"));
        bag.setText("You have: " + balance);  
        }
        else{
        result.setText("You loose 20 rupees");
        resultPic.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/triforce-down.png"));
        bag.setText("You have: " + balance);
            }
        //if you're out of money, you loose.
        if(balance <= 0){
        gameOver(primaryStage);
        }

        resultAmount  = 0;
        resultAmount1 = 0;
        resultAmount2 = 0;
        resultAmount3 = 0;
        resultAmount4 = 0;
        resultAmount5 = 0;
        }//ends funds check if
        else{
           lackOfFundsAlert.display("Not enough rupees", "You don't have enough to bet this much.");
         
        }
    
    }//ends the buttons event
        });//ends the button


//Mounting
    //all the images into three rows   
    HBox slotsTop = new HBox(20, slot1, slot2, slot3);
    slotsTop.setId("topslot");
    HBox slotsMiddle = new HBox(20, slot4, slot5, slot6);
    slotsMiddle.setId("middleslot");
    HBox slotsBottom = new HBox(20, slot7, slot8, slot9);
    slotsBottom.setId("bottomslot");
    slotsTop.setPadding(new Insets(20));
    slotsMiddle.setPadding(new Insets(20));
    slotsBottom.setPadding(new Insets(20));
    
    //three rows into one container
    VBox slots = new VBox(-30, slotsTop, slotsMiddle, slotsBottom);
    
    //a container for the right that has balance and result labels
    VBox rightSide = new VBox(15, bag, result);
    
    //a hbox for the three buttons
    HBox buttons = new HBox(20, smallBet, mediumBet, bigBet);
    buttons.setAlignment(Pos.CENTER);
//sound
    //Media media = new Media("file:music.mp3"); 
      Media media = new Media(new File("music.mp3").toURI().toString());
      player = new MediaPlayer(media); 
       

        MediaView Audio = new MediaView(player);
       player.play();
//borderPane containing all images, lables, and buttons
    BorderPane pane = new BorderPane();
        pane.setId("pane");
        pane.setTop(menu);
        pane.setCenter(slots);
        pane.setRight(rightSide);
        pane.setLeft(winTable); 
        pane.setBottom(buttons);
        BorderPane.setAlignment(rightSide, Pos.TOP_LEFT);
 //       BorderPane.setMargin(slots, new Insets(0, 0, 0, 80));
 //background image
   // pane.setBackground(new Background(new BackgroundImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/slate.jpg"),BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));

      Scene scene = new Scene(pane,480,420);
      scene.getStylesheets().add("File:style.css");
      //add scene to stage
      primaryStage.setScene(scene);
      primaryStage.setTitle("Slots");
      primaryStage.getIcons().add(new Image("File:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/z.png"));
      primaryStage.show();
   
   }//ends start
   public void gameOver(Stage primaryStage){
        primaryStage.setScene(gameOver);
        player.pause();
        Media gameOverMedia = new Media(new File("gameOver.mp3").toURI().toString());
        gameOverPlayer = new MediaPlayer(gameOverMedia); 
        MediaView gameOverAudio = new MediaView(player);
        gameOverPlayer.play();
       
       
       
   }//ends gameOver
   
   public void rolledPics(){
           //9 new random numbers
        int_random1 = Roll.rollNum();
        int_random2 = Roll.rollNum();
        int_random3 = Roll.rollNum();
        int_random4 = Roll.rollNum();
        int_random5 = Roll.rollNum();
        int_random6 = Roll.rollNum();
        int_random7 = Roll.rollNum();
        int_random8 = Roll.rollNum();
        int_random9 = Roll.rollNum();

        //spins with the new numbers
        slot1.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/" + int_random1 + ".png"));
        slot2.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/" + int_random2 + ".png"));
        slot3.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/" + int_random3 + ".png"));
        slot4.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/" + int_random4 + ".png"));
        slot5.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/" + int_random5 + ".png"));
        slot6.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/" + int_random6 + ".png"));
        slot7.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/" + int_random7 + ".png"));
        slot8.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/" + int_random8 + ".png"));
        slot9.setImage(new Image("file:C:/Users/HP/Documents/NetBeansProjects/javafxPractice6202021/images/" + int_random9 + ".png"));
        
   }//ends rolledPics
}//ends class