package com.gxg.controller;

import com.gxg.vo.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 不继承继承类，不实现任何接口
 */

//
    @Controller
public class DemoHandler {

        @RequestMapping("/queryUserInfo.action")
    public ModelAndView queryUserInfo(){
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
            modelAndView.setViewName("showItemsList");
            return modelAndView;
    }
}
