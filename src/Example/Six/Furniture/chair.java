package Example.Six.Furniture;

public class chair extends AbstractFurniture{

 String forwhat;
    public chair(int prise, String name, String color, String rooms, String forwhat) {
        super(prise, name, color, rooms);
        this.forwhat = forwhat;
    }
    public String toString(){
        return this.forwhat;
    }
}
