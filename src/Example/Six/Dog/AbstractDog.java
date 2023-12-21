package Example.Six.Dog;

public class AbstractDog {
    String poroda;
    String name;

    public AbstractDog(String poroda, String name){
        this.name = name;
        this.poroda = poroda;
    }
    public String toString(){
        return this.name + this.poroda;
    }
}
