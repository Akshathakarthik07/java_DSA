package inheritance;

public class animals extends Animal {
    void sound(){
        System.out.println("dog bark");
    }
    void display(){
        super.sound();
    }

}
