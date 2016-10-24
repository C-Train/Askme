
package askme;

import java.awt.Rectangle;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.effect.BlendMode;
import javafx.scene.paint.Color;
//import javafx.scene.paint.Color;

import javafx.scene.shape.Ellipse;



/**
 *
 * @author FF
 */
public class FXMLDocumentController implements Initializable {

    private static final Random rnd = new Random();

    @FXML
    private Label label1;

    @FXML
    private TextArea textarea1;

    @FXML
    private ColorPicker colorpicker;
    @FXML
    private Ellipse ellips; 
    @FXML
    private Rectangle rect;
    @FXML
    private void handleButtonAction(ActionEvent event) {

        int n = rnd.nextInt(7);
        switch (n) {
            case 0:
              
                textarea1.setText("today is a good day");
                
               
                break;
            case 1:
                textarea1.setText("A faithful friend is worth more ");
               
                break;
            case 2:
                textarea1.setText("A friend is one who knows us, but loves us anyway");
               
                break;
            case 3:
                textarea1.setText("A closed mouth gathers no feet");
             
                break;
            case 4:
                textarea1.setText("Born Free. . . . .Taxed to Death");
              
            case 5:
                textarea1.setText("Out of my mind. Back in five minutes");
                
                break;
            case 6:
                textarea1.setText(" please wait….Searching….searching…still searching….sorry,NO BRAIN found…!");

//              textfield1.setText(".......");
        }
          textarea1.setBlendMode(BlendMode.RED);
        textarea1.setBlendMode(BlendMode.GREEN);
  
    }

    @FXML
    public  void handlePickupRecAction(ActionEvent event) {
      System.out.println("hello");
        ellips.setFill(colorpicker.getValue());
        int n = rnd.nextInt(7);
        switch (n) {
            case 0:
              
                textarea1.setText("today is a good day");
                
               
                break;
            case 1:
                textarea1.setText("A faithful friend is worth more ");
               
                break;
            case 2:
                textarea1.setText("A friend is one who knows us, but loves us anyway");
               
                break;
            case 3:
                textarea1.setText("A closed mouth gathers no feet");
             
                break;
            case 4:
                textarea1.setText("Born Free. . . . .Taxed to Death");
              
            case 5:
                textarea1.setText("Out of my mind. Back in five minutes");
                
                break;
            case 6:
                textarea1.setText(" please wait….Searching….searching…still searching….sorry,NO BRAIN found…!");

//              textfield1.setText(".......");
        }
          textarea1.setBlendMode(BlendMode.RED);
   
      
        
    }

    @FXML
    public void handleButtonAction1(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
