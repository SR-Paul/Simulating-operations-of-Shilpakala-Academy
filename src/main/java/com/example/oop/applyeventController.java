package com.example.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class applyeventController
{
    @javafx.fxml.FXML
    private TextField showapplicationtextfield;
    @javafx.fxml.FXML
    private TableColumn eventcolumn;
    @javafx.fxml.FXML
    private TableView eventtableview;
    @javafx.fxml.FXML
    private TableColumn eventtimecolumn;
    @javafx.fxml.FXML
    private TextField eventtextfield;
    @javafx.fxml.FXML
    private TextField applicationIDtextfield;
    @javafx.fxml.FXML
    private TableColumn venuecolumn;

    @javafx.fxml.FXML
    public void initialize() {
        eventcolumn.setCellValueFactory(new PropertyValueFactory<>("Event"));
        eventtimecolumn.setCellValueFactory(new PropertyValueFactory<>("Event Time"));
        venuecolumn.setCellValueFactory(new PropertyValueFactory<>("Venue"));

    }

    @javafx.fxml.FXML
    public void submitapplicationOA(ActionEvent actionEvent) {
    }
}