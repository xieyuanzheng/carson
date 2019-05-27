package com.example.carsonserver;

import com.example.carsonserver.util.DButil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;


@SpringBootApplication
public class CarsonserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarsonserverApplication.class, args);
        System.out.println("Hello Carson");
//        DButil dButil = new DButil();
//        String filePath = "/Users/xieyuanzheng/Desktop/work/private/Sample.accdb";
//        dButil.queryData(filePath);
//        Map<Integer, Object[]> map = new HashMap<Integer, Object[]>();
//        String[] column ;
//        try {
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            //Sample.accdb是access文件
//            String url="jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ=/Users/xieyuanzheng/Desktop/work/private/Sample.accdb";
//            String user="";
//            String password="";
//            Connection con=null;
//            Statement st=null;
//            ResultSet rs=null;
//            con=DriverManager.getConnection(url, user, password);
//            st=con.createStatement();
//
//            rs=st.executeQuery("select * from testtable");
//
//			//读取字段名称
//            ResultSetMetaData metaDate = rs.getMetaData();
//            int number = metaDate.getColumnCount();
//            column = new String[number];
//            for (int j = 0;j < column.length; j++){
//                column[j] = metaDate.getColumnName(j + 1);
//                System.out.print(column[j]+"\t");
//            }
//            System.out.println();
//            int a = 0;
//            //输出数据
//            while(rs.next()){
//                a++;
//                Object[] rss = new Object[number];
//                for(int i = 0;i < rss.length; i++){
//                    rss[i] = rs.getString(i + 1);
//                    System.out.print(rss[i]+"\t");
//                }
//                System.out.println();
//                map.put(a, rss)	;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }

}
