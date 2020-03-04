package sample;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField TextFieldSymbol;

    @FXML
    private TextField AsciiField;

    @FXML
    private Button Button;

    @FXML
    void initialize() {
        Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
             String temp = TextFieldSymbol.getText().trim();
             int i = Integer.parseInt(temp);
             AsciiField.setText(Integer.toBinaryString(i));
            }
        });

    }

}
