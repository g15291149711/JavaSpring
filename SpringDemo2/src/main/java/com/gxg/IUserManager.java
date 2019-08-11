package com.gxg;

public interface IUserManager {

    //主营业务(CURD)
    public void addUserInfo(String userName,String password);
    public void delUserInfo(int id);
    public void modifyUserInfo(String userName,String password);
    public void queryUserInfo(int id);
}
