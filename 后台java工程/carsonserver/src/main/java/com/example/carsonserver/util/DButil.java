package com.example.carsonserver.util;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.carsonserver.domain.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DButil {
    private static final Logger log = LoggerFactory.getLogger(DButil.class);

    public static Connection ConnectAccessFile(String dbpath) throws Exception{
        File dbFile = new File(dbpath);
        if(!dbFile.exists()){
            log.error("db数据库文件不存在，请确认路径是否正确：{}", dbpath);
            return null;
        }else{
            log.info("读取数据库文件，路径：{}", dbpath);
        }

        Connection conn = null;
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//这个驱动的地址不要改
        String dbur1 = "jdbc:ucanaccess:///"+dbpath;
        conn = DriverManager.getConnection(dbur1, "","");
        return conn;
    }

    public static void close(Connection con) {
        try {
            if(con!=null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(PreparedStatement ps) {
        try {
            if(ps!=null) ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(ResultSet rs) {
        try {
            if(rs!=null) rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //(String dbpath,String startTime,String endTime)
    public List<Sample> queryData(String dbpath) {
        Connection conn =null;
        PreparedStatement ps =null;
        ResultSet rs =null;
        List<Sample> list = new ArrayList<Sample>();
        try {
            conn = DButil.ConnectAccessFile(dbpath);
            if(conn==null){
                return null;
            }
//            ps = conn.prepareStatement("select "
//                    + "count(*),macid from normalimg where createtime >=? and createtime <=? "
//                    + "GROUP BY macid");
//            //设置查询参数
//            ps.setString(1, startTime);
//            ps.setString(2, endTime);
            ps = conn.prepareStatement("select * from testtable");
            //执行sql语句
            rs = ps.executeQuery();
            while (rs.next()) {
                //输出查询结果
                Sample sample = new Sample();
                sample.setId(rs.getInt(1));
                sample.setName(rs.getString(2));
                sample.setTimestamp(rs.getString(3));
                sample.setValue(rs.getString(4));
                System.out.println("结果一："+rs.getInt(1)+"===结果二："+rs.getString(2));
                System.out.println("sample.getTimestamp() : "+sample.getTimestamp());
                list.add(sample);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //关闭相关的连接
            DButil.close(conn);
            DButil.close(ps);
            DButil.close(rs);
        }
        return null;
    }
}
