package org.example;

public class Convert {
    public String convertToHex( String num){
        int decimalValue = Integer.parseInt(num);
        return Integer.toHexString(decimalValue);
    }
    public String convertToDEC(String num){
        return Integer.toString(Integer.parseInt(num, 16));
    }
}
