package com.example.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.text.Text;

public class scheduleclass
{
    @javafx.fxml.FXML
    private Text datetext;
    @javafx.fxml.FXML
    private ComboBox roomselectioncombobox;
    @javafx.fxml.FXML
    private ComboBox coursecombobox;
    @javafx.fxml.FXML
    private ComboBox timeslotcombobox;
    @javafx.fxml.FXML
    private Text timeslottext;
    @javafx.fxml.FXML
    private Text scheduleclasstext;
    @javafx.fxml.FXML
    private Text roomselectiontext;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private Text coursetext;

    @javafx.fxml.FXML
    public void initialize() {
        roomselectioncombobox.getItems().addAll("Studio A","Studio C","lecture Hall 5","Lecture Hall 2");
        timeslotcombobox.getItems().addAll("Sunday(11;20-1)","saturday(3.00-4.30","tuesday(2.00-3.30)");
        coursecombobox.getItems().addAll("pottery104","cinematography302","calligraphy111");
    }

    @javafx.fxml.FXML
    public void savescheduleOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CheckConflictOA(ActionEvent actionEvent) {
    }
}