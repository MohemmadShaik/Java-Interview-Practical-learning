/*Question 6 : 
A) Static Methods are Polymorphic in nature or not?

Sol : Static Methods Are Not Polymorphic :
      ----------------------------------
      Static methods are bound to the class they are declared
      in, not the object instance. Hence, they do not 
      exhibit polymorphism (runtime method overriding).

      Hiding, Not Overriding :
      ----------------------
      When a child class defines a static method with the 
      same name as a static method in the parent class, 
      it hides the parent class's static method. 
      This is called method hiding, not overriding.

      Compile-Time Binding :
      --------------------
      Static methods are resolved at compile time based on 
      the reference type, not at runtime based on the 
      object's actual type.

 B) What will be the output for the below code?
    Sol : Static method in Parent
          Static method in Child
          Static method in Parent
 */

class Parent { 
    static void staticMethod() { 
        System.out.println("Static method in Parent"); 
    }
    
} 
class Child extends Parent {
   static void staticMethod() {
        System.out.println("Static method in Child"); 
   } 
} 
public class Question6_StaticMethodTest {
    public static void main(String[] args) {
        Parent.staticMethod(); //Calls the static method defined in the Parent class
        Child.staticMethod(); //Calls the static method defined in the Child class.
        Parent parent = new Child(); 
        /* The reference type is Parent, so the static 
           method of the Parent class is invoked.
           Even though the object is of type Child, the 
           static method resolution depends on the 
           reference type (Parent). */ 
        
           parent.staticMethod(); 
    } 
}