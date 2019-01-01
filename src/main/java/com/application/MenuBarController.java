package com.application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuBarController implements Initializable {
    @FXML
    SceneController sceneController;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void setRootController(SceneController sceneController) {
        this.sceneController = sceneController;
    }
}