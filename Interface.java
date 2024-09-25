interface Animal{
    void sound();

}

interface playable{
    void play();

}
class Dog implements Animal, playable{
    @Override
    public void sound(){
        System.out.println("Bark");
        
    }

    @Override
    public void play() {
        System.out.println("Hide and seek");
    }
}
public class Interface {
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.sound();
        dog.play();
    }
}
