package com.example.demo;


import com.example.jaxb.bean.Column;
import com.example.jaxb.bean.FileMapping;
import com.example.jaxb.bean.TargentModel;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

public class FileMappingTest {
    @Test
    public void marshaller() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(FileMapping.class);
        FileMapping data = new FileMapping();
        ArrayList<TargentModel> model1 = new ArrayList<>();
        ArrayList<Column> columns = new ArrayList<>();
        columns.add(new Column("name1", "10", "string", "default"));
        columns.add(new Column("name2", "20", "int", "default"));
        model1.add(new TargentModel("transaction", "csv", columns));
        model1.add(new TargentModel("account", "flat", columns));
        data.setTargentModels(model1);
        Marshaller marshaller = jaxbContext.createMarshaller();
//        决定是否在转换成xml时同时进行格式化（即按标签自动换行，否则即是一行的xml）
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        xml的编码方式
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
//        是否省略xml头信息
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        marshaller.marshal(data, System.out);
        System.out.println();
    }

    @Test
    public void unmarshal() throws JAXBException {
        File file = new File("src/main/resources/fileMapping.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(FileMapping.class);
        FileMapping unmarshal = (FileMapping) jaxbContext.createUnmarshaller().unmarshal(file);
        System.out.println(unmarshal);
    }
}