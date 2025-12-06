package com.example.oop;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewResultController
{
    @javafx.fxml.FXML
    private TableColumn markcolumn;
    @javafx.fxml.FXML
    private ComboBox coursecombobox;
    @javafx.fxml.FXML
    private TableColumn Gradecolumn;
    @javafx.fxml.FXML
    private TableColumn instructorfeedback;
    @javafx.fxml.FXML
    private TextField resulttextfield;
    @javafx.fxml.FXML
    private TableView resulttableview;
    @javafx.fxml.FXML
    private TableColumn assignmnetcolumn;
    @javafx.fxml.FXML
    private TextField coursetextfield;

    @javafx.fxml.FXML
    public void initialize() {
        coursecombobox.getItems().addAll("pottery104","cinematography302","calligraphy111");

        markcolumn.setCellValueFactory(new PropertyValueFactory<>("Marks"));
        Gradecolumn.setCellValueFactory(new PropertyValueFactory<>("Grade"));
        assignmnetcolumn.setCellValueFactory(new PropertyValueFactory<>("Assignment name"));
        instructorfeedback.setCellValueFactory(new PropertyValueFactory<>("Instructor Feedback"));

    }}