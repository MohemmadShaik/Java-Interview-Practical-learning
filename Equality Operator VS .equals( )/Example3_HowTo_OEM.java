/* Example3 : Equality Operator (==) VS equals() : 
  Part3 :
  =====
   ==> Here we will cover the difference between equality operator ( == ) and equals() present in object class.
   ==> How to override equals() with proper implementation

*/
class Example3_HowTo_OEM {
    String progLang1; // data member

    public Example3_HowTo_OEM(String progLang1) {
        this.progLang1 = progLang1;
    }

    // override the equals()
    @Override
    public boolean equals(Object obj) {
        System.out.println("===========>Debugging<==============\n\n");
        System.out.println(" this contains : "+this.getClass());
        System.out.println(" obj contains : "+obj.getClass());
        System.out.println("===========>Debugging End<==============\n\n");
        /*
         * 1. check same instance or not
         * 2. check obj is null or not
         * 3. check both objects belongs to same class or not
         * 4. Logical comparison
         * ==> 4.1 typecast generic object to class object
         * ==> 4.2 return statement ==> check data member is not null and
         * datamember.equals(typecastedObj.datamember)
         */
        // 1. check same instance or not
        if (this == obj) {
            return true;
        }

        // 2. check obj is null or not
        if (obj == null) {
            return false;
        }

        // 3. check both objects belongs to same class or not
        if (getClass() != obj.getClass()) {
            return false;
        }

        /*
         * Key Note : Step 2 and Step3 can be written in single if statement :
         * if(obj==null || getClass() != obj.getClass()){
         * return false;
         * }
         * 
         */

        // 4. Logical comparison
        // ==> 4.1 typecast generic object to class object

        Example3_HowTo_OEM myProg = (Example3_HowTo_OEM) obj;

        // ==> 4.2 return statement(i.e check weather data member is not null and
        // datamember.equals(typecastedObj.datamember)

        return progLang1 != null && progLang1.equals(myProg.progLang1);

    }

    public static void main(String[] args) {

        //OEM (Override Equals Method)
        Example3_HowTo_OEM mpl1 = new Example3_HowTo_OEM("Java");
        Example3_HowTo_OEM mpl2 = new Example3_HowTo_OEM("Java");
         System.out.println("=========================================\n");
        // equality operator (==)
        System.out.println("equality operator (==) : " + (mpl1 == mpl2)); // false since diff object
        // System.out.println("equals() : "+(mpl1.equals(mpl2))); //false since equals()
        // not overridden 
        System.out.println("equals() : " + (mpl1.equals(mpl2))); // true since equals() is overridden and properly implemented                                                       
    }
}