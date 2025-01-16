public class Example9_EqualsMethod_In_StringComparison {
    public static void main(String[] args) {
        stringComparison(); // string comparison
    }

    public static void stringComparison() {
        // string comparison
        System.out.println("\nString Comparison : ");
       
        
        String strObj1 = new String("Java"); // new object created in heap memory
        String strObj2 = new String("JAVA"); // new object created in heap memory
        String scpObj = strObj1.intern(); // new object created in string constant pool(SCP) area
        
        System.out.println("strObj1 address :"+strObj1); //Java
        System.out.println("scpObj address :"+scpObj); //Java
        
        /*  if you want to assign it to an Object reference (which can hold 
            any type of object, including String), you can still use: */

        String obj1 = new String("Hello");
        Object obj4 = obj1.intern();
        
        //Here obj1 and obj4 both refer to the string "Hello" in the string pool.
        
        System.out.println("strObj1 hash code :"+strObj1.hashCode()); //2301506 
        System.out.println("System.identityHashCode(strObj1) : "+System.identityHashCode(strObj1)); //1927950199
        
        System.out.println("scpObj.hashcode() :"+scpObj.hashCode()); //2301506
        System.out.println("System.Identity.HashCode(scpObj) :"+System.identityHashCode(scpObj)); //868693306
        
        
        
        /* Key Note : 
            Whenever we create a string object by using new keyword, then at runtime 
            two objects will be created such that one object will be created inside
            the heap memory and the second object with the literal value as 'Java' inside the 
            string constant pool area . This String constant pooling concept is used
            for memory management , so that any other string object with the same value
            can point to the same object inside the string constant pool area. Inspite of
            creating a new object in the heap memory.
         */
       /*  String strObj3 = "Java"; // new object created in string constant pool(SCP) area since it is created without new keyword we call it as string literal.
        
        String strObj4 = strObj1; // new object created in heap memory
        
        String strObj5 = "Java"; // new object created in string constant pool(SCP) area since it is created without new keyword we call it as string literal.
        
        String strObj6 = "Java8"; // new object created in string constant pool(SCP) area since it is created without new keyword we call it as string literal.
       
        System.out.println("strObj1 intern() :"+strObj1.intern()); 
        
        System.out.println("strObj2 address :"+strObj2); //JAVA
        
        System.out.println("strObj2 hash code of heap area :"+strObj2.hashCode()); 
        
        System.out.println("strObj2 hash code of intern() :"+strObj2.intern()); 
        
        System.out.println("strObj3 address :"+strObj3); //Java
        
        System.out.println("strObj3 hash code of SCP :"+strObj3.hashCode()); 
        
        System.out.println("strObj3 hash code of intern() :"+strObj3.intern()); 
        
        System.out.println("strObj4 address :"+strObj4); //Java
        
        System.out.println("strObj4 hash code of heap area :"+strObj4.hashCode()); 
        
        System.out.println("strObj4 hash code of intern() :"+strObj4.intern()); 
        
        System.out.println("strObj5 address :"+strObj5); //Java
        
        System.out.println("strObj5 hash code of SCP :"+strObj5.hashCode()); 
        
        System.out.println("strObj5 hash code of intern() :"+strObj5.intern()); 
        
        System.out.println("strObj6 address :"+strObj6); //Java8
        
        System.out.println("strObj6 hash code of SCP :"+strObj6.hashCode()); 
        
        System.out.println("strObj6 hash code of intern():"+strObj6.intern());  */
        
        // System.out.println("strObj1 == strObj2 : " + (strObj1 == strObj2)); // false since it compares references
        
        // System.out.println("strObj1 == strObj3 : " + (strObj1 == strObj3)); // false since it compares references
        
        // System.out.println("strObj1 == strObj3 : " + (strObj1 == strObj6)); // false since it compares references
        
        // System.out.println("strObj3 == strObj5 : " + (strObj3 == strObj5)); // true since it compares references
        
        // System.out.println("strObj1.equals(strObj2) : " + strObj1.equals(strObj2)); // false since it compares references
        
        // System.out.println("strObj1.equals(strObj3) : " + strObj1.equals(strObj3)); // true since it compares values
        
        // System.out.println("strObj1 == strObj4 : " + (strObj1 == strObj4));// true since it compares references
    }
}
