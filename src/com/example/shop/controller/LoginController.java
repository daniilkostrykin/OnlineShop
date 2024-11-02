package com.example.shop.controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Здесь можно добавить логику для проверки пользователя
        if (username.equals("admin") && password.equals("admin")) {
            // Здесь будет открытие окна администратора
            System.out.println("Логин успешен!"); // Замени на переход к AdminView
        } else {
            showAlert("Ошибка", "Неверный логин или пароль");
        }
    }

    @FXML
    private void handleRegister() {
        // Здесь можно добавить логику регистрации
        showAlert("Регистрация", "Регистрация не реализована.");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
