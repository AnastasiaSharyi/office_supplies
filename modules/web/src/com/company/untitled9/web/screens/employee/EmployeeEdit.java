package com.company.untitled9.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled9.entity.Employee;

@UiController("untitled9_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeEdit extends StandardEditor<Employee> {
}