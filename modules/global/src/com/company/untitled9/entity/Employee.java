package com.company.untitled9.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "UNTITLED9_EMPLOYEE")
@Entity(name = "untitled9_Employee")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = -8741742741809541767L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_OF_PRODUCTS_ID")
    protected Category_of_products category_of_products;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCTS_ID")
    protected Products products;

    @Column(name = "AMOUNT")
    protected BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Category_of_products getCategory_of_products() {
        return category_of_products;
    }

    public void setCategory_of_products(Category_of_products category_of_products) {
        this.category_of_products = category_of_products;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}