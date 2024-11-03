package com.example.shop.controller;

import com.example.shop.model.Product;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdminController {

    public TableColumn productNameColumn;
    @FXML
    private TableView<Product> productTable;
    @FXML
    private TextField productNameField;
    @FXML
    private TextField productPriceField;
    @FXML
    private Button addButton;

    // Метод для добавления продукта
    @FXML
    private void addProduct() {
        // Логика добавления товара в таблицу
    }
}
