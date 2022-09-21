class Emp{
public String empname;
public String empemail;
public void setempname(String empname){
this.empname= empname;
}
public void setempemail(String empemail){
this.empemail=empemail;
}
public String getempname(){
return this.empname;
}
public String setempemail(){
return this.empemail;
}
public String getd(){
return ("Empname :- "+getempname()+"\nEmpemail :- "+getempemail()+"\n\n");
}
}
class Man extends Emp{
public String mandept ="MCA";

public void setmandept(String mandept){
this.mandept=mandept;
}
public String getmandept(){
return this.mandept;
}
@Override
public String getd(){
return ("Empname :- "+getempname()+"\nEmpemail :- "+getempemail()+"\nMandept :-"+getmandept()+"\n\n");
}
}
public class Polymorphism_in_java{
  public static void main(String [] args){
Emp obj1 = new Emp();
    obj1.setempname("Chintu");
    obj1.setempemail("Chintu@gmail.com");  
    System.out.println("Emp Class Obj "+obj1.getd());
    
Emp obj2 = new Man();
    obj2.setempname("Prajwal");
    obj2.setempemail("Prajwal@gmail.com");  
   // obj2.setmandept("MCA");  This Line shows error because the refernce of Emp class is getting 
    System.out.println("Emp Class Refernce And Object as Man "+obj2.getd());
    
Man obj3 = new Man();
    obj3.setempname("Pranil");
    obj3.setempemail("Pranil@gmail.com");  
    obj3.setmandept("BCA"); 
    System.out.println("Man Class Obj "+obj2.getd());
  
  }
}
