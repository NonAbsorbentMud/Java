package domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class DataTypeModel implements Serializable {
    private byte basebyte;
    private short baseshort;
    private int baseint;
    private float basefloat;
    private double basedouble;
    private long baselong;
    private char basechar;
    private boolean baseboolean;

    private Byte packbyte;
    private Short packshort;
    private Integer packint;
    private Float packfloat;
    private Double packdouble;
    private Long packlong;
    private Character packchar;
    private Boolean packboolean;

    private String str;
    private Object obj;
    private Date date;
    private BigDecimal bigDecimal;
    private BigInteger bigInteger;

    public byte getBasebyte() {
        return basebyte;
    }

    public short getBaseshort() {
        return baseshort;
    }

    public int getBaseint() {
        return baseint;
    }

    public float getBasefloat() {
        return basefloat;
    }

    public double getBasedouble() {
        return basedouble;
    }

    public long getBaselong() {
        return baselong;
    }

    public char getBasechar() {
        return basechar;
    }

    public boolean getBaseboolean() {
        return baseboolean;
    }

    public Byte getPackbyte() {
        return packbyte;
    }

    public Short getPackshort() {
        return packshort;
    }

    public Integer getPackint() {
        return packint;
    }

    public Float getPackfloat() {
        return packfloat;
    }

    public Double getPackdouble() {
        return packdouble;
    }

    public Long getPacklong() {
        return packlong;
    }

    public Character getPackchar() {
        return packchar;
    }

    public Boolean getPackboolean() {
        return packboolean;
    }

    public String getStr() {
        return str;
    }

    public Object getObj() {
        return obj;
    }

    public Date getDate() {
        return date;
    }

    public void setBasebyte(byte basebyte) {
        this.basebyte = basebyte;
    }

    public void setBaseshort(short baseshort) {
        this.baseshort = baseshort;
    }

    public void setBaseint(int baseint) {
        this.baseint = baseint;
    }

    public void setBasefloat(float basefloat) {
        this.basefloat = basefloat;
    }

    public void setBasedouble(double basedouble) {
        this.basedouble = basedouble;
    }

    public void setBaselong(long baselong) {
        this.baselong = baselong;
    }

    public void setBasechar(char basechar) {
        this.basechar = basechar;
    }

    public void setBaseboolean(boolean baseboolean) {
        this.baseboolean = baseboolean;
    }

    public void setPackbyte(Byte packbyte) {
        this.packbyte = packbyte;
    }

    public void setPackshort(Short packshort) {
        this.packshort = packshort;
    }

    public void setPackint(Integer packint) {
        this.packint = packint;
    }

    public void setPackfloat(Float packfloat) {
        this.packfloat = packfloat;
    }

    public void setPackdouble(Double packdouble) {
        this.packdouble = packdouble;
    }

    public void setPacklong(Long packlong) {
        this.packlong = packlong;
    }

    public void setPackchar(Character packchar) {
        this.packchar = packchar;
    }

    public void setPackboolean(Boolean packboolean) {
        this.packboolean = packboolean;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public BigInteger getBigInteger() {
        return bigInteger;
    }

    public void setBigInteger(BigInteger bigInteger) {
        this.bigInteger = bigInteger;
    }
}
