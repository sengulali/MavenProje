package com.techproed;

import org.junit.*;

public class Day08_BeforeAfterMethod {

    @BeforeClass
    public static void setUp(){
        System.out.println("setUp calisti");
    }

    @AfterClass
    public static void turnDown(){
        System.out.println("turnDown calisti");
    }


    @Before
    public void methoddanOnce(){
        System.out.println("methoddanOnce calisti");
    }

    @Test
    public void test1(){
        System.out.println("test1 calisti");
    }

    @Test
    public void test2(){
        System.out.println("test2 calisti");
    }


    @After
    public void methoddanSonra(){
        System.out.println("methoddanSonra calisti");
    }

}
