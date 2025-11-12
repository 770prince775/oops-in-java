public class heri {
    void vehicle(){
        System.out.println("this is the vehicle ");
    }
    
}
class car extends heri {
    void fast(){
        System.out.println("i am fast ");
    }
}
class phone extends heri{
    void hello(){
        System.out.println("i am say hello ");
    }
    public static void main(String[] args)  {
        heri h = new heri();
        h.vehicle();
         car c = new car();
         c.fast();
         phone p = new phone();
         p.hello(); 
    }
}
