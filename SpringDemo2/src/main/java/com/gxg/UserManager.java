package com.gxg;

public class UserManager implements IUserManager{
    @Override
    public void addUserInfo(String userName, String password) {
        System.out.println("========UserManager.addUserInfo()========");
    }

    @Override
    public void delUserInfo(int id) {
        System.out.println("========UserManager.delUserInfo()========");
    }

    @Override
    public void modifyUserInfo(String userName, String password) {
        System.out.println("========UserManager.modifyUserInfo()========");
    }

    @Override
    public void queryUserInfo(int id) {
        System.out.println("========UserManager.queryUserInfo()========");
    }

}
