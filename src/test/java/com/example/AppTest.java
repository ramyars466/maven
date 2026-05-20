package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void testaddd(){
        App app=new App();
        int result=app.add(2,3);
        
        Assert.assertEquals(result,5);
    }
}