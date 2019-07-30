package com.company.untitled9.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "UNTITLED9_PRODUCTS")
@Entity(name = "untitled9_Products")
public class Products extends StandardEntity {
    private static final long serialVersionUID = 5099770436177142266L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_OF_PRODUCTS_ID")
    protected Category_of_products category_of_products;

    @NotNull
    @Column(name = "NAME_OF_PRODUCTS", nullable = false)
    protected String name_of_products;

    @Column(name = "AMOUNT")
    protected BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getName_of_products() {
        return name_of_products;
    }

    public void setName_of_products(String name_of_products) {
        this.name_of_products = name_of_products;
    }

    public Category_of_products getCategory_of_products() {
        return category_of_products;
    }

    public void setCategory_of_products(Category_of_products category_of_products) {
        this.category_of_products = category_of_products;
    }
}