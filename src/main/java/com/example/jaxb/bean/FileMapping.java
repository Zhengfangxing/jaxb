package com.example.jaxb.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class FileMapping {
    @XmlElement
    private List<TargentModel> targentModels;


    public void setTargentModels(List<TargentModel> targentModels) {
        this.targentModels = targentModels;
    }

    @Override
    public String toString() {
        return "FileMapping{" +
                "targentModels=" + targentModels +
                '}';
    }
}
