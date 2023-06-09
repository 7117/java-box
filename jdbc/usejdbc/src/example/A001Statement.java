package jdbc.usejdbc.src.example;

import java.sql.*;

public class A001Statement {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.输入账号和密码
        String account = "admin";
        String password = "666666";
        //2.jdbc的查询使用
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu", "root", "Bingo@1993");
        //4.创建statement
        Statement statement = connection.createStatement();
        //5.执行SQL语句
        String sql = "select * from t_user where account = '" + account + "' and password = '" + password + "' ;";
        ResultSet resultSet = statement.executeQuery(sql);
        //6.进行结果集对象解析
        if (resultSet.next()) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
        //7.关闭资源
        resultSet.close();
        statement.close();
        connection.close();
    }

}
