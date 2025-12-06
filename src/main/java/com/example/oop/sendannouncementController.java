package com.example.oop;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class sendannouncementController
{
    @javafx.fxml.FXML
    private Text sendannouncementtext;
    @javafx.fxml.FXML
    private ComboBox coursecombobox;
    @javafx.fxml.FXML
    private Text announcementmessagetext;
    @javafx.fxml.FXML
    private TextArea announcementtextarea;
    @javafx.fxml.FXML
    private Text coursetext;

    @javafx.fxml.FXML
    public void initialize() {
        coursecombobox.getItems().addAll("pottery104","cinematography302","calligraphy111");
    }

    @javafx.fxml.FXML
    public void sendannouncementOA(ActionEvent actionEvent) {
    }
}