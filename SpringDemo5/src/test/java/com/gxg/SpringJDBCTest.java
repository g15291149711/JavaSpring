package com.gxg;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class SpringJDBCTest {
   private ApplicationContext applicationContext = null;
   private JdbcTemplate jdbcTemplate = null;

       @Before
    public void testInit(){
       applicationContext = new
               ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void testDatabase(){
         DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);
    }
    @Test
    public void testUpdate(){
           //获取jdbc模板
        try {
            jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
            System.out.println(jdbcTemplate);
            String strSql = "insert into employee (username,id) values (?,?)";
            List<Object[]> objList = new ArrayList<Object[]>();
            objList.add(new Object[]{"UUU",1});
            objList.add(new Object[]{"RRR",2});
            objList.add(new Object[]{"TTT",3});
            jdbcTemplate.batchUpdate(strSql,objList);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Test
    public void testselect(){
        int flag = 0;
        try {
            jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
            String strSql = "delete from employee where id = ?";
            flag = jdbcTemplate.update(strSql,3);
            System.out.println("flag = " + flag);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
