package nc.gui_test;
import com.sun.javafx.scene.control.behavior.TextFieldBehavior;
import java.awt.BorderLayout;
import java.awt.Color;
    import javax.swing.*;    
    import java.awt.event.*;    
    import java.text.SimpleDateFormat;
    import java.util.Date;
import javafx.scene.image.Image;

    public class thththththt {    
    JFrame theaterBox;    
    thththththt(){    
        String date = new SimpleDateFormat("MMM -dd-yyyy").format(new Date());
        theaterBox=new JFrame("Theater totals for " + date);   
        final JLabel labelGA = new JLabel();
        JTextField textGA = new JTextField("      ",15);
        labelGA.setHorizontalAlignment(JLabel.CENTER);  
        labelGA.setSize(400,100);  
        JButton b=new JButton("Show");  
        b.setBounds(200,100,75,20);  
        String languages[]={"C","C++","C#","Java","PHP"};        
        final JComboBox cb=new JComboBox(languages);    
        cb.setBounds(50, 100,90,20); 
        textGA.setBounds(50, 100,90,20);
        
      
//theaterBox.add(cb); 
        theaterBox.add(textGA);
        theaterBox.add(labelGA); 
        theaterBox.add(b);   
        theaterBox.setLayout(null);    
        theaterBox.setSize(667,352);    
        theaterBox.setVisible(true);       
        b.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {       
    String data = "Programming language Selected: "   
       + cb.getItemAt(cb.getSelectedIndex());  
    labelGA.setText(data);  
    }  
    });  
        
      
    }    
   
    public static void main(String[] args) {    
        new thththththt();         
        
    }    
    }    