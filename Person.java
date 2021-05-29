/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemyassignmnet;

/**
 *
 * @author khusboo
 */
public class Person {
   
   // Set Fields
   private String firstName;
   private String lastName;
   private int age;
   
   //Method getFirstName
   public String getFirstName(){
       return this.firstName;
   }
   
   //Method getLastName
   public String getLastName(){
       return this.lastName;
   }
   
   //Method getAge
   public int getAge(){
       return this.age;
   }
   
   //Method setFirstName
   public void setFirstName(String firstName){
       this.firstName = firstName;
   }
   
   //Method setLastName
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    //Method setAge
    public void setAge(int age){
        if ((age <= 0) || (age > 100)){
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    
    //Method isTeen
    public boolean isTeen(){
        return ((this.age > 12) && (this.age < 20));
    }
    
    //Method getFullName
    public String getFullName(){
        if ((this.firstName.isEmpty()) && (this.lastName.isEmpty())){
            return "";
            
        } else if (this.lastName.isEmpty()){
            return this.firstName;
            
        } else if (this.firstName.isEmpty()){
            return this.lastName;
            
        } else {
            return this.firstName + " " + this.lastName;
        }
    }
    public static void main(String args[]){
        Person object = new Person();
        object.setFirstName("Khushboo");
        System.out.println(object.getFirstName());
        
        Person object1 = new Person();
        object1.setLastName("ahuja");
        System.out.println(object.getLastName());
        
        Person object2 = new Person();
        object2.setAge(21);
        System.out.println(object.getAge());
        
        
        
    }
}
