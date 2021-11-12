package com.company.Nine;

import java.util.Date;

public class PeriodikLiterature extends Literature{
    private String Type;
    public String PeriodCreator;

    public PeriodikLiterature(int code, String literatureType, String name, Date dateCreate, String nameCreation, String type, String periodCreator) {
        super(code, literatureType, name, dateCreate, nameCreation);
        Type = type;
        PeriodCreator = periodCreator;
    }
}
