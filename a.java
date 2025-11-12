class a{
    void eat(){
        System.out.println("i am eating ");
    }
}
class b {
    void fly(){
        System.out.println("i am flying ");
    }
    public static void main(String[] args) {
        a ab = new a ();
        ab.eat();
        b bb = new b();
        bb.fly(); 
    }
; }