package com.company.Nine;

import java.util.Date;

public class TechnoSinceLiterature extends Literature{
    private String TypeSince;
    private int CountBiiks;

    public TechnoSinceLiterature(int code, String literatureType, String name, Date dateCreate, String nameCreation, String typeSince, int countBiiks) {
        super(code, literatureType, name, dateCreate, nameCreation);
        TypeSince = typeSince;
        CountBiiks = countBiiks;
    }
}
