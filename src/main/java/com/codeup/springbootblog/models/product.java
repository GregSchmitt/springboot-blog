
package com.codeup.springbootblog.models;

import javax.persistence.*;

//@Entity
//@Table(name="products")
public class product {
    //    @Id
//    @GeneratedValue
    private long id;

    //    @Column
    private String name;

    //    @Column
    private double price;

    //    @Column
    private String description;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}