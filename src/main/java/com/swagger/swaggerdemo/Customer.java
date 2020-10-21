package com.swagger.swaggerdemo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.omg.CORBA.OBJECT_NOT_EXIST;

@ApiModel(value = "This the Application Class Model", description = "Test this", parent = Object.class)
public class Customer {

    @ApiModelProperty(value = "customer Id Property", notes = "Use it to Access the DB primary Key")
    private int customerId;
    private String name;
    private String location;
    private String phone;

    public Customer(){}

    public Customer(int customerId, String name, String location, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.location = location;
        this.phone = phone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
