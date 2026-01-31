class Animal{
    void sound(){
        System.out.println("Tiger");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Cat");
    }
}
class Human extends Dog{
    void eat(){
        System.out.println("Eating");
    }
}
class P2 {
    public static void main(String[] args) {
        Human hu = new Human();
        hu.bark();
        hu.sound();
        hu.eat();
        
    }
}