package day03;

public class EX03 {
    public static void main(String[] args) {
        // class Garden
        // calss Dog, Cat extends Pet
        Garden garden = new Garden();
        Dog dog = new Dog();
        Cat cat = new Cat();
        garden.getSound(dog);
        garden.getSound(cat);
    }
}
class Garden{
    void getSound(Pet pet){
        if(pet instanceof Dog){
            System.out.println("멍멍");
        }
        pet.cry();
    }
}
class Pet{
    void cry(){
        System.out.println("동물 울음소리");
    }
}
class Dog extends Pet{
    @Override
    void cry(){
        System.out.println("멍멍");
    }
}
class Cat extends Pet{
    @Override
    void cry(){
        System.out.println("야용");
    }
}