package com.example.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class downloadcertificateController
{
    @javafx.fxml.FXML
    private TableColumn completiondatecolumn;
    @javafx.fxml.FXML
    private TableColumn coursenamecolumn;
    @javafx.fxml.FXML
    private TextField certificatetextfield;
    @javafx.fxml.FXML
    private TableColumn certificatestatuscolumn;
    @javafx.fxml.FXML
    private TableView certificateinfotableview;
    @javafx.fxml.FXML
    private TableColumn instructorcolumn;

    @javafx.fxml.FXML
    public void initialize() {
        completiondatecolumn.setCellValueFactory(new PropertyValueFactory<>("Completion Date"));
        coursenamecolumn.setCellValueFactory(new PropertyValueFactory<>("Course Name"));
        certificatestatuscolumn.setCellValueFactory(new PropertyValueFactory<>("Certificate Status"));
        instructorcolumn.setCellValueFactory(new PropertyValueFactory<>("Instructor"));
    }

    @javafx.fxml.FXML
    public void downloadOA(ActionEvent actionEvent) {
    }
}