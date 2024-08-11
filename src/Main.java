import Impl.ExtraCheeseTopping;
import Impl.FarmhousePizza;
import Impl.MushroomTopping;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi There at Dominos !");
        FarmhousePizza pizza1 = new FarmhousePizza();
        System.out.println(new MushroomTopping(new ExtraCheeseTopping(pizza1)).getCost());
    }
}