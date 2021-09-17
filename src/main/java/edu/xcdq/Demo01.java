package edu.xcdq;

import java.sql.*;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        Connection connection= DriverManager.getConnection("jdbc:mysql:///test01","root","mysql");

        //创建传输器
        Statement statement= connection.createStatement();
        //执行语句
        //增
       String sql1="insert into book (id,name,author,prices) values(null,'我的暑假生活','小明',50)";
        //int  result =statement.executeUpdate(sql1);
        //删
        String sql2="delete from book where author='老舍'";
        //int result=statement.executeUpdate(sql2);
        //改
        String sql3 ="update  book set name='我们的暑假生活' where author='小明' ";
        //int result=statement.executeUpdate(sql3);
      // 查
        String sql4="select * from book";
      //  ResultSet resultSet=statement.executeQuery(sql4);
      /*  //获取结果
        while (resultSet.next()){
           System.out.println(resultSet.getInt(1)+""+resultSet.getString(2)
         +""+resultSet.getString(3)+""+resultSet.getString(4)  );
        }*/

        //关闭资源
        statement.close();
        connection.close();
    }
}
