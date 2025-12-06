package com.example.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class viewfeedbackController
{
    @javafx.fxml.FXML
    private TableView feedbacktable;
    @javafx.fxml.FXML
    private TableColumn lastfeedbackcolumn;
    @javafx.fxml.FXML
    private Text studentfeedbacktext;
    @javafx.fxml.FXML
    private ComboBox coursecombobox;
    @javafx.fxml.FXML
    private TableColumn totalresponsecolumn;
    @javafx.fxml.FXML
    private TableColumn coursenamecolumn;
    @javafx.fxml.FXML
    private Text semestertext;
    @javafx.fxml.FXML
    private Text coursetext;
    @javafx.fxml.FXML
    private TableColumn ratingcolumn;
    @javafx.fxml.FXML
    private ComboBox semestercombobox;
    @javafx.fxml.FXML
    public void initialize() {
        coursenamecolumn.setCellValueFactory(new PropertyValueFactory<>("Submission Date"));
        totalresponsecolumn.setCellValueFactory(new PropertyValueFactory<>("Submission Date"));
        ratingcolumn.setCellValueFactory(new PropertyValueFactory<>("Submission Date"));
        lastfeedbackcolumn.setCellValueFactory(new PropertyValueFactory<>("Submission Date"));
    }

    @javafx.fxml.FXML
    public void viewcommentsOA(ActionEvent actionEvent) {
    }
}