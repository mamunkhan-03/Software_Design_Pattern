
package singleton;

public class Student {
    
    private static Student student;
    
   private static  String name;
   private static int roll;
   private static double cgpa;
   
   private Student (String name, int roll, float cgpa){
       this.name=name;
       this.roll=roll;
       this.cgpa=cgpa;
             
   }
   
   
   
    public static Student getInstance (String name, int roll, double cgpa){
       if(Student.student==null){
           
           return student=new Student("mamun", 19, 400);
            
        }
       
       return student;
    }
    
    public void show (){
        System.out.println(name+""+roll+" "+cgpa);
    }
}
