public class multi {
    void eat(){
        System.out.println(" i am eating bro ");
    }
    
}
class b extends multi{
    void fly(){
        System.out.println("i am flying ");
    }
}
class c extends b {
   void run(){
    System.out.println("i am running ");
   }
   public static void main(String[] args) {
    multi m = new multi();
    m.eat();
    b ab = new b();
    ab.fly();
    c cb = new c();
    cb.run(); 
   }
}

