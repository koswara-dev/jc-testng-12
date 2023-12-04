package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmployeeTest {

    Employee employee;

    @BeforeMethod
    public void setUp(){
        employee = new Employee();
    }

    @Test(priority = 1)
    public void testName(){
        employee.setName("Siliwangi");
        Assert.assertEquals(employee.getName(), "Siliwangi");
    }

    @Test(priority = 2)
    public void testAddress(){
        employee.setAddress("Jakarta");
        Assert.assertEquals(employee.getAddress(), "Jakarta");
    }

}
