package com.retech.tpcms.entity.custom;

/**
 * @author qinc
 * @description
 * @date 2018/12/11
 */
public class CustomSearchBean {

    private Integer start;

    private Integer length;

    private String column;

    private String dir;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
}
