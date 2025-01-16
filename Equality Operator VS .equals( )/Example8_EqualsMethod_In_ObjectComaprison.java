public class Example8_EqualsMethod_In_ObjectComaprison {
    public static void main(String[] args) {
        objectComparison(); // object comparison
        //stringComparison(); // string comparison
    }

    public static void objectComparison() {
        // object comparison
        System.out.println("Object Comparison : ");
        System.out.println("=====================================\n");
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj1;
        System.out.println(obj1); //java.lang.Object@372f7a8d
        System.out.println(obj2); //java.lang.Object@85ede7b
        System.out.println(obj3); //java.lang.Object@372f7a8d
        
        System.out.println("obj1 == obj2 : " + (obj1 == obj2)); // false since it compares references address which are different
        //Q) How to find the reference address of an object to confirm two objects are pointing to the same reference or different?
        
        //object hashcode()
        System.out.println("Ref address of obj1 hashcode : "+obj1.hashCode());//925858445
        System.out.println("Ref address of obj2 hashcode : "+obj2.hashCode());//798154996
        System.out.println("Ref address of obj3 hashcode : "+obj3.hashCode());//925858445
        
        //object identity hashcode()
        System.out.println("Ref address of obj1 identity hashcode : "+System.identityHashCode(obj1));//925858445
        System.out.println("Ref address of obj2 identity hashcode : "+System.identityHashCode(obj2));//798154996
        System.out.println("Ref address of obj3 identity hashcode : "+System.identityHashCode(obj3));//925858445
        
        System.out.println("obj1.equals(obj2) : " + obj1.equals(obj2)); // false since it compares references similar to == operator
        System.out.println("obj1 == obj3 : " + (obj1 == obj3)); // true since it compares references
        System.out.println("obj1.equals(obj3) : " + obj1.equals(obj3)); // true since it compares references similar to == operator 
    }
    
}
