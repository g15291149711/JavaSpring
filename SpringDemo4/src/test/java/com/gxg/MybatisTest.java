package com.gxg;

import com.gxg.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


/**
 * Mybatis API
 * sqlSessionfactory:  一个这个代表一个数据库，重量级对象，用来创建sqlSession
 * sqlSession: 轻量级对象，执行增删改成操作
 */
public class MybatisTest {
    private SqlSessionFactory sqlSessionFactory = null;
    @Before
    public void testInit(){
        //获取sqlSessionfactory
        String  mybatisConfigFile = "sqlMapConfig.xml";
        InputStream is = null;
        try{
            is = Resources.getResourceAsStream(mybatisConfigFile);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    //执行相关操作CURD
    public void queryUserById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            User user = sqlSession.selectOne("test.queryUserById",1);
            System.out.println(user);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    //执行相关操作CURD
    public void queryUserByName(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            List<User> userList = sqlSession.selectList("test.queryUserByName","n");
            System.out.println(userList);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    //执行相关操作CURD
    public void insertUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int flag = 0;
        try{
            User user = new User();
            user.setUsername("jerry");
            user.setAddress("LA");
            flag = sqlSession.insert("test.addUser",user);
            sqlSession.commit();
            System.out.println("flag = " + flag);
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    //执行相关操作CURD
    public void ModifyUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int flag = 0;
        try {
            User user = new User();
            user.setUsername("MMMM");
            user.setId(10);
            flag = sqlSession.update("test.updateUser",user);
            sqlSession.commit();
            System.out.println(flag);
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }
    }


    @Test
    //执行相关操作CURD
    public void DeleteUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int flag = 0;
        try {
            flag = sqlSession.update("test.deleteUser",25);
            sqlSession.commit();
            System.out.println(flag);
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }
    }
}
