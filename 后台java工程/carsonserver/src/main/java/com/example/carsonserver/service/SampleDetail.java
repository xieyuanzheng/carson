package com.example.carsonserver.service;

import com.example.carsonserver.domain.Detail;
import com.example.carsonserver.domain.Sample;
import com.example.carsonserver.util.DButil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleDetail {
    public Detail getDetail(){
        DButil dButil = new DButil();
        Sample sample = new Sample();
        //String filePath = "/Users/xieyuanzheng/Desktop/work/private/Sample.accdb";
        String filePath = "C:\\miniwechat\\Sample.accdb";
        List<Sample> list = dButil.queryData(filePath);
        List listvalue = new ArrayList();
        for(int i=0;i<list.size();i++){
            String value;
            value = list.get(i).getValue();
            listvalue.add(value);
        }
        Detail detail = new Detail();

        detail.setWeChat_1(listvalue.get(0).toString());
        detail.setWeChat_2(listvalue.get(1).toString());
        detail.setWeChat_3(listvalue.get(2).toString());
        detail.setWeChat_4(listvalue.get(3).toString());
        detail.setWeChat_5(listvalue.get(4).toString());
        detail.setWeChat_6(listvalue.get(5).toString());
        detail.setWeChat_7(listvalue.get(6).toString());
        detail.setWeChat_8(listvalue.get(7).toString());
        detail.setWeChat_9(listvalue.get(8).toString());
        detail.setWeChat_10(listvalue.get(9).toString());
        detail.setWeChat_11(listvalue.get(10).toString());
        detail.setWeChat_12(listvalue.get(11).toString());

        detail.setWeChat_13(listvalue.get(12).toString());
        detail.setWeChat_14(listvalue.get(13).toString());
        detail.setWeChat_15(listvalue.get(14).toString());
        detail.setWeChat_16(listvalue.get(15).toString());
        detail.setWeChat_17(listvalue.get(16).toString());
        detail.setWeChat_18(listvalue.get(17).toString());
        detail.setWeChat_19(listvalue.get(18).toString());
        detail.setWeChat_20(listvalue.get(19).toString());
        detail.setWeChat_21(listvalue.get(20).toString());
        detail.setWeChat_22(listvalue.get(21).toString());
        detail.setWeChat_23(listvalue.get(22).toString());
        detail.setWeChat_24(listvalue.get(23).toString());

        detail.setWeChat_25(listvalue.get(24).toString());
        detail.setWeChat_26(listvalue.get(25).toString());
        detail.setWeChat_27(listvalue.get(26).toString());
        detail.setWeChat_28(listvalue.get(27).toString());
        detail.setWeChat_29(listvalue.get(28).toString());
        detail.setWeChat_30(listvalue.get(29).toString());
        detail.setWeChat_31(listvalue.get(30).toString());
        detail.setWeChat_32(listvalue.get(31).toString());
        detail.setWeChat_33(listvalue.get(32).toString());
        detail.setWeChat_34(listvalue.get(33).toString());
        detail.setWeChat_35(listvalue.get(34).toString());
        detail.setWeChat_36(listvalue.get(35).toString());

        return detail;
    }
}
