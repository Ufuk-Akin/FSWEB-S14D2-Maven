package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("North");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(2 , PaintColor.WHITE);
        Bed bed = new Bed("King-size" , 4 , 2 ,3,3);
        Lamp lamp = new Lamp(LampType.NEON ,true , 4);
        Wardrobe wardrobe = new Wardrobe(5,3,50);
        Carpet carpet = new Carpet(4,5, PaintColor.RED);

        Bedroom bedroom = new Bedroom(
                "Bedroom1"
                , wall1 , wall2 ,wall3 , wall4 , ceiling ,
                bed, lamp ,wardrobe, carpet);

        System.out.println(bedroom);


    }
}