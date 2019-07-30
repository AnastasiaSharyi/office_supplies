package com.company.untitled9.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled9.entity.Employee;

@UiController("untitled9_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {
}