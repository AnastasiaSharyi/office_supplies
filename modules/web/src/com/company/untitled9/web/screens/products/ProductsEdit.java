package com.company.untitled9.web.screens.products;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled9.entity.Products;

@UiController("untitled9_Products.edit")
@UiDescriptor("products-edit.xml")
@EditedEntityContainer("productsDc")
@LoadDataBeforeShow
public class ProductsEdit extends StandardEditor<Products> {
}