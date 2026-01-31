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
class P1 {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.bark();
        dg.sound();
    }
}