public class animal {
    void eat(){
        System.out.println("i am eating ");
    }
    
}
class b {
    void fly(){
        System.out.println("i am flying ");
    }
    public static void main(String[] args) {
        animal a = new animal();
         a.eat();
         b ab = new b();
         ab.fly(); 
    }
}
