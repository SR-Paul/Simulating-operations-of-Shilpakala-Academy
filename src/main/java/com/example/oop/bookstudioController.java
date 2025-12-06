package com.example.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class bookstudioController
{
    @javafx.fxml.FXML
    private Text halltypetextarea;
    @javafx.fxml.FXML
    private Text preferredtext;
    @javafx.fxml.FXML
    private ComboBox halltypecombobox;
    @javafx.fxml.FXML
    private Text purposetext;
    @javafx.fxml.FXML
    private DatePicker preferreddatepicer;
    @javafx.fxml.FXML
    private TextArea purposetextarea;

    @javafx.fxml.FXML
    public void initialize() {
        halltypecombobox.getItems().addAll("Studio A","Studio C","lecture Hall 5","Lecture Hall 2");

    }

    @javafx.fxml.FXML
    public void submitrequestOA(ActionEvent actionEvent) {
    }
}