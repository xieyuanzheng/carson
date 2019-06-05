package com.example.carsonserver.domain;

public class Order {
    private String orderId;
    private String menfu;
    private String qiechang;
    private String zhangshu;
    private String kun;
    private String pokuan1;
    private String pokuan2;
    private String pokuan3;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMenfu() {
        return menfu;
    }

    public void setMenfu(String menfu) {
        this.menfu = menfu;
    }

    public String getQiechang() {
        return qiechang;
    }

    public void setQiechang(String qiechang) {
        this.qiechang = qiechang;
    }

    public String getZhangshu() {
        return zhangshu;
    }

    public void setZhangshu(String zhangshu) {
        this.zhangshu = zhangshu;
    }

    public String getKun() {
        return kun;
    }

    public void setKun(String kun) {
        this.kun = kun;
    }

    public String getPokuan1() {
        return pokuan1;
    }

    public void setPokuan1(String pokuan1) {
        this.pokuan1 = pokuan1;
    }

    public String getPokuan2() {
        return pokuan2;
    }

    public void setPokuan2(String pokuan2) {
        this.pokuan2 = pokuan2;
    }

    public String getPokuan3() {
        return pokuan3;
    }

    public void setPokuan3(String pokuan3) {
        this.pokuan3 = pokuan3;
    }
}
