/* Example1 : Difference between equality operator (==) and equals().
   Part 1 :
   ========
   Why should we override the equals() when we are comparing two class objects?
                (or)
   What happens if we don't override the equals() when we are comparing the two class objects?

   Key Note : 
   --------
   Use == to compare references (are they the exact same object?).
   Override .equals() to define logical equality for objects (e.g., compare content, IDs, or names).

   Best Practices:
   ===============
    - Always override hashCode() when you override equals() for consistency.
    - Use .equals() when comparing the logical content of objects in business logic.
*/ 

public class Example1_WhyOverride_EqualsMethod{
    String language;

    public Example1_WhyOverride_EqualsMethod(String language) {
     //here (String language) is passed as method arguement

	/* If data members and method arguements are same then we get shadowing/ambiguity problem, 
	   to resolve this we use 'this' keyword.
	   
       We put this keyword prefix to the instance variable.
	   Which means we are storing the method argument (i.e language of type String) 
	   into the instace variable called 'language' which is also a String.
    */
        this.language = language;
    }

    public static void main(String[] args) {
        Example1_WhyOverride_EqualsMethod prog1 = new Example1_WhyOverride_EqualsMethod("java");
        Example1_WhyOverride_EqualsMethod prog2 = new Example1_WhyOverride_EqualsMethod("java");

        System.out.println("using == : " + (prog1 == prog2)); // false --> different reference
        System.out.println("using .equals() :" + prog1.equals(prog2)); // false -- No overriden logic
        /* 

          Q) Why this keyword is used here?
             If data members and method arguements are same then we get shadowing/ambiguity problem, 
	         to resolve this we use 'this' keyword.

             We put this keyword prefix to the instance variable.
	         Which means we are storing the method argument (i.e language of type String) 
	         into the instace variable called 'language' which is also a String.

          Q) what happens if we don't override the equals() when we are comparing the two class objects?
             If no overriden logic for equals(), then the equals() acts like the equality operator (==),
             which means it will see the reference address but not the logical address(i.e content value).
          
          Q) why should we override the equals() when we are comparing two class objects?
             To compare the content values between two objects we must override the equals().
        */
    }
}