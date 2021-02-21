package com.cicd.herokuautodeploy.model;

public class TestDto {

    private String msg;
    private String ststus;

    public TestDto() {
    }

    public TestDto(String msg, String ststus) {
        this.msg = msg;
        this.ststus = ststus;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStstus() {
        return ststus;
    }

    public void setStstus(String ststus) {
        this.ststus = ststus;
    }
}
