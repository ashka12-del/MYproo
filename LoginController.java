package org.example.anactual_javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    @FXML private TextField txtUser;
    @FXML private PasswordField txtPass;
    @FXML private ComboBox<String> cmbRole;

    private final ObservableList<String> roles =
            FXCollections.observableArrayList("Student", "Admin", "Shopkeeper", "Doctor");

    @FXML
    public void initialize() {
        cmbRole.setItems(roles);
    }

    @FXML
    private void handleLogin() {
        String user = txtUser.getText().trim();
        String pass = txtPass.getText().trim();
        String role = cmbRole.getValue();

        if (user.isEmpty() || pass.isEmpty() || role == null) {
            new Alert(AlertType.WARNING, "Please fill all fields!").showAndWait();
            return;
        }

        new Alert(AlertType.INFORMATION,
                "User: " + user + "\nRole: " + role + "\nLogin clicked!")
                .showAndWait();
    }
}