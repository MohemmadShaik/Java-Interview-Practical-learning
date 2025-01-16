/* Using getClass() :
   At runtime when we don't know about the return type of an
   object which we are passing to a method in that case we 
   can use a object class method (i.e getClass() method).
   
   And to compare our input object with a specific type 
   (i.e Integer, Long, Float, String, etc) we can use the
   instanceof keyword in java.*/

public class Example1_FindReturnType_At_RuntimeProgram{

    public static void checkObjectType(Object input) {
        
        if(input instanceof Integer){
            //instanceof is a keyword in Java that is used to test if an object is of a specified type.
            System.out.println(input+" is an Integer type.");
        }
        else if(input instanceof Long){
            System.out.println(input+" is a Long type.");
        }
        else if(input instanceof Float){
            System.out.println(input+" is a Float type.");
        }
        else if(input instanceof String){
            System.out.println(input+" is a String type.");
        }
        /* else if(input instanceof Double){
            System.out.println(input+" is a Double type.");
        } */
        else{
            System.out.println(input+" is of "+input.getClass().getName()+" type....");
            System.out.println(input+" is of "+input.getClass().getTypeName()+" type.");
        }

    }
    public static void main(String[] args) {
        checkObjectType(131); //int
        checkObjectType(210L); //long
        checkObjectType(11.5f); //float
        checkObjectType("coding is my passion"); //String
        checkObjectType(6.2d); //double
    }
}

