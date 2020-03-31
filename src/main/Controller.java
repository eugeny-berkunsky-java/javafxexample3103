package main;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label sumLabel;
    @FXML
    private TextField aField;
    @FXML
    private TextField bField;
    @FXML
    private TextField nameField;

    public void exit() {
        Platform.exit();
    }

    public void about() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setContentText("Наша первая программа JavaFX");
        alert.setTitle("О программе");
        alert.setHeaderText("");
        alert.show();
    }

    public void sayHello() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Hello!");
        alert.setHeaderText("");
        alert.setContentText("Hello, " + nameField.getText());
        alert.show();
    }

    public void calcSum() {
        double a = Double.parseDouble(aField.getText());
        double b = Double.parseDouble(bField.getText());
        double sum = a + b;
        sumLabel.setText(String.format("Sum %4.1f + %4.1f = %4.1f", a, b, sum));
    }
}
