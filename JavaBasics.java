import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //output in java 
        // System.out.println("Hello, World!");

        // print a pattern
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        //data types in java 
        // byte b = 1 ;
        // System.out.println(b);
        // int a = 10;
        // System.out.println(a);
        // float price = 1.1f;
        // System.out.println(price);
        // char ch = 'a';
        // System.out.println(ch);
        // boolean var = false;
        // System.out.println(var);

        //sum of a & b 
        // int a = 10;
        // int b = 5;
        // int sum = a+b;
        // System.out.println(sum);

        //input in java 
        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);
        
        // float price = sc.nextFloat();
        // System.out.println(price);

        //sum of 2 numbers (input from user)
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println(sum);


        //product a&b
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = a * b;
        // System.out.println(product);

        //area of a circle
        // float rad = sc.nextFloat();
        // float area = 3.14f * rad * rad;
        // System.out.println(area);


        //if else statement
        // System.out.println("enter your age :");
        // int age = sc.nextInt();
        

        // if(age >= 18){
        //     System.out.println("adult");
        // }

        // else if (age > 13 && age < 18) {
        //     System.out.println("teenager");
        // }

        // else{
        //     System.out.println("not adult");
        // }



        //largest or A AND B
        // System.out.println("enter your number:");
        // int A = sc.nextInt();
        // int B = sc.nextInt();

        // if (A >= B) {
        //     System.out.println("A is largest");

            
        // }else{
        //     System.out.println("B is largest");
        // }
        

        //ODD EVEN NUMBER FIND
        // System.out.println("Enter your number :");
        // int number = sc.nextInt();
        // if(number % 2 == 0){
        //     System.out.println("EVEN");
        // }else{
        //     System.out.println("ODD");
        // }

        //Income tax calculator

        // System.out.println("Enter your income:");
        // int income = sc.nextInt();
        // if (income <= 5) {
        //     System.out.println("0% TAX");
            
        // }else if (income > 5 && income < 10) {
        //     System.out.println("20% TAX");
        // }else{
        //     System.out.println("30% TAX");
        // }

        //ternary operator
        // int number = 4;
        // String type = ((number % 2) == 0)? "even": "odd";
        // System.out.println(type);


        //fail or pass check using ternary operator
        // System.out.println("Enter your marks:");
        // int marks = sc.nextInt();
        // String result = ((marks >= 33))? "pass": "fail";
        // System.out.println(result);


        //switch statement 
        // System.out.println("Enter your number :");
        // int number = sc.nextInt();

        // switch (number) {
        //     case 1 : System.out.println("hello");
                
        //         break;
        //     case 2 : System.out.println("hey");
        //         break;

        //     case 3 : System.out.println("namste");
        //         break;
        
        //     default: System.out.println("bye");
        //         break;
        // }

        //calculator prohram 
        // System.out.println("enter a:");
        // int a = sc.nextInt();
        // System.out.println("enter b:");
        // int b = sc.nextInt();
        // System.out.println("enter operator");
        // char operator = sc.next().charAt(0);

        // switch (operator) {
        //     case '+': System.out.println("answer is:" + a+b);
                
        //         break;

        //     case '-': System.out.println("answer is:" + (a-b));
                
        //         break;
        //     case '*': System.out.println("answer is:" + a*b);
                
        //         break;
        //     case '/': System.out.println("answer is:" + a/b);
                
        //         break;
        //     case '%': System.out.println("answer is:" + a%b);
                
        //         break;    
        //     default: System.out.println("wrong entry");;
        // }

        //While loop
        // int counter = 0;
        // while (counter < 100) {
        //     System.out.println("Hello World");
        //     counter++;
            
        // }

        // System.out.println("Print Hello World 100x");


        //Print number from 1 to 10
        // int counter = 1;
        // while (counter <= 10) {
        //     System.out.println(counter);
        //     counter++;
            
        // }

        //print number fron 1 to  n 
        // System.out.print("Enter uour range :");
        // int range = sc.nextInt();
        // int counter = 1;
        // while (counter <= range) {
        //     System.out.print(counter + " ");
        //     counter++;
        // }

        // System.out.println();

        //sum of n numbres 
        // System.out.print("Enter your natural number : ");
        // int n = sc.nextInt();
        // int sum = 0;

        // int i = 1;
        // while (i <= n) {
        //     sum += i;
        //     i++;
            
        // }

        // System.out.println("sum is : " + sum);

        // for loop example 
        // int i = 1;
        // for (int i = 1; i<=5; i++){
        //     System.out.println("Hello World!");
        // }

        //print square pattern 
        // for (int line = 1; line <=4; line++){
        //     System.out.println("****");
        // }


        // print reverse numaber 
        // System.out.print("Enter your Number :");
        // int n = sc.nextInt();

        // System.out.print("Reverse Number is :");
        // while (n > 0) {
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n = n / 10;
            
        // }

        // System.out.println();

        //Question break keyword

        // do {
        //     System.out.print("Enter your number : ");
        //     int n = sc.nextInt();

        //     if (n % 10 == 0 ) {
        //         break;
        //     }

        //     System.out.println(n);

        // } while (true);

        // System.out.println("Restart your program");

        //cotinue statement
        // for(int i = 1; i <= 5; i++ ){
        //     if (i == 3) {
        //         continue;
        //     }

        //     System.out.println(i);
        // }


        //prime or not 

        // int n = sc.nextInt();
        // if (n == 2) {
        //     System.out.println("n is prime");
            
        // }else{
        //     boolean isPrime = true;
        //     for(int i = 2 ; i<= Math.sqrt(n); i++) {
        //         if (n % i == 0) {
        //             isPrime = false;
        //         }
        //     }

        //     if (isPrime == true) {
        //         System.out.println("n is prime");

                
        //     }else{
        //         System.out.println("n is not prime ");
        //     }
        // }


        //print star pattern 
        // for(int line = 1; line <= 4; line++){
        //     for(int star = 1; star <= line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //print half pyramid
        // System.out.print("Enter Your Number : ");
        // int n = sc.nextInt();
        // for(int line = 1; line <= n; line++){
        //     for(int number = 1; number <= line; number++){
        //         System.out.print(number);
        //     }

        //     System.out.println();
        // }
        

    }
}
