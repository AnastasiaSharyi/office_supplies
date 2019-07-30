package com.company.untitled9.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "UNTITLED9_CATEGORY_OF_PRODUCTS")
@Entity(name = "untitled9_Category_of_products")
public class Category_of_products extends StandardEntity {
    private static final long serialVersionUID = -8752178917510346415L;

    @Column(name = "NAME_OF_PRODUCTS")
    protected String name_of_products;

    public String getName_of_products() {
        return name_of_products;
    }

    public void setName_of_products(String name_of_products) {
        this.name_of_products = name_of_products;
    }
}