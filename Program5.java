class SayHi{
    void display()
    {
        System.out.println("Hi");
    }

}
class SayHello extends SayHi{
    void display()
    {
        System.out.printf("hello ");
    }

}

public class Program5{
    public static void main(String[] args) {
        SayHello obj = new SayHello();
        obj.display();
    }
}
