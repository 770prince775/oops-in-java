public class inh {
    void eat(){
        System.out.println("i am eatin ");
    }
    
}
class b extends inh{
    void fly(){
        System.out.println("i am flying ");
    }
    public static void main(String[] args) {
        inh n = new inh();
        n.eat();
        b ab = new b();
        ab.fly(); 
    }
}
