package com.example.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class instructor_uploadmaterialsController
{
    @javafx.fxml.FXML
    private Text uploadmaterialstext;
    @javafx.fxml.FXML
    private TextField seleccoursetextfield;
    @javafx.fxml.FXML
    private ComboBox selectedcoursecombobox;

    @javafx.fxml.FXML
    public void initialize() {
        selectedcoursecombobox.getItems().addAll("calligraphy211","cinematrography233","kathakdance200");
    }

    @javafx.fxml.FXML
    public void attachfilesOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void uploadOA(ActionEvent actionEvent) {
    }
}