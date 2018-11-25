package com.example.jaxb.bean;

import javax.xml.bind.annotation.XmlAttribute;

public class Column {
    public Column() {
    }

    public Column(String name, String length, String type, String generator) {
        this.name = name;
        this.length = length;
        this.type = type;
        this.generator = generator;
    }

    @XmlAttribute
    private String name;
    @XmlAttribute
    private String length;
    @XmlAttribute
    private String type;
    @XmlAttribute
    private String generator;
}
