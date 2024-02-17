/**
 * Sample Skeleton for 'primary.fxml' Controller Class
 */

package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class PrimaryController {

    private String out="";
    private boolean hexFlag = true;

    @FXML // fx:id="bntB"
    private Button bntB; // Value injected by FXMLLoader

    @FXML // fx:id="btn0"
    private Button btn0; // Value injected by FXMLLoader

    @FXML // fx:id="btn1"
    private Button btn1; // Value injected by FXMLLoader

    @FXML // fx:id="btn2"
    private Button btn2; // Value injected by FXMLLoader

    @FXML // fx:id="btn3"
    private Button btn3; // Value injected by FXMLLoader

    @FXML // fx:id="btn4"
    private Button btn4; // Value injected by FXMLLoader

    @FXML // fx:id="btn5"
    private Button btn5; // Value injected by FXMLLoader

    @FXML // fx:id="btn6"
    private Button btn6; // Value injected by FXMLLoader

    @FXML // fx:id="btn7"
    private Button btn7; // Value injected by FXMLLoader

    @FXML // fx:id="btn8"
    private Button btn8; // Value injected by FXMLLoader

    @FXML // fx:id="btn9"
    private Button btn9; // Value injected by FXMLLoader

    @FXML // fx:id="btnA"
    private Button btnA; // Value injected by FXMLLoader

    @FXML // fx:id="btnC"
    private Button btnC; // Value injected by FXMLLoader

    @FXML // fx:id="btnClear"
    private Button btnClear; // Value injected by FXMLLoader

    @FXML // fx:id="btnD"
    private Button btnD; // Value injected by FXMLLoader

    @FXML // fx:id="btnDiv"
    private Button btnDiv; // Value injected by FXMLLoader

    @FXML // fx:id="btnE"
    private Button btnE; // Value injected by FXMLLoader

    @FXML // fx:id="btnEqual"
    private Button btnEqual; // Value injected by FXMLLoader

    @FXML // fx:id="btnF"
    private Button btnF; // Value injected by FXMLLoader

    @FXML // fx:id="btnMinus"
    private Button btnMinus; // Value injected by FXMLLoader

    @FXML // fx:id="btnMode"
    private Button btnMode; // Value injected by FXMLLoader

    @FXML // fx:id="btnPlus"
    private Button btnPlus; // Value injected by FXMLLoader

    @FXML // fx:id="btnStar"
    private Button btnStar; // Value injected by FXMLLoader

    @FXML // fx:id="modeTF"
    private TextField modeTF; // Value injected by FXMLLoader

    @FXML // fx:id="resultDisplay"
    private TextField resultDisplay; // Value injected by FXMLLoader

    @FXML
    void add0(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "0";
        resultDisplay.setText(out);
    }

    @FXML
    void add1(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "1";
        resultDisplay.setText(out);
    }

    @FXML
    void add2(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "2";
        resultDisplay.setText(out);
    }

    @FXML
    void add3(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "3";
        resultDisplay.setText(out);
    }

    @FXML
    void add4(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "4";
        resultDisplay.setText(out);
    }

    @FXML
    void add5(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "5";
        resultDisplay.setText(out);
    }

    @FXML
    void add6(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "6";
        resultDisplay.setText(out);
    }

    @FXML
    void add7(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "7";
        resultDisplay.setText(out);
    }

    @FXML
    void add8(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "8";
        resultDisplay.setText(out);
    }

    @FXML
    void add9(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "9";
        resultDisplay.setText(out);
    }

    @FXML
    void addA(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        if (!hexFlag) return;
        out += "A";
        resultDisplay.setText(out);
    }

    @FXML
    void addB(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        if (!hexFlag) return;
        out += "B";
        resultDisplay.setText(out);
    }

    @FXML
    void addC(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        if (!hexFlag) return;
        out += "C";
        resultDisplay.setText(out);
    }

    @FXML
    void addD(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        if (!hexFlag) return;
        out += "D";
        resultDisplay.setText(out);
    }

    @FXML
    void addE(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        if (!hexFlag) return;
        out += "E";
        resultDisplay.setText(out);
    }

    @FXML
    void addF(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        if (!hexFlag) return;
        out += "F";
        resultDisplay.setText(out);
    }

    @FXML
    void addDiv(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "/";
        resultDisplay.setText(out);
    }

    @FXML
    void addMinus(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "-";
        resultDisplay.setText(out);
    }

    @FXML
    void addPlus(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "+";
        resultDisplay.setText(out);
    }

    @FXML
    void addStar(ActionEvent event) {
        if (out.startsWith("Error")) out = "";
        out += "*";
        resultDisplay.setText(out);
    }

    @FXML
    void changeMode(ActionEvent event) {
        Convert convert= new Convert();
        ArrayList<String> tmp = new ArrayList<String>();
        hexFlag = !hexFlag;
        if (hexFlag) {
            modeTF.setText("HEX");
        }
        else {
            modeTF.setText("DEC");
        }
//now let's convert
        String number="";
        for (int i = 0; i < out.length(); i++) {
            char c = out.charAt(i);
            if (c != '+' && c != '-' && c != '*' && c != '/') {
                number += c; //attach digit to num (before adding to list)
            } else {
                if (!number.equals("")){
                    if(hexFlag) tmp.add(convert.convertToHex(number));
                    else tmp.add(convert.convertToDEC(number));
                }
                number = "";
                //let's not forget that if reached here then c= operator
                tmp.add(Character.toString(c));
       }
        }
        if (!number.equals("")){
            if(hexFlag) tmp.add(convert.convertToHex(number));
            else tmp.add(convert.convertToDEC(number));
        }
        out="";
        for (int i = 0; i < tmp.size(); i++){
            out+= tmp.get(i);
        }
        resultDisplay.setText(out);
    }


    @FXML
    void clear(ActionEvent event) {
        out = "";
        resultDisplay.setText(out);
    }

    @FXML
    void showRes(ActionEvent event) {
        if (out.startsWith("Error")) {
            out = "";
            return ;
        }
        out = Calculate.calc(resultDisplay.getText(), hexFlag);
        resultDisplay.setText(out);
    }

}
