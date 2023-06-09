package jdbc.usejdbc.src.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A002PreparedStatement {
    public static void main(String[] args) throws Exception {
        A002PreparedStatement A002 = new A002PreparedStatement();
        A002.testInsert();
        A002.testDelete();
        A002.testUpdate();
        A002.testQuery();

    }

    public void testUpdate() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu", "root", "Bingo@1993");
        String sql = "update t_user set nickname = ? where account = ? ;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //占位符赋值
        preparedStatement.setString(1, "tomcat");
        preparedStatement.setString(2, "test");
        //发送SQL语句
        int rows = preparedStatement.executeUpdate();
        //输出结果
        System.out.println(rows);
        //关闭资源close
        preparedStatement.close();
        connection.close();
    }

    public void testDelete() throws Exception{

        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu", "root", "Bingo@1993");
        String sql = "delete from t_user where account = ? ;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //占位符赋值
        preparedStatement.setString(1, "test");

        //发送SQL语句
        int rows = preparedStatement.executeUpdate();
        //输出结果
        System.out.println(rows);
        //关闭资源close
        preparedStatement.close();
        connection.close();
    }

    public void testInsert() throws Exception {

        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu", "root", "Bingo@1993");
        String sql = "insert into t_user(account,password,nickname) values (?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //占位符赋值
        preparedStatement.setString(1, "test1");
        preparedStatement.setString(2, "test1");
        preparedStatement.setString(3, "测试1");
        //发送SQL语句:增加  删除  修改 都是使用这个update
        int rows = preparedStatement.executeUpdate();
        //输出结果
        System.out.println(rows);
        //关闭资源close
        preparedStatement.close();
        connection.close();
    }

    public void testQuery() throws Exception {

        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///atguigu", "root", "Bingo@1993");
        String sql = "select id,account,password,nickname from t_user ;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //占位符赋值 本次没有占位符,省略
        //发送查询语句
        ResultSet resultSet = preparedStatement.executeQuery();
        //创建一个集合
        List<Map> mapList = new ArrayList<>();
        //获取列信息对象
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        while (resultSet.next()) {
            Map map = new HashMap();
            for (int i = 1; i <= columnCount; i++) {
                map.put(metaData.getColumnLabel(i), resultSet.getObject(i));
            }
            mapList.add(map);
        }

        System.out.println(mapList);
        //关闭资源close
        preparedStatement.close();
        connection.close();
        resultSet.close();
    }
}
