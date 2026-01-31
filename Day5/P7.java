abstract class Shape{
    abstract void draw();
    void message(){
        System.out.println("Hello");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Dog");
    }
}
class P7{
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.draw();
        cr.message();
    }
}
