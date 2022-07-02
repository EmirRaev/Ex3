import inBackpack.normal.*;

public class Main {
    public static void main(String[] args) {
        Backpack backpack1 = new Backpack(new Book(), new Coca(), new Apple(),20);
        Backpack backpack2 = new Backpack(new Folder(), new Water(), new TennisBall(), 50);
        Backpack backpack3 = new Backpack(new Folder(), new Coca(), new Apple(),10);
        backpack3.addCircles(new TennisBall(),3);

        System.out.println(backpack1);
        System.out.println("--------------");
        System.out.println(backpack2);
        System.out.println("--------------");
        System.out.println(backpack3);
    }
}
