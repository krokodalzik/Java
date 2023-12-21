package Example.Six;

import Example.Six.Dish.AbstractDish;
import Example.Six.Dish.Plate;
import Example.Six.Dog.Pudel;
import Example.Six.Furniture.AbstractFurniture;
import Example.Six.Furniture.chair;

public class main {
    public static void main(String[] args){

        Plate b = new Plate("Plate, "   ,"titicaca, ",228);
        System.out.println(b);

        chair chair = new chair(1600, "IKEA", "White", "kitchen", "Sitting" );
        System.out.println(chair);

        Pudel pudel = new Pudel("pudel, ", "Anton");
        System.out.println(pudel);
    }
}
