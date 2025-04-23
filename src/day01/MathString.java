package day01;

public class MathString {
    public static void main(String[] args) {
        //String word= "Hello World";

        // primitive type disimpan stack memory, size memory lebih kecil
        int n =0;
        char ch ='A';
        boolean isGood=false;
        float f= 50_000_000;//5000000
        double d = 5.00;
        int i = 9;

        // reference object, heap memory, size memory lebih besar
        String word = "Hello World";
        Integer myInt;

        displayPrime(15);

    }

    //method void, tanpa return
    // method static akan disimpan distack memory
    public static void displayPrime(int n){
        for (int i = 2; i < n; i++) {
            if(isPrime(i)){
                System.out.printf(" %d ", i);
            }
        }
    }

    //method return
    public static boolean isPrime(int potentialPrime){
        for (int i = 2; i < potentialPrime ; i++) {
            if (potentialPrime % i ==0){
                return false;
            }
        }
        return true;
    }


}
