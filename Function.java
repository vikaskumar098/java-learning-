import java.util.*;



public class Function {

    public static void Calculatesum(int num1, int num2){
        int sum = num1  + num2 ;
        System.out.println("sum is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        Calculatesum(a, b);
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



