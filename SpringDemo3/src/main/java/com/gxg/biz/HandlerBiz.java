package com.gxg.biz;

import com.gxg.tools.DbManager;
import com.gxg.vo.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HandlerBiz {

    public List<User> queryUserFunForBiz(){

        List<User> userList = new ArrayList<>();
        String strSql = "select * from user";
        DbManager dbManager = new DbManager();
        Connection connection = dbManager.getConnection();
        ResultSet resultSet = null;
        try{
            resultSet = dbManager.queryDBFunction(strSql);
            while(resultSet.next()){
                User user = new User();
                user.setUserId(resultSet.getInt("id"));
                user.setUserName(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                userList.add(user);
            }
            return userList;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

