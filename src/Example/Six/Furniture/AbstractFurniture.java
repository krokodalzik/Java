package Example.Six.Furniture;

public class AbstractFurniture {
    private final int prise;
    private final String name;
    private final String color;
    private final String rooms;

    public AbstractFurniture(int prise, String name, String color, String rooms){
        this.prise = prise;
        this.name = name;
        this.color = color;
        this.rooms = rooms;
    }
    public String toString(){
        return this.prise + this.name + this.color + this.rooms;
    }

}
