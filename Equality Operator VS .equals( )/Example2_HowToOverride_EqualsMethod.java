//Example2 : How to override equals() with proper implementation in Java
//Part2 :
class Example2_HowToOverride_EqualsMethod{
	String lang;
	
	public Example2_HowToOverride_EqualsMethod(String lang){
		this.lang = lang;
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
    
    //Override equals() method
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true; //Same reference
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

         // Logical comparison
         Example2_HowToOverride_EqualsMethod other = (Example2_HowToOverride_EqualsMethod) obj;
         return lang != null && lang.equals(other.lang);
        /* if(obj instanceof ProgLang){
            ProgLang other = (ProgLang) obj;
            return lang != null && lang.equals(other.lang);
        } */
    }

    
	
	public static void main(String[] args){
		
		Example2_HowToOverride_EqualsMethod pl1 = new Example2_HowToOverride_EqualsMethod("Java");
		Example2_HowToOverride_EqualsMethod pl2 = new Example2_HowToOverride_EqualsMethod("Java");
		System.out.println("class name (pl1):"+pl1.getClass());
		System.out.println("class name (pl2):"+pl2.getClass());
		System.out.println("Equality operator (==) : " +(pl1==pl2)); //false
		//Before overriding equals()
		System.out.println(".equals() method : "+(pl1.equals(pl2))); //false because equals() is not overridden
		//After overriding equals()()
		System.out.println(".equals() method : "+(pl1.equals(pl2))); //true because equals() is overridden with proper implementation.
		
	}
}