package com.example.distributeur;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;


    @FXML
    private Label chooseDrinkText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Selecto veuiller choisir votre boisson");
        //chooseDrinkText.setText("choisis ta boisson");
        add();
    }

    @FXML
    private ComboBox combobox1;

    @FXML
    private ComboBox combobox2;

    @FXML
    protected void add(){
        combobox1.getItems().add("coca");
        combobox1.getItems().add("fanta");
        combobox1.getItems().add("minute maid");
        combobox1.getItems().add("oasis");
    }

    @FXML
    void Select (ActionEvent event){
    String s = combobox2.getSelectionModel().getSelectedItem().toString();
    chooseDrinkText.setText(s);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        ObservableList<String> list_boisson = FXCollections.observableArrayList("coca","fanta", "minute maid" ,"oasis");
        combobox2.setItems(list_boisson);
    }





    /*@FXML
    private String[] boisson_chaud = new String[2];
        boisson_chaud[0] = "café";
        boisson_chaud[1] = "café_long";
        boisson_chaud[2] = "expresso";
    */

}