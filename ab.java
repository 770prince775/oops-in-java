public class ab {
    void a(){
         System.out.println("function of a ");
    }
    
}
class B extends ab{
    void b(){
        System.out.println("this is the function b ");
    }

}
class C extends B{
    void c(){
        System.out.println("this is the funtion c ");
    }
}
class D extends C{
    void d(){
        System.out.println("this is the function d ");
    }
}   
class main {
    public static void main(String[] args) {
    C ac = new C(); // hum c method se a, b, c, class ko call kara sakte h // 
    ac.c(); // hum c class ke mehtod se d ko call nahi kara sakte h // 
    ac.b();   // this is the inheritance code in java // 
    ac.a(); 
    D ad = new D(); // ye D class ka object h // 
    ad.a(); // hum d object se a ko call kara sakte h // 
    ad.b(); // b ko bhi call kara sakte h // 
    ad.d();   // or d khud ko bhi call kara sakta  h // 
     // pr hum d se c ko call nahi kara sakte h // 
}
}