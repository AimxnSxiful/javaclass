class Animal{
    public void sound(){
        System.out.println("Hop hop");

    }
}
//must be override on every subclass to avoid code crash 
//subclass 1
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Barking");
    }
}

//subclass 2
class Cow extends Animal{
    @Override
    public void sound(){
        System.out.println("Moo");
    }
}
//subclass 3
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow Meow");

    }
}
//main function to inherit from the superclass
public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal =new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();

        myAnimal = new Cow();
        myAnimal.sound();

    }
    
}
