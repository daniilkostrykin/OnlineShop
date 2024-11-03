package com.example.shop.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    // Хранение пользователей в памяти
    private static final Map<String, String> users = new HashMap<>();

    @FXML

    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/shop/view/AdminView.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) usernameField.getScene().getWindow();
                stage.setMinWidth(1171);
                stage.setMinHeight(679);
                stage.setMaxWidth(1171);
                stage.setMaxHeight(679);
                stage.setScene(new Scene(root));
                stage.setTitle("Админ панель");
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
                showAlert("Ошибка", "Не удалось загрузить вид администратора.");
            }
        } else if (users.containsKey(username) && users.get(username).equals(password)) {
            // ... логика для других пользователей
            showAlert("Успешный вход", "Добро пожаловать, " + username + "!");


        } else {
            showAlert("Ошибка", "Неверный логин или пароль.");
        }
    }

    @FXML
    private void handleOpenRegister() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/shop/view/RegisterView.fxml"));
            Stage registerStage = new Stage();
            registerStage.setTitle("Регистрация");
            registerStage.setScene(new Scene(fxmlLoader.load()));
            registerStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void registerUser(String username, String password) {
        users.put(username, password);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
