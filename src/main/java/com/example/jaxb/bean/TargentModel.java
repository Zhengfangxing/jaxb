package com.example.jaxb.bean;


import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

public class TargentModel {
    private String name;
    private String type;

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public TargentModel(String name, String type, List<Column> columns) {
        this.name = name;
        this.type = type;
        this.columns = columns;
    }

    public TargentModel() {
    }

    private List<Column> columns;


}
