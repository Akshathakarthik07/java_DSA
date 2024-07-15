package Constructor;

public class Data {

    private String name;

    Data(String name){
        this .name=name;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    void Display(){
        System.out.print(name);
    }
}
