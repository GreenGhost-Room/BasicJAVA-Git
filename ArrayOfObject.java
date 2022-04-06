class Employee{
    String id,Name,Sallary;
    
    public Employee(String id,String Sallary,String Name ){
        this.id=id;
        this.Sallary=Sallary;
        this.Name=Name;
        System.out.println("id: "+id);
        System.out.println("nmae: "+Name);
        System.out.println("Sallary: "+Sallary);

    }
   
    
}
public class ArrayOfObject {
    public static void main(String[] args) {
        Employee []emp=new Employee[5];
        for(int i=0;i<emp.length;i++){
            emp[i]=new Employee("1", "ram","70000");
        }
      
       
        
        
        
    }
    
}
