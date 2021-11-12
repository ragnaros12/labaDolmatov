package com.company.Nine;

import java.util.Date;

public class GuideLiterature extends Literature{
    private String Direction;
    private int Tome;
    private int Part;

    public GuideLiterature(int code, String literatureType, String name, Date dateCreate, String nameCreation, String direction, int tome, int part) {
        super(code, literatureType, name, dateCreate, nameCreation);
        Direction = direction;
        Tome = tome;
        Part = part;
    }
}
