public class Employee {
    int emp_id;
    String name;
   static  String company = "Smart Programming";  // agar kisi bhi variable ka baar baar repeat ho rha h tho static keyword ka use kar karenge // 
    Employee(int emp_id, String name){
        this.emp_id=emp_id;
        this.name = name;   // static keyword ki hep se hum memory management kar sakte h // 

    }
    void display(){
        System.out.println(emp_id+" "+name+" "+company);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"amit");
        e1.display();
        Employee e2 = new Employee(102, "abhay"); 
        e2.display();   
    }
    
}
