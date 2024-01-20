package com.zht.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * ClassName: Demo01
 * Package: com.zht.demo
 * Description:
 *
 * @Author ZHT
 * @Create 2023/12/26 22:40
 * @Version 1.0
 */
public class TestDemo01 {


    @Test
    public void testHello(){
        System.out.println("Hello");
    }

    @Test
    public void testAssert(){
        int a = 20;
        int b = 30;
        Assertions.assertEquals(a+b,50);
    }

}
