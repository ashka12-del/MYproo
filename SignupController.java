package org.example.anactual_javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

public class SignupController {

    @FXML private TextField txtUsername;
    @FXML private TextField txtUsername1;   // password field (rename korte paro)
    @FXML private ComboBox<String> cmbRole;

    private final ObservableList<String> roles =
            FXCollections.observableArrayList("Student", "Admin", "Shopkeeper", "Doctor");

    @FXML
    public void initialize() {
        cmbRole.setItems(roles);
    }

    /* ---------- Register button ---------- */
    @FXML
    private void handleRegister() {
        String user = txtUsername.getText().trim();
        String pass = txtUsername1.getText().trim();
        String role = cmbRole.getValue();

        if (user.isEmpty() || pass.isEmpty() || role == null) {
            new Alert(AlertType.WARNING, "Please fill all fields!").showAndWait();
            return;
        }

        new Alert(AlertType.INFORMATION,
                "User: " + user + "\nRole: " + role + "\nRegistered successfully!")
                .showAndWait();
    }
}