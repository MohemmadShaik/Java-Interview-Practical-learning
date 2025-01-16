public class Example10_EqualityOperator_in_PrimitiveTypeComparison {
    public static void main(String[] args) {
        //Primitive type comparison
        System.out.println(100 == 50); //false
        System.out.println('y' == 'z'); //false
        System.out.println('d' == 100); //true since AscII value of char 'd' is 100
        System.out.println(true == false); //false
    }
}
