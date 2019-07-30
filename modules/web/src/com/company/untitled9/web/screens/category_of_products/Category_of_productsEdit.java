package com.company.untitled9.web.screens.category_of_products;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled9.entity.Category_of_products;

@UiController("untitled9_Category_of_products.edit")
@UiDescriptor("category_of_products-edit.xml")
@EditedEntityContainer("category_of_productsDc")
@LoadDataBeforeShow
public class Category_of_productsEdit extends StandardEditor<Category_of_products> {
}