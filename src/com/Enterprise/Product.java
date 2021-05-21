package com.Enterprise;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product
{
    // instance variables
    private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

    // to hold the Manufacturer object
    private Manufacturer manufacturer;

    // to hold product name
    String productName;

    // to hold quantity
    private int quantity;

    // to hold the unit price
    private double unitPrice;

    // to hold the product date
    private Date productCreated;

    // default constructor
    public Product()
    {
        this.productName = "";
        this.quantity = 0;
        this.unitPrice = 0.0;
        this.productCreated = null;
        this.manufacturer = null;
    }

    // parameterized constructor
    public Product(String productName, int quantity, double unitPrice,
                   Date productCreated, Manufacturer manufact)
    {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.productCreated = productCreated;
        this.manufacturer = manufact;
    }

    // to get the date of the product manufactured
    public Date getProductCreated()
    {
        return productCreated;
    }

    // to set the date of the product manufactured
    public void setProductCreated(Date productCreated)
    {
        this.productCreated = productCreated;
    }

    // to get the Manufacturer object
    public Manufacturer getManufacturer()
    {
        return manufacturer;
    }

    // to set the Manufacturer object
    public void setManufacturer(Manufacturer manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    // to get the name of the product
    public String getProductName()
    {
        return productName;
    }

    // to set the name of the product
    public void setProductName(String prodName)
    {
        this.productName = prodName;
    }

    // to get the quantity of the product
    public int getQuantity()
    {
        return quantity;
    }

    // to set the quantity of the product
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    // to get the unit price of the product
    public double getUnitPrice()
    {
        return unitPrice;
    }

    // to set the unit price of product
    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    // to update the quantity of the product
    public void upDateQuantity(int quantity_upDate)
    {
        quantity += quantity_upDate;
    }

    // to update the price of the product
    public void upDatePrice(double price_upDate)
    {
        this.unitPrice = price_upDate;
    }

    // to get the product information
    public String getProductInfomation()
    {
        String result = "";
        result += String.format("%-30s", productName);
        String dateForm = sdf.format(productCreated);
        result += String.format("\t %s", dateForm);
        result += String.format("%10d", quantity);
        result += String.format("\t%15.2f", unitPrice);
        result += String.format("\t%15s",
                manufacturer.getCompanyName());
        result += String.format("\t%20s",
                manufacturer.getCompanyAddress().getState());
        return result;
    }
}