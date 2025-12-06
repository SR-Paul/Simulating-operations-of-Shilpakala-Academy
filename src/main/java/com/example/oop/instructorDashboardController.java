package com.example.oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class instructorDashboardController
{
    @javafx.fxml.FXML
    private TextField instructortextfield;
    @javafx.fxml.FXML
    private Text shilpokalaAcademytext;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void takeattendenceOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("instructor/takeattendence.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("taking attendence");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void ScheduleclassesOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("instructor/Scheduleclass.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("schedule class");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void uploadlessonmaterialOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("instructor/instructor_uploadmaterials.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("uploading class materials");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void myclassesOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("instructor/viewclasses.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("view class");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void evaluateAssignmentOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("instructor/evaluateassignment.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("evaluation assignment");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void StudiobookingOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("instructor/bookstudio.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("request studio");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void viewfeedbackOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("instructor/Viewfeedback.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("viewfeedback");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void sendannouncementOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("instructor/sendannouncement.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("send announcement");
            nextstage.show();


        } catch (Exception e) {

        }
    }}