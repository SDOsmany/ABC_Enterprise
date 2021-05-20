package com.Enterprise;

import javax.swing.JOptionPane;

public class GetData {
    public static double getDouble(String s)
    {
        return Double.parseDouble(getMessage(s));
    }

    public static int getInt(String s)
    {
        return Integer.parseInt(getMessage(s));
    }

    public static String getMessage(String s)
    {
        return JOptionPane.showInputDialog(s);
    }

    public static String getString(String s)
    {
        return JOptionPane.showInputDialog(s);
    }
    
}
