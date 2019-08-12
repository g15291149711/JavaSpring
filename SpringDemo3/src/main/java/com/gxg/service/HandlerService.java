package com.gxg.service;

import com.gxg.biz.HandlerBiz;
import com.gxg.vo.User;

import java.util.List;

public class HandlerService {

    private HandlerBiz handlerBiz = new HandlerBiz();

    public List<User> queryUserFunForService(){
        return handlerBiz.queryUserFunForBiz();
    }
}
