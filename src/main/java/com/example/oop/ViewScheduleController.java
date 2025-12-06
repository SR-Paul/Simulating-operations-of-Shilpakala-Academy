package com.example.oop;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewScheduleController
{
    @javafx.fxml.FXML
    private TableColumn coursename;
    @javafx.fxml.FXML
    private TableColumn instructor;
    @javafx.fxml.FXML
    private TableView viewtableview;
    @javafx.fxml.FXML
    private TableColumn classroom;
    @javafx.fxml.FXML
    private TextField viewscheduletextfield;
    @javafx.fxml.FXML
    private TableColumn classtime;

    @javafx.fxml.FXML
    public void initialize() {
        classroom.setCellValueFactory(new PropertyValueFactory<>("Class Room"));
        coursename.setCellValueFactory(new PropertyValueFactory<>("Course Name"));
        instructor.setCellValueFactory(new PropertyValueFactory<>("Instructor"));
        classtime.setCellValueFactory(new PropertyValueFactory<>("Class Time"));

    }}