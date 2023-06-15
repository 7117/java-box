package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.select();
    }
}

//通知：共性方法是通知
//通知类：共性方法所在的类叫做通知类
//连接点：任意的方法
//切入点：使用面向切面的方法
//切面：切入点和通知合在一起就是切面

