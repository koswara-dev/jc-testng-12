package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest {

    User user;

    @BeforeMethod
    public void setUp(){
        user = new User();
    }

    @Test()
    public void testCheckLogin(){
        user.setUsername("Admin");
        user.setPassword("admin123");
        Assert.assertTrue(user.checkLogin());
    }

    // contains pada assertTrue
    @Test
    public void testErrorMessage(){
        boolean result = user.getErrorMessage().contains("Invalid");
        Assert.assertTrue(result);
    }

}
