import java.util.*;



public class Function {

    public static int Calculatesum(int num1, int num2){ //formal parametrs
        int sum = num1  + num2 ;
        return sum;
    }

    public static int Multiply(int a, int b){
        int Multiply = a * b;
        return Multiply;
    }

    public static int factorial(int n){
        int f = 1;

        for(int i = 1; i<=n; i++){
            f = f * i;
        }

        return f;
    }

    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n/(fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {

        System.out.println(binCoeff(5, 2));

        
        // int a = 3;
        // int b = 5;
        // int prod = Multiply(a, b);
        // System.out.println("a * b = " + prod);
        // prod = Multiply(10, 20);
        // System.out.println("a * b = " + prod);



        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // int sum = Calculatesum(a, b);
        // System.out.println("sum is : " + sum);
    }
}


// public class Function {
//     public static void printHello() {
//         System.out.println("Hello!!");
//         return;
//     }

//     public static void main(String[] args) {
//         printHello(); 
//     }
    
// }



