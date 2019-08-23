package com.gxg.controller;

import com.gxg.vo.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 处理器 Handler (控制器) --- > 适配器(适配一定的规则)
 */

public class showItemsController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Items> itemsList = new ArrayList<>();

        Items items1 = new Items();
        items1.setItemsId(1);
        items1.setItemsName("thinkpad");

        Items items2 = new Items();
        items2.setItemsId(1);
        items2.setItemsName("x390");
  ;

        Items items3 = new Items();
        items3.setItemsId(1);
        items3.setItemsName("mac");


        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);

        ModelAndView modelAndView = new ModelAndView();
        //request.setAttribute(key,value);
        modelAndView.addObject("itmsListKey",itemsList);
        //request.getRequestDispatcher("showI.jsp").forward(request,response);
        modelAndView.setViewName("/myjsp/showItemsList.jsp");
        return modelAndView;
    }
}
