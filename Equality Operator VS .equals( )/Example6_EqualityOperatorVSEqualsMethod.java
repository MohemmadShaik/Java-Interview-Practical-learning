/* String comparison done in detail by checking the reference address available 
   in heap memory with String Constant Pool(SCP) logical address.
   
   Q) How to get the SCP logical address?

       Eg : String s1 = new String("Java");
            String my_scp_addr = s1.intern();
            System.out.println("s1 identity hashcode : "+System.identityHashCode(s1)); //heap memory reference address
            System.out.println("my_scp_addr identity hashcode : "+System.identityHashCode(my_scp_addr)); //SCP logical address; */
 class Example6_EqualityOperatorVSEqualsMethod {
    public static void main(String args[]) {

        String s1 = new String("Java"); // Creates a heap object
        String scpobj1 = s1.intern();
        String s2 = new String("Java"); // Creates a heap object
        String s3 = s1; // Creates a heap object
        String s4 = "Java";
        String scpobj2 = s4.intern();
        String s5 = "JAVA";
        String s6 = "Java";
        String s7 = "JAVA";

        System.out.println("\n\n===================s4 details ========================\n");
        System.out.println(s4);//Java
        System.out.println(scpobj2);//Java
        System.out.println("                  s4 hashcode  : "+(s4.hashCode()));
        System.out.println("          s4 scpobj2 hashcode  : "+(scpobj2.hashCode()));
        System.out.println("         s4 identity hashcode  : "+(System.identityHashCode(s4)));
        System.out.println("  s4 scpobj2 identity hashcode : "+(System.identityHashCode(scpobj2)));
        
        System.out.println("\n\n===================s1 details ========================\n");
        System.out.println(s1);//Java
        System.out.println(scpobj1);//Java
        System.out.println("                  s1 hashcode  : "+(s1.hashCode()));
        System.out.println("          s1 scpobj1 hashcode  : "+(scpobj1.hashCode()));
        System.out.println("         s1 identity hashcode  : "+(System.identityHashCode(s1)));
        System.out.println("  s1 scpobj1 identity hashcode : "+(System.identityHashCode(scpobj1)));


      //String comparison of equality operator ("==") VS equals()
        System.out.println("s1==s2         1: " +(s1 == s2));//false
        System.out.println("s2.equals(s1)1.1: " +(s2.equals(s1)));//true
        System.out.println("s3==s1         2: " +(s3 == s1));//true
        System.out.println("s1==s3         3: " +(s1 == s3));//true
        System.out.println("s3.equals(s1)  4: " +(s3.equals(s1)));//true
        System.out.println("s1.equals(s3)  5: " +(s1.equals(s3)));//true
        System.out.println("s1==s4         6: " +(s1 == s4));//false
        System.out.println("s1.equals(s4)  7: " +(s1.equals(s4)));//true
        System.out.println("s5==s6         8: " +(s5 == s6));//false
        System.out.println("s5.equals(s6)  9: " +(s5.equals(s6)));//false
        System.out.println("s5==s7        10: " +(s5 == s7)); //true
        System.out.println("s5.equals(s7) 11: " +(s5.equals(s7))); //true
    }
}