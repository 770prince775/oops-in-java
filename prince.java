 interface a {
    void show();
    
} // multiple inheritance hum interface keyword ka use karte h // 
interface b {
    void display();   
}
class prince implements a, b{
    public void show(){
  System.out.println("this is the interface program in java ");
    }
    public void display(){
        System.out.println("this is the display method ");
    }
    public static void main(String[] args) { // this is the multiple inheritance  program in java // 
         prince p = new prince();
         p.show();
         p.display();  
        
    }
}
