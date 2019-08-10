package com.gxg;

public class Person {
    private String pName;

    public int getpAge() {
        return pAge;
    }

    public void setpAge(int pAge) {
        this.pAge = pAge;
    }

    private int pAge;
        //咋样注入这个值
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
    public  Person(String pName,int pAge){
        this.pName = pName;
        this.pAge = pAge;
    }
    public  Person(){

    }
    public String sayHello(String message){
        return "asdf" + message;
    }
}
