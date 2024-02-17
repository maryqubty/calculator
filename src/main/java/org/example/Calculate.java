package org.example;

import java.util.ArrayList;

public class Calculate {
    static public String calc (String str, boolean hexFlag) {
        ArrayList<String> nums = new ArrayList<String>();
        ArrayList<String> ops = new ArrayList<String>();
        String number = "";
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != '+' && c != '-' && c != '*' && c != '/') {
                number += c; //attach digit to num (before converting to decimal)
            } else {
                //now, converting to hexa num to dec and adding it to the array list :)
                if (!number.equals(""))
                    nums.add(number);
                number = "";
                //let's not forget that if reached here then c= operator
                ops.add(Character.toString(c));
            }

        }

        if (!number.equals("")) nums.add(number);


        //now, if reached here, we have two arraylists filled with numbers and operators suitably
        //first, check if sizes are legal
        if (nums.size() != ops.size() + 1) {
            return "Error: invalid expression";
        }

        ArrayList<Integer> operands = new ArrayList<Integer>();
        //check if mode is Hex then convert to dec for calculating purposes:
            for (String num : nums) {
                if(hexFlag)operands.add(Integer.parseInt(num, 16));
                else operands.add(Integer.parseInt(num));
            }


        for (int i = 0; i < ops.size(); i++) {
            String operator = ops.get(i);
            //check if *
            if (operator.equals("*")) {
                Integer firstNum = operands.get(i);
                Integer secondNum = operands.get(i + 1);
                operands.set(i + 1, firstNum * secondNum);
                //"kind of" removing the operation after the calculation:
                operands.remove(i);
                ops.remove(i);
                i--; //because we removed a value from array
            }
            //check if /
            else if (operator.equals("/")) {
                Integer firstNum = operands.get(i);
                Integer secondNum = operands.get(i + 1);
                //make sure second num isn't 0:
                if (secondNum == 0) {
                    return "Error: divide by zero.";
                }
                operands.set(i + 1, firstNum / secondNum);
                //"kind of" removing the operation after the calculation:
                operands.remove(i);
                ops.remove(i);
                i--; //because we removed a value from array
            }
        }

        result = operands.get(0);
        for (int i = 0; i < ops.size(); i++) {
            //calculate:
            if ((ops.get(i)).equals("+")) result += operands.get(i + 1);
            else result -= operands.get(i + 1);
        }

        if (!hexFlag) return Integer.toString(result);

        String minus = "";
        if (result < 0) {
            result *= -1;
            minus += "-";
        }
        return minus+Integer.toHexString(result).toUpperCase();
    }
}
