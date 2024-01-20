package com.zht;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Demo01
 * Package: com.zht
 * Description:
 *
 * @Author ZHT
 * @Create 2023/12/26 21:46
 * @Version 1.0
 */
@WebServlet("/zht")
public class Demo01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        System.out.println("你好"+name);
    }
}
