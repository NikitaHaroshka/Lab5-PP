package org.example.lab5;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.util.List;

public class HelloController {
    @FXML
    private RadioButton receiver1, receiver2, receiver3, gift1, gift2, gift3, gift4, yes, no;
    @FXML
    private Button button;
    @FXML
    private Label label;
    private ToggleGroup group1, group2, group3;

    @FXML
    void initialize(){
        group1 = new ToggleGroup();
        group2 = new ToggleGroup();
        group3 = new ToggleGroup();

        receiver1.setToggleGroup(group1);
        receiver2.setToggleGroup(group1);
        receiver3.setToggleGroup(group1);

        gift1.setToggleGroup(group2);
        gift2.setToggleGroup(group2);
        gift3.setToggleGroup(group2);
        gift4.setToggleGroup(group2);

        yes.setToggleGroup(group3);
        no.setToggleGroup(group3);
    }

    @FXML
    void buttonClicked(){
        int a,b,c;
        if(receiver1.isSelected()) a = 20;
        else if(receiver2.isSelected()) a = 40;
        else if(receiver3.isSelected()) a = 50;
        else a = 0;

        if(gift1.isSelected()) b = 20;
        else if(gift2.isSelected()) b = 150;
        else if(gift3.isSelected()) b = 200;
        else if(gift4.isSelected()) b= 300;
        else b = 0;

        if(yes.isSelected()) c = 100;
        else c = 0;
        label.setVisible(true);
        label.setText("                " + String.valueOf(a+b+c) + "р");
    }
}