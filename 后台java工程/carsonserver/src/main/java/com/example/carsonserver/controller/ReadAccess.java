package com.example.carsonserver.controller;

import com.example.carsonserver.domain.Sample;
import com.example.carsonserver.util.DButil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ReadAccess {

    @GetMapping("/access")
    public List<Sample> query(){
        DButil dButil = new DButil();
        Sample sample = new Sample();
        String filePath = "/Users/xieyuanzheng/Desktop/work/private/Sample.accdb";
        List<Sample> list = dButil.queryData(filePath);
        return list;
    }
}
