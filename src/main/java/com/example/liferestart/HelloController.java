package com.example.liferestart;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    @FXML
    private Label welcomeToJava;

    @FXML
    private Button button1;

    @FXML
    private void initialize(){
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("ok.png")));
        button1 = new Button("OK",new ImageView(image));
    }

    @FXML
    protected void onHelloButtonClick() throws IOException {

        welcomeToJava.setText("Welcome to JavaFX Application!");
        // Load the fxml file and create a new stage for the popup dialog.
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(HelloApplication.class.getResource("view/PersonEditDialog.fxml"));
        AnchorPane page = (AnchorPane) loader.load();

        // Create the dialog Stage.
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Edit Person");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        Scene scene = new Scene(page);
        dialogStage.setScene(scene);

        // Set the person into the controller.


        // Show the dialog and wait until the user closes it
        dialogStage.showAndWait();

    }




}