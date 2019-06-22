package com.example.carsonserver.controller;

import com.example.carsonserver.domain.Detail;
import com.example.carsonserver.service.SampleDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Actual {
    @Autowired
    private SampleDetail sampleDetail;

    @GetMapping("/actual")
    public ModelAndView getActual(Model model){
        Detail detail = sampleDetail.getDetail();
        model.addAttribute("detail",detail);
        model.addAttribute("title","橘子电器");
        System.out.println("哈哈哈哈哈哈哈 actual");
        System.out.println(sampleDetail.getDetail().getWeChat_14());
        return new ModelAndView("index", "userModel", model);
    }

    @GetMapping("/history")
    public ModelAndView getHistory(Model model){
        System.out.println("哈哈哈哈哈哈哈 history");
        return new ModelAndView("history", "userModel", model);
    }
}
