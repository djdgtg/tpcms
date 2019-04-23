package com.retech.tpcms.utils;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Date;
import java.util.List;


public class XmlUtils {

    /**
     * 根据类的属性名找表的列名（取一个的时候可以使用此方法）
     *
     * @param fileName 类对应的Mapper xml文件
     * @param property 属性名（对应的Java对象属性名）
     * @return
     */
    public static String getMapperColumnByProperty(String fileName, String property, boolean custom) {
        try {
            SAXReader saxReader = new SAXReader();
            Document document;
            if (custom) {
                document = saxReader.read(XmlUtils.class.getClassLoader().getResourceAsStream("mapper/custom/" + fileName));
            } else {
                document = saxReader.read(XmlUtils.class.getClassLoader().getResourceAsStream("mapper/" + fileName));
            }
            if (document != null) {
                Element root = document.getRootElement();
                if (root != null) {
                    List<Element> resultMaps = root.elements("resultMap");
                    for (Element resultMap : resultMaps) {
                        if (resultMap != null && resultMap.attributeValue("id").equals("BaseResultMap")) {
                            List<Element> properties = resultMap.elements();
                            for (Element prop : properties) {
                                if (prop != null && prop.attributeValue("property").equals(property)) {
                                    return prop.attributeValue("column");
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        long startTime = new Date().getTime();
        long endTime = new Date().getTime();
        System.out.println("所用的时间间隔是：" + (endTime - startTime));

    }


}
