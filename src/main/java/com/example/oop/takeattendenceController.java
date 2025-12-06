package com.example.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class takeattendenceController
{
    @javafx.fxml.FXML
    private Text datetext;
    @javafx.fxml.FXML
    private ComboBox coursecombobox;
    @javafx.fxml.FXML
    private TableColumn studentnamecolumn;
    @javafx.fxml.FXML
    private Text selectcoursetext;
    @javafx.fxml.FXML
    private TableColumn studentidcolumn;
    @javafx.fxml.FXML
    private Text shilpokalaacademytext;
    @javafx.fxml.FXML
    private TableColumn attendencestatuscolumn;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private TableView attendencetableview;

    @javafx.fxml.FXML
    public void initialize() {
        coursecombobox.getItems().addAll("pottery104","cinematography302","calligraphy111");

        attendencestatuscolumn.setCellValueFactory(new PropertyValueFactory<>("Student name"));
        studentidcolumn.setCellValueFactory(new PropertyValueFactory<>("Student ID"));
        studentnamecolumn.setCellValueFactory(new PropertyValueFactory<>("Attendence Status"));
    }

    @javafx.fxml.FXML
    public void saveattendenceOA(ActionEvent actionEvent) {
    }
}