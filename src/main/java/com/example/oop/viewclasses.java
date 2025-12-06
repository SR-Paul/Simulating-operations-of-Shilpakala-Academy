package com.example.oop;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class viewclasses
{
    @javafx.fxml.FXML
    private TableView viewclasstableview;
    @javafx.fxml.FXML
    private TableColumn coursenamecolumn;
    @javafx.fxml.FXML
    private TableColumn enrollcolumn;
    @javafx.fxml.FXML
    private TableColumn roomcolumn;
    @javafx.fxml.FXML
    private Text viewclasstext;
    @javafx.fxml.FXML
    private TableColumn timecolumn;

    @javafx.fxml.FXML
    public void initialize() {
        enrollcolumn.setCellValueFactory(new PropertyValueFactory<>("Enroll Count"));
        roomcolumn.setCellValueFactory(new PropertyValueFactory<>("Room"));
        coursenamecolumn.setCellValueFactory(new PropertyValueFactory<>("Course Name"));
        timecolumn.setCellValueFactory(new PropertyValueFactory<>("Time"));
    }}