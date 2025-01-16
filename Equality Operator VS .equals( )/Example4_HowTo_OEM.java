//Example 4 : Difference between == and equals() method in java
//Part4 :
class Example4_HowTo_OEM{
	String name;
	
	public Example4_HowTo_OEM(String name){
		//name = name;
		/* ambiguity or shadowing problem because the java compiler don't 
		    know which one is data member and which one is the method argument.
			To solve that we use the 'this' keyword prifix to the data member.
		*/
		
		this.name = name;
		
	}
	
	 /* Proper implementation of equals():
	     1. instance reference are same or different?
		 2. Object should not be null?
		 3. two objects belongs to the same class or not?
		 4. Logical comparison
		 4.1 typecast the generic object to our class name
		 4.2 return statement : datamember should not be null and 
		                        datamember.equals(typecast_obj.datamember)
	 */
	
     @Override
	 public boolean equals(Object obj){
         System.out.println("this contains : "+this);
         System.out.println("obj contains : "+obj);
		 //1.instance reference are same or different?
		 if(this == obj){
            System.out.println("Same instance!");
			 return true;
		 }
		 
		 //2. check obj is null or not
		 if(obj == null){
			 return false;
		 }
		 
		 //3. both objects belongs to same or different clas
		 if(getClass() != obj.getClass()){
			 return false;
		 }
		 
		 //4. Logical comparison
		 
		 //4.1 typecast the obj to our class name
		 Example4_HowTo_OEM eskills = (Example4_HowTo_OEM) obj;
		
		 return name != null && name.equals(eskills.name);
		 /* 4.2 return statement =  datamember should not be null and 
		 datamember.equals(typecast_obj.datamember) */
		  /* if(obj instanceof ProgLang){
            ProgLang other = (ProgLang) obj;
            return lang != null && lang.equals(other.lang);
        } */
		 
	 }
	
	public static void main(String[] args){
		Example4_HowTo_OEM  es1 = new Example4_HowTo_OEM("Java");
		Example4_HowTo_OEM  es2 = new Example4_HowTo_OEM("Java");
		
		//true since equals() is overridden with proper implementation
		System.out.println("equals() : "+(es1.equals(es2)));
		// equality operator (==)
		System.out.println("Using == : "+(es1==es2)); //false
	}
}