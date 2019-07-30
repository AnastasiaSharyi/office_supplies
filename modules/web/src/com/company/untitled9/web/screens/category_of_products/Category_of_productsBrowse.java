package com.company.untitled9.web.screens.category_of_products;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled9.entity.Category_of_products;

@UiController("untitled9_Category_of_products.browse")
@UiDescriptor("category_of_products-browse.xml")
@LookupComponent("category_of_productsesTable")
@LoadDataBeforeShow
public class Category_of_productsBrowse extends StandardLookup<Category_of_products> {
}