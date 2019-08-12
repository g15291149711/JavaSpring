package com.gxg.controll;


import com.gxg.service.HandlerService;
import com.gxg.vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/handlerServlet")
public class HandlerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取表单参数;
        //2.调用业务逻辑对象
        HandlerService handlerService  = new HandlerService();
        List<User> userList = handlerService.queryUserFunForService();
        req.getSession().setAttribute("userListKey",userList);
        //3.转发到其他的web组件
        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }
}
