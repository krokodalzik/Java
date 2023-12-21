package Example.Second.Author;

public class Autor {
    String name;
    String email;
    char gender;

    public Autor(String n, String e, char g) {
        this.name = n;
        this.email = e;
        this.gender = g;
    }
    public void auth(){
        System.out.println("name:"+name+"\n" + "email: " + email + "\n" + "gender: " + gender);
    }
}
