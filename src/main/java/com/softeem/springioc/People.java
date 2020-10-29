package com.softeem.springioc;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class People {
    private String name;
    private Student son;
    private List method;
    private Map IDCard;
    private String[] address;
    private Properties prop;
    private Date today;

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getSon() {
        return son;
    }

    public void setSon(Student son) {
        this.son = son;
    }

    public List getMethod() {
        return method;
    }

    public void setMethod(List method) {
        this.method = method;
    }

    public Map getIDCard() {
        return IDCard;
    }

    public void setIDCard(Map IDCard) {
        this.IDCard = IDCard;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }
}
