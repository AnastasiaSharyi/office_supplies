package com.company.untitled9.web.screens.products;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled9.entity.Products;

@UiController("untitled9_Products.browse")
@UiDescriptor("products-browse.xml")
@LookupComponent("productsesTable")
@LoadDataBeforeShow
public class ProductsBrowse extends StandardLookup<Products> {
}