public class counter {
  static   int count =0; // kyuki jiss se haar baar value increase hoti chali jaye // 
    counter(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        counter c = new counter();
        counter c1 = new counter();
        counter c3 = new counter();  

    }
    
} 
