package com.guidewire.app;

public class Util 
{
    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    public static String toString(int[] numbers){
        StringBuffer array = new StringBuffer();
        if(numbers.length >0){
            for(int a:numbers){
                array.append(a);
            }
        }else {
            return "Empty...";
        }
        return array.toString();
    }
}
