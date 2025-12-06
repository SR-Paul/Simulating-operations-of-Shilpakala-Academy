package com.example.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class evaluateassignment
{
    @javafx.fxml.FXML
    private TableColumn submissioncoiumn;
    @javafx.fxml.FXML
    private TableColumn markcolumn;
    @javafx.fxml.FXML
    private Text evaluateassignmenttext;
    @javafx.fxml.FXML
    private ComboBox coursecombobox;
    @javafx.fxml.FXML
    private TableColumn studentnamecolumn;
    @javafx.fxml.FXML
    private TableColumn submissionidcolumn;
    @javafx.fxml.FXML
    private TableColumn equivalentgradecolumn;
    @javafx.fxml.FXML
    private ComboBox assignmentcombobox;
    @javafx.fxml.FXML
    private TableView evaluationtableview;
    @javafx.fxml.FXML
    private Text coursetext;
    @javafx.fxml.FXML
    private Text assignmenttext;
    @javafx.fxml.FXML
    private TableColumn feedbackcolumn;

    @javafx.fxml.FXML
    public void initialize() {
        coursecombobox.getItems().addAll("pottery104","cinematography302","calligraphy111");
        assignmentcombobox.getItems().addAll("pottery workshop","cinematography","calligraphy");


        submissioncoiumn.setCellValueFactory(new PropertyValueFactory<>("Submission Date"));
        studentnamecolumn.setCellValueFactory(new PropertyValueFactory<>("Student Name"));
        submissionidcolumn.setCellValueFactory(new PropertyValueFactory<>("Submission ID"));
        equivalentgradecolumn.setCellValueFactory(new PropertyValueFactory<>("Equivalent Grade"));
        markcolumn.setCellValueFactory(new PropertyValueFactory<>("Mark"));
        feedbackcolumn.setCellValueFactory(new PropertyValueFactory<>("FeedBack"));

    }

    @javafx.fxml.FXML
    public void saveevaluationOA(ActionEvent actionEvent) {
    }
}