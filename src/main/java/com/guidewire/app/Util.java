package com.guidewire.app;

public class Util 
{
    public static void printMessage(String msg) {
        System.out.println(msg);
    }
    public static void printMessage(int msg){System.out.println(new String(Integer.toString(msg)));}
    public static void printMessage(boolean msg){System.out.print(msg);}

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
