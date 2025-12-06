package com.example.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class givefeedbackController
{
    @javafx.fxml.FXML
    private RadioButton badbutton;
    @javafx.fxml.FXML
    private ComboBox coursecombobox;
    @javafx.fxml.FXML
    private TextField feedbacktextfield;
    @javafx.fxml.FXML
    private RadioButton neutralbutton;
    @javafx.fxml.FXML
    private RadioButton goofbutton;
    @javafx.fxml.FXML
    private TextArea commenttextarea;
    @javafx.fxml.FXML
    private TextField completedcoursetextfield;
    @javafx.fxml.FXML
    private RadioButton averagebutton;
    @javafx.fxml.FXML
    private Label thankyoulabel;
    @javafx.fxml.FXML
    private TextField reviewtextfield;

    @javafx.fxml.FXML
    public void initialize() {
        coursecombobox.getItems().addAll("calligraphy111","cinematrography233","kathakdance200");
    }

    @javafx.fxml.FXML
    public void submitfeedbackOA(ActionEvent actionEvent) {
    }
}