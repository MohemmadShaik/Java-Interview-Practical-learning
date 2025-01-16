/* Example5 : - What happens when we create a String object using new Keyword
                discussed in detail.
              -  Difference between Heap memory and String Constant Pool (SCP) memory.
              -  How and when to use  intern(), objName.hashcode(), System.identityHashCode(objName) methods.
*/
public class Example5_String_HeapObj_VS_SCPObj{
public static void main(String[] args) {

        String s1 = new String("Java"); // Creates a heap object
        String scpObject1 = s1.intern(); // SCP(String Constant Pool) object reference
		
/* Note : whenever we create a String object using new keyword then 
          two obects were created.
          1st object : inside the heap memory
          2nd object : inside the SCP (String Constant Pool) where all literal values are stored.

   Key note : String constant pool also resides inside the heap memory */

		String s2 = new String("Java"); // Creates a heap object
        String scpObject2 = s2.intern(); // SCP(String Constant Pool) object reference
	
		String s3 = s1; // Creates a heap object
        String scpObject3 = s3.intern(); // SCP(String Constant Pool) object reference

        String s4 = "Java"; // Creates a SCP object
        String scpObject4 = s4.intern(); // SCP(String Constant Pool) object reference

        String s5 = "Java8"; // Creates a SCP object
        String scpObject5 = s5.intern(); // SCP(String Constant Pool) object reference

        String s6 = "JAVA"; // Creates a SCP object
        String scpObject6 = s6.intern(); // SCP(String Constant Pool) object reference

        String s7 = new String("JAVA"); // Creates a heap object
        String scpObject7 = s7.intern(); // SCP object reference

        String s8 = "JAVA"; // Creates a SCP object
        String scpObject8 = s8.intern(); // SCP object reference

        String s9 = s8;
        String scpObject9 = s9.intern();

		String s10 = s6;
        String scpObject10 = s10.intern();
		
        System.out.println("\n\n============== s1 and scpObject1 memory address =======================\n");
        // s1 Print the string value of the objects
        System.out.println("String object (heap1) : " + s1); // Prints "Java"
        System.out.println("String object (SCP1) : " + scpObject1); // Prints "Java"

        // s1 Print the hash codes
        System.out.println("Hashcode address of string object1 : " + s1.hashCode()); // Prints hash code for "Java"
        System.out.println("Hashcode address of SCP object1 : " + scpObject1.hashCode()); // Same as above, as both have the same value

        // s1 Identity hash codes (to distinguish the heap and SCP objects)
        System.out.println("IdentityHashCode of string object1 : " + System.identityHashCode(s1)); // Heap object hash
        System.out.println("IdentityHashCode of SCP object1 : " + System.identityHashCode(scpObject1)); // SCP object hash
		
		System.out.println("\n\n============== s2 and scpObject2 memory address =======================\n");
		// s2 Print the string value of the objects
        System.out.println("String object (heap2) : " + s2); // Prints "Java"
        System.out.println("String object (SCP2) : " + scpObject2); // Prints "Java"

        // s2 Print the hash codes
        System.out.println("Hashcode address of string object2 : " + s2.hashCode()); // Prints hash code for "Java"
        System.out.println("Hashcode address of SCP object2 : " + scpObject2.hashCode()); // Same as above, as both have the same value

        // s2 Identity hash codes (to distinguish the heap and SCP objects)
        System.out.println("IdentityHashCode of string object2 : " + System.identityHashCode(s2)); // Heap object hash
        System.out.println("IdentityHashCode of SCP object2 : " + System.identityHashCode(scpObject2)); // SCP object hash
		
        System.out.println("\n\n============== s3 and scpObject3  memory address =======================\n");
		
		// s3 Print the string value of the objects
        System.out.println("String object (heap3): " + s3); // Prints "Java"
        System.out.println("String object (SCP3): " + scpObject3); // Prints "Java"

        // s3 Print the hash codes
        System.out.println("Hashcode address of string object3: " + s3.hashCode()); // Prints hash code for "Java"
        System.out.println("Hashcode address of SCP object3: " + scpObject3.hashCode()); // Same as above, as both have the same value

        // s3 Identity hash codes (to distinguish the heap and SCP objects)
        System.out.println("IdentityHashCode of string object3: " + System.identityHashCode(s3)); // Heap object hash
        System.out.println("IdentityHashCode of SCP object3: " + System.identityHashCode(scpObject3)); // SCP object hash

        //s4 Print the string value of the objects
        System.out.println("\n\n============== s4 memory address =======================\n");
        System.out.println("String object (heap4): " + s4); // Prints "Java"
        System.out.println("String object (SCP4): " + scpObject4); // Prints "Java"
        
        //s4 Print the hash codes
        System.out.println("Hashcode address of heap object4: " + s4.hashCode()); // Prints hash code for "Java"
        System.out.println("Hashcode address of SCP object4: " + scpObject4.hashCode()); // Prints hash code for "Java"
        
        // s4 Identity hash codes (to distinguish the heap and SCP objects)
        System.out.println("IdentityHashCode of heap object4: " + System.identityHashCode(s4)); // heap object hash
        System.out.println("IdentityHashCode of SCP object4: " + System.identityHashCode(scpObject4)); // SCP object hash

    
        System.out.println("\n\n============== s5 memory address =======================\n");
        
        // s5 Print the string value of the objects
        System.out.println("String object (heap5): " + s5); // Prints "Java8"
        System.out.println("String object (SCP5): " + scpObject5); // Prints "Java8"

        // s5 Print the hash codes
        System.out.println("Hashcode address of string object5: " + s5.hashCode()); // Prints hash code for "Java8" 71346742
        System.out.println("Hashcode address of SCP object5: " + scpObject5.hashCode()); // Same as above, as both have the same value 71346742

        // s5 Identity hash codes (to distinguish the heap and SCP objects)
        System.out.println("IdentityHashCode of string object5: " + System.identityHashCode(s5)); // Heap object hash 1207769059
        System.out.println("IdentityHashCode of SCP object5: " + System.identityHashCode(scpObject5)); // SCP object hash 1207769059

        System.out.println("\n\n============== s6 memory address =======================\n");
        
        // s6 Print the string value of the objects
        System.out.println("String object (heap6): " + s6); // Prints "JAVA"
        System.out.println("String object (SCP6): " + scpObject6); // Prints "JAVA"

        // s6 Print the hash codes
        System.out.println("Hashcode address of string object6: " + s6.hashCode()); // Prints hash code for "JAVA" 2269730
        System.out.println("Hashcode address of SCP object6: " + scpObject6.hashCode()); // Same as above, as both have the same value 2269730

        // s6 Identity hash codes (to distinguish the heap and SCP objects)
        System.out.println("IdentityHashCode of string object6: " + System.identityHashCode(s6)); // Heap object hash 2094777811
        System.out.println("IdentityHashCode of SCP object6: " + System.identityHashCode(scpObject6)); // SCP object hash 2094777811

       
        System.out.println("\n\n============== s7 memory address =======================\n");
        
        // s7 Print the string value of the objects
        System.out.println("String object (heap7): " + s7); // Prints "JAVA" 2269730
        System.out.println("String object (SCP7): " + scpObject7); // Prints "JAVA" 2269730

        // s7 Print the hash codes
        System.out.println("Hashcode address of string object7: " + s7.hashCode()); // Prints hash code for "JAVA"  984213526
        System.out.println("Hashcode address of SCP object7: " + scpObject7.hashCode()); // Same as above, as both have the same value 2094777811

        // s7 Identity hash codes (to distinguish the heap and SCP objects)
        System.out.println("IdentityHashCode of string object7: " + System.identityHashCode(s7)); // Heap object hash
        System.out.println("IdentityHashCode of SCP object7: " + System.identityHashCode(scpObject7)); // SCP object hash

        System.out.println("\n\n============== s8 memory address =======================\n");
        
        // s8 Print the string value of the objects
        System.out.println("String object (heap8): " + s8); // Prints "JAVA"
        System.out.println("String object (SCP8): " + scpObject8); // Prints "JAVA"

        // s8 Print the hash codes
        System.out.println("Hashcode address of string object8: " + s8.hashCode()); // Prints hash code for "JAVA" 2269730
        System.out.println("Hashcode address of SCP object8: " + scpObject8.hashCode()); // Same as above, as both have the same value 2269730

        // s8 Identity hash codes (to distinguish the heap and SCP objects)
        System.out.println("IdentityHashCode of string object8: " + System.identityHashCode(s8)); // Heap object hash 2094777811
        System.out.println("IdentityHashCode of SCP object8: " + System.identityHashCode(scpObject8)); // SCP object hash 2094777811

        System.out.println("\n-----------------------------------\n\n");

      System.out.println( "s1==s2         : "+(s1==s2));//false
      System.out.println( "s1.equals(s2)  : "+(s1.equals(s2)));//true
	  System.out.println( "s3==s1         : "+(s3==s1));//true
	  System.out.println( "s1==s3         : "+(s1==s3));//true
	  System.out.println( "s3.equals(s1)  : "+(s3.equals(s1)));//true
	  System.out.println( "s1.equals(s3)  : "+(s1.equals(s3)));//true
	  System.out.println( "s1==s4         : "+(s1==s4));//false
	  System.out.println( "s1.equals(s6)  : "+(s1.equals(s6)));//false
	  System.out.println( "s1.equals(s2)  : "+(s1.equals(s2)));//true
	  System.out.println( "s4==s6         : "+(s4==s6));//false
	  System.out.println( "s4.equals(s6)  : "+(s4.equals(s6)));//false
	  System.out.println( "s6==s8         : "+(s6==s8));//true  

	  System.out.println( "s8.equals(s6)  : "+(s8.equals(s6)));//true
	  System.out.println( "s1.equals(s4)  : "+(s1.equals(s4)));//true
	  System.out.println( "s4.equals(s1)  : "+(s4.equals(s1)));//true
	  System.out.println( "s6.equals(s8)  : "+(s6.equals(s8)));//true
	  System.out.println( "s7==s6         : "+(s7==s6));//false
	  System.out.println( "s7.equals      : "+(s7.equals(s6)));//true
	  System.out.println( "s9==s8         : "+(s9==s8));//true
	  System.out.println( "s9.equals(s8)  : "+(s9.equals(s8)));//true
	  System.out.println( "s10==s6        : "+(s10==s6));//true
	  System.out.println( "s6.equals(s10) : "+(s6.equals(s10))); //true
    }
}