package com.example.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class SubmitAssignmentController
{
    @javafx.fxml.FXML
    private TextField submitassignmenttextfield;
    @javafx.fxml.FXML
    private TextField detailstextfield;
    @javafx.fxml.FXML
    private ComboBox selectcoursecombobox;
    @javafx.fxml.FXML
    private TextField coursetextfield;

    @javafx.fxml.FXML
    public void initialize() {
        selectcoursecombobox.getItems().addAll("pottery104","cinematography302","calligraphy111");
    }

    @javafx.fxml.FXML
    public void UploadOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SubmitOA(ActionEvent actionEvent) {
    }
}