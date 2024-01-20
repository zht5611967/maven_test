package com.zht;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName: Demo01
 * Package: com.zht
 * Description:
 *
 * @Author ZHT
 * @Create 2023/12/26 21:25
 * @Version 1.0
 */
public class Demo01 {


    @Test
    public void testPerson() {
        try {
            Class clazz = Class.forName("com.zht.Person");

            Person p = (Person)clazz.getConstructor().newInstance();

            Field name = clazz.getDeclaredField("name");
            Field age = clazz.getDeclaredField("age");
            name.setAccessible(true);
            age.setAccessible(true);
            name.set(p,"张三");
            age.set(p,"25");


            Method personEat = clazz.getDeclaredMethod("eat", String.class);

            personEat.setAccessible(true);

            personEat.invoke(p,"鸡腿");



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
