package builder;

import builder.item.Characteristic;
import builder.item.Item;
import builder.item.impl.Bike;
import builder.item.impl.Laptop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item bike = new Bike(Characteristic.builder().brand("Author").wheel("горные").build());
        Item laptop = new Laptop(Characteristic.builder().brand("Asus").build());
        List<Item> list = new ArrayList<>();
        list.add(bike);
        list.add(laptop);
        System.out.println(list);

    }
}
