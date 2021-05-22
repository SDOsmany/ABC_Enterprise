package com.Enterprise;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;



public class Display {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public static SimpleDateFormat getSimpleDateFormat() {
        return simpleDateFormat;
    }

    // public method to get the product information in a format
    public static String getFormatedProductInfo(Product info)
    {
        String result = String.format("%30s", info.getProductName());
        result += String.format("%30s", getSimpleDateFormat().format(info.getProductCreated()));
        result += String.format("%30s", info.getManufacturer().getCompanyName());
        return result;
    }

    // public method to display the deleted inventory list
    public static void displayDeletedInventory(Database productDB,
                                               int Type_Message)
    {
        String inventResult = "";
        ArrayList<Product> prodList = productDB.getList();
        inventResult += String.format("%30s %30s %30s", "Product",
                "Purchase Date", "Manufacturer");
        for (int i = 0; i < productDB.size(); i++)
        {
            inventResult += getFormatedProductInfo(prodList.get(i)) + "\n";
        }
        JTextArea text = new JTextArea(inventResult, 10, 50);

        JScrollPane pane = new JScrollPane(text);

        JOptionPane.showMessageDialog(null, pane, "Deleted Inventory Details",
                Type_Message);
    }

    // public method to display the inventory list
    public static void displayInventory(Database productDB, int Type_Message)
    {
        String inventoryResult = "";
        ArrayList<Product> prodList = productDB.getList();
        inventoryResult += String.format("%-30s \t%s %10s %15s %20s %15s\n",
                "Product", "Purchase Date", "Quantity", "Price($)",
                "Manufacturer", "State");
        for (int i = 0; i < productDB.size(); i++)
        {
            inventoryResult += prodList.get(i).getProductInfomation() + "\n";
        }
        JTextArea text = new JTextArea(inventoryResult, 10, 60);

        JScrollPane pane = new JScrollPane(text);

        JOptionPane.showMessageDialog(null, pane, "Inventory Details",
                Type_Message);
    }

    // public method to display the single product
    public static void displaySingleProduct(Product product, int Type_Message)
    {
        String productInfo = "Product Name: " + product.getProductName() + "\n";
        productInfo += String.format("Product's Unit Price: $%.2f",
                product.getUnitPrice()) + "\n";
        productInfo += "Quantity of product: " + product.getQuantity() + "\n";
        JTextArea text = new JTextArea(productInfo, 10, 30);

        JScrollPane pane = new JScrollPane(text);

        JOptionPane.showMessageDialog(null, pane,
                product.getProductName() + " Details", Type_Message);
    }
}
