package com.gxg;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 帮我们动态的(JVM编译) 创建对象
 * 1.实现InvocationHandler接口，用到反射
 */
public class CreateDnamic implements InvocationHandler {

        private Object targetObject;//目标对象

    /**
     * 给目标对象赋值
     * @return
     */
        public CreateDnamic(Object obj){
            this.targetObject = obj;
        }

    //通过调用该方法来创建代理对象
        //ClassLoader loader  :   得知目标对象的类加载器
        //Class<?> interfaces :   得知目标对象所实现的方法
        //InvocationHandler h :    实现了InvocationHandler接口的哪个类的实例(也就是引用)
        public Object newDynamicObjectInterface(){
            return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(),
                                    this.targetObject.getClass().getInterfaces(),
                                        this);
        }
    /**
     *
     * @param proxy   ：targetObject目标对象
     * @param method   目标对象中的方法
     * @param args  ：  arguments：目标对象方法中的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        try{
            this.securityCheck();
            obj = method.invoke(this.targetObject,args);
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }
    public void securityCheck(){
        System.out.println("=================安全检查====================");
    }
}
