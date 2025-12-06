package com.example.oop;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StudentDashboardController
{
    @javafx.fxml.FXML
    private TextField studentdashboard;
    @javafx.fxml.FXML
    private Text shilpokalaacademy;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void DownloadCertificateOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("student/downloadcertificate.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("downloading certificate");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void applyOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("student/applyevent.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("apply to event");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void SubmitOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("student/submitAssignment.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("submit assignment");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void registerOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("student/courseregistration.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("register to course");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void feedbackOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("student/givefeedback.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("give feedback");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void ViewResultOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("student/viewresult.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("viewresult");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void paymentOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("student/viewresult.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("view result");
            nextstage.show();


        } catch (Exception e) {

        }
    }

    @javafx.fxml.FXML
    public void ViewscheduleOA(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("student/viewschedule.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage nextstage = new Stage();
            nextstage.setScene(scene);
            nextstage.setTitle("view schedule");
            nextstage.show();


        } catch (Exception e) {

        }
    }
}