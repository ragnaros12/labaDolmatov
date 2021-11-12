package com.company.Nine;

import java.util.Date;

public class Literature {
    private int Code;
    private String LiteratureType;
    private String Name;
    private Date DateCreate;
    private String NameCreation;
    private int CountPages;
    private String Author;

    public Literature(int code, String literatureType, String name, Date dateCreate, String nameCreation) {
        Code = code;
        LiteratureType = literatureType;
        Name = name;
        DateCreate = dateCreate;
        NameCreation = nameCreation;
    }

    @Override
    public String toString() {
        return "Literature{" +
                "Code=" + Code +
                ", LiteratureType='" + LiteratureType + '\'' +
                ", Name='" + Name + '\'' +
                ", DateCreate=" + DateCreate +
                ", NameCreation='" + NameCreation + '\'' +
                ", CountPages=" + CountPages +
                ", Author='" + Author + '\'' +
                '}';
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getLiteratureType() {
        return LiteratureType;
    }

    public void setLiteratureType(String literatureType) {
        LiteratureType = literatureType;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getDateCreate() {
        return DateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        DateCreate = dateCreate;
    }

    public String getNameCreation() {
        return NameCreation;
    }

    public void setNameCreation(String nameCreation) {
        NameCreation = nameCreation;
    }

    public int getCountPages() {
        return CountPages;
    }

    public void setCountPages(int countPages) {
        CountPages = countPages;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
