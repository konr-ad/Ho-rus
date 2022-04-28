package pl.wall;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // write your code here

        //Structure extends CompositeBlock, aby zaimplementować interface CompositeBlock oraz
        //interface Block. Można byłoby utworzyć nową klasę, która dziedziczyłaby po interface CompositeBlock -
        //ułatwiłoby to tworzenie obiektów klasy Wall, gdzie jest pole private List blocks.
        //Jednak nie było powiedziane, że jest dozwolone tworzenie dodatkowych klas.
        //Cały kod znajduje się w klasie Wall. Poniżej znajduje się kod potrzebny do tworzenia obiektów
        // oraz wywoływanie komend. Metoda findBlocksByMaterial zwraca obiekty z listy.


        Block block1 = new Wall("Concrete", "White");
        Block block2 = new Wall("Glass", "Orange");
        Block block3 = new Wall("Lead", "Blue");
        Block block4 = new Wall("Asphalt", "Black");
        Wall Wall1 = new Wall("Concrete", "White");
        CompositeBlock compositeBlock = new Wall("Concrete", "Red");

        ((Wall) compositeBlock).addBlock(block2);
        Wall1.addBlock(block3);
        System.out.println(compositeBlock.getBlocks());

        Wall1.addBlock(block1);
        Wall1.addBlock(block2);
        Wall1.addBlock(block4);
        Wall1.addBlock(block3);

        System.out.println("Wall1.count = " + Wall1.count());
        System.out.println("block2 = " + block2.getColor());
        System.out.println("block2 = " + block2.getMaterial());
        System.out.println(Wall1.findBlockByColor("Black"));
        System.out.println(Wall1.findBlocksByMaterial("Concrete"));

    }
}
