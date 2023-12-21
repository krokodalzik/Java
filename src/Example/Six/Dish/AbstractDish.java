package Example.Six.Dish;

public class AbstractDish {
    String name;
    String firm;
    int price;
    public AbstractDish(String name, String firm, int price){
        this.name = name;
        this.firm = firm;
        this.price = price;
    }
    public String toString(){
        return this.name + this.firm + this.price;
    }
}
