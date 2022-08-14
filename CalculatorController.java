/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
/**
 *
 * @author louis
 */
public class CalculatorController implements Initializable{
    
    @FXML Button zero;
    @FXML Button one;
    @FXML Button two;
    @FXML Button three;
    @FXML Button four;
    @FXML Button five;
    @FXML Button six;
    @FXML Button seven;
    @FXML Button eight;
    @FXML Button nine;
    
    @FXML Button add, sub, mult, div;
    @FXML Button clear, enter;
    
    @FXML Label result, equat;
    
    
    
    public void one(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = one.getText();
       equat.setText(equation + num);
    }
    
    public void two(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = two.getText();
       equat.setText(equation + num);
    }
    
    public void three(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = three.getText();
       equat.setText(equation + num);
    }
    
    public void four(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = four.getText();
       equat.setText(equation + num);
    }
    
    public void five(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = five.getText();
       equat.setText(equation + num);
    }
    
    public void six(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = six.getText();
       equat.setText(equation + num);
    }
    
    public void seven(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = seven.getText();
       equat.setText(equation + num);
    }
    
    public void eight(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = eight.getText();
       equat.setText(equation + num);
    }
    
    public void nine(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = nine.getText();
       equat.setText(equation + num);
    }
    
    public void zero(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = zero.getText();
       equat.setText(equation + num);
    }
    
    public void add(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = add.getText();
       equat.setText(equation + " " + num + " ");
    }
    
    public void sub(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = sub.getText();
       equat.setText(equation + " " + num + " ");
    }
    
    public void mult(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = mult.getText();
       equat.setText(equation + " " + num + " ");
    }
    
    public void div(ActionEvent event) throws Exception {
       String equation = equat.getText();
       String num = div.getText();
       equat.setText(equation + " " + num + " ");
    }
    
    public void enter(ActionEvent event) throws Exception {
        try {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            int l = (int) engine.eval(equat.getText());
            result.setText(Integer.toString(l));
        }
        catch (ScriptException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Please finish the equation");
            alert.showAndWait();
            
        }
    }
    
    public void delete(ActionEvent event) throws Exception {
        equat.setText("");
        result.setText("");
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
}
