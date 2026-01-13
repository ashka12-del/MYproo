package org.example.anactual_javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    public void handleSignUp() throws IOException {   // public + @FXML
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("signup.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Sign Up");
        stage.show();
    }

    @FXML
    public void handleLogIn() throws IOException {    // public + @FXML
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Log In");
        stage.show();
    }
}