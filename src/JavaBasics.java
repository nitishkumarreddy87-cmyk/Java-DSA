import java.util.*;

public class JavaBasics {
    // public static void swap(int a,int b){ //(public static is access modifier)
    //              int temp;
    //              temp=a;
    //              a=b;
    //              b=temp;
    //              System.out.println(a);
    //              System.out.println(b);
    // }
    // public static int cal(int x,int y)parameters (or) formal parameters{
    //     int sum = x+y;
    //     return sum;
    // }
    // public static void printhelloworld(){
    //     System.out.println("hello world");
    //     System.out.println("nitish reddy");
    //     System.out.println("virat kohli");
    // }
    // func to cal sum of 2:
    /*public static int sum(int a,int b){
        return a+b;
    }
    // func to cal sum of 3:
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    // func sum of 2 int:
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
}
public static boolean isprime(int n){
    boolean isprime=true;
    // corner case:
    if(n==2){
        return true;
    }
    // Math.sqrt() for optimised version
    for(int i=2;i<=n-1;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
public static void primesinrange(int n){
    for(int i=2;i<=n;i++){
        if(isprime(i)){
            System.out.print(i+" ");
        }
  }
}
// binary to decimal:
public static void bintodec(int bin){
    int dec=0,lastd,pow=0,n;
       n=bin;
    while(n>0){
        lastd=n%10;
        dec =dec +(lastd*(int)Math.pow(2,pow));
        pow++;
        n/=10;
    }
    System.out.println("decimal of "+bin+" is "+dec);
}
public static void dectobin(int dec){
    int bin=0,pow=0,rem,n;
    n=dec;
    while(n>0){
        rem=n%2;
        bin+=(rem*Math.pow(10,pow));
        pow++;
        n/=2;
    }
    System.out.println("binary of "+dec+" is "+bin);
}*/
    public static void main(String args[]) {
         

        /*
 Operators:
 unary*/
        // int x=10;
        // int y=++x;
        // System.out.println(x);
        // System.out.println(y);

        
        /*int x=10;
        int y=x++;
        System.out.println(x);
        System.out.println(y);*/

        // Relational:
        /*
         int A=10;
         int B=10;
         System.out.println((A==B));
         System.out.println((A!=B));
         System.out.println((A>B));
         System.out.println((A<B));
         System.out.println((A>=B));
         System.out.println((A<=B));
         */

        //  logical operators:
        /*  System.out.println((3>2) && (5>0));
            System.out.println((3>2) || (0>5));
            System.out.println(!(3>2));
        */

        // Assignment operators:
        // int A = 10;
        // A = A+10;
       /*  A+=10;
           A-=5;
           A*=5;
           A/=5;
           A%=5;
       */
         
        // System.out.println(A);

        // if else:
        /*int a=10;
        int b=5;
        if(a>=b){
            System.out.println("a is greatest");
        } else { 
            System.out.println("b is greatest");
        }
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }*/
        // else if:
        /*int age=13;
        if(age>=18){
            System.out.println("Adult");           
        } else if((age >=13) && (age < 18)){
            System.out.println("teenager");
        }else {
            System.out.println("not adult");
        }
        // income tax calculator:
        int income = sc.nextInt();
        int tax = 0;
        if(income<500000){        
           tax = 0;
        }else if((income>=500000) && (income<1000000)){
            tax = (int) (income*0.2);
        }else{
            tax = (int)(income *0.3);}
            System.out.println("your tax is : "+tax);

            int A=1,B=8,C=3;
            if((A>C)&&(A>B)){
                System.out.println(A);
            }
            else if ((B>C)){
                System.out.println(B);
            }
            else{
                System.out.println(C);
            }
            // ternary operators :
            int number=4;
            String Ans=(number%2==0)?"EVEN":"ODD";
            System.out.println(Ans);
            // pass or fail:
            int marks=45;
            String result=(marks>=33)?"pass":"fail";
            System.out.println(result);

            // switch statement: we can use char also
            int number=4;
            switch(number){
                case 1 : System.out.println("samosa");
                break;
                case 2 : System.out.println("burger");
                break;
                case 3 : System.out.println("mango shake");
                break;
                default: System.out.println("noice dream");

            }


            // calculator:
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a:");
            int a = sc.nextInt();
            System.out.println("Enter b:");
            int b = sc.nextInt();
            System.out.println("Enter operator:");
            char operator=sc.next().charAt(0);
            switch(operator){
                case '+': System.out.println(a+b);
                break;
                case '-': System.out.println(a-b);
                break;
                case '*': System.out.println(a*b);
                break;
                case '/': System.out.println(a/b);
                break;
                case '%': System.out.println(a%b);
                break;
                default: System.out.println("Wrong operator");
            }

            // while loop:
            int counter=0;
            // while(counter<100) make sure its not an infinite loop
            {
                System.out.println(counter +" hello world");
                counter++;
            }

            int i=1;
            while(i<=10){
                System.out.print(i+" ");
                i++;
            }
            System.out.println();

            int i=1;
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            while(i<=n){
                System.out.print(i);
                i++;
            }

            int i=1,sum=0;
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            while(i<=n){
                sum+=i;
                i++;
            }
            System.out.print(sum);

            // for loop: dry run
            for(int i=1;i<=4;i++){
                System.out.println("****");
            }
            int n=312510;
            while(n>0){
                int a = n%10;
                 System.out.print(a);

                 n=n/10;


            }
            System.out.println();
            int rev=0;

            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number:");
            int n=sc.nextInt();
            while(n>0){
                int lastdigit=n%10;
                 rev=rev*10+lastdigit;
                 n/=10;

            }
            System.out.println(rev);

            // do while loop:
            int i=0;
            do {
                System.out.println("nitish");
                i++;
               }while(i<=10);
            //    break statement : to exit the loop
            for(int i=1;i<=5;i++){
                if(i==4){
                    break;
                }
                System.out.println(i);
            }
            System.out.println("i am out of the loop");
            int i;
            for(i=1;i<=1000;i++){
                if(i%10==0){
                    break;
                }
                else
                System.out.println(i);

            }
            Scanner sc = new Scanner(System.in);

            do{
                int n=sc.nextInt();
                if(n%10==0){
                    break;
                }
                System.out.println(n);
            }while(true);

            // continue statement:
            for(int i=1;i<=5;i++){
                if(i==3){
                    continue;

                }
                System.out.println(i);
            }

            // prime or not:
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();

            if(n==2){
                System.out.println("n is prime");
            }
            else{
                boolean isprime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime=false;
                }
                

                if(isprime==true){
                    System.out.println("n is prime");
                }
                else{
                    System.out.println("n is not prime");
                }
            }

            }

            // patterns:
            // star pattern:
            for(int i=1;i<=5;i++){
                for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // inverted star pattern:
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.println();
        }
        // character pattern:
        char ch='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
            // reverse star:
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                // System.out.print("*"); space after star gives u pyramid;
            }
            System.out.println();
        }
    //    hollow rectangle:
        for(int i=1;i<=4;i++){
            for(int j=1;j<=6;j++){
                if(i==1||i==4||j==1||j==6){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println();
            
        }

        // Functions:block of code/reusable
        // syntax:
        returntype name(){
            // body
            return statement;
        }
        // printhelloworld();
        // public static int print(){    int statement
        //     System.out.println("blah blah ");
        //     return 1; compulsory if its not void(empty set)
        // }
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int sum = cal(a,b);arguments (or) actual parameters
        System.out.println("sum is: "+sum);*/

        // java always calls by value:
        // call by value 
        // int a=5;
        // int b=10;
        // swap(a,b);
        // System.out.println(a); calls by valueee
        // System.out.println(b);

        // product of a & b:
        /*public static int multiply(int a,int b){
         * int prod = a*b;
         * return prod;
        } */
    //    factorial:
    /*public static int factorial(int n){
     * int f =1;
     * for(int i =1;i<=n;i++){
     *    f*=i;
     * }
     * return f;// factorial of n
     * 
    } */

    // binomial coefficient:
    /* public static int bincoef(int n,int r){
              int num_n = factorial(n);
              int num_r = factorial(r);
              int num_nmr = factorial(n-r);
              bincoeff=num_n/(num_r*num_nmr);
              System.out.println(bincoeff); 
       }
     

    //  function overloading depends on parameters:
    System.out.println(sum(31,25));
    System.out.println(sum(25,31,5));
    // function overloading using datatypes:
    System.out.println(sum(4,2));
    System.out.println(sum(2.0f,3.5f));
    // prime:
    System.out.println(isprime(4));

    // primes in range:
    primesinrange(20);

    // bin to dec:
    bintodec(1011);

    // dec to bin:
    dectobin(10);

    // method scope : 
     variable after declaration in the line of code can be used before it causes error
     (or) it can be used only in one function block

    //  block scope:
    variable declared in this { } than it cam only  be used in curly braces
    example (for loop)
    


    // patterns advance:
    // hollow rectangle:
    System.out.println("enter number of rows:");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
        
    }
//    inverted and rotated hald pyramid:
System.out.println("enter number of rows:");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            
                System.out.print(" ");
        }
        for(int j=1;j<=i;j++){ 
                System.out.print("*");
        }
        
            System.out.println();
        
    }
//    inverted half pyramid:
System.out.println("enter number of rows:");
    int n=sc.nextInt();
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            
                
                System.out.print(j);
                
        }
        
            System.out.println();
        
    }
//    floyds triangle pattern:
System.out.println("enter number of rows:");
    int n=sc.nextInt();
    int k=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            
                
                System.out.print(k+" ");
                k++;
        }
        
            System.out.println();
        
    }
//    0-1 triangle pattern:
System.out.println("enter number of rows:");
    int n=sc.nextInt();
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            
                if((i+j)%2==0)
                System.out.print("1");
                else
                    System.out.print("0");
        }
        
            System.out.println();
        
    }
//    butterfly pattern:
System.out.println("enter number of rows:");
    int n=sc.nextInt();
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
              System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
              System.out.print("*");
        }
        
            System.out.println();
        
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
              System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
              System.out.print("*");
        }
        
            System.out.println();
        
    }
//    solid rhombus pattern:
System.out.println("enter number of rows:");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            
                System.out.print(" ");
        }
        for(int j=1;j<=n;j++){ 
                System.out.print("*");
        }
        
            System.out.println();
        
    }
//    hollow rhombus:
   System.out.println("enter number of rows:");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            
                System.out.print(" ");
        }
        for(int j=1;j<=n;j++){ 
            if(i==1||i==n||j==1||j==n)
                System.out.print("*");
            else
                 System.out.print(" ");

        }
        
            System.out.println();
        
    }
//    diamonds pattern:
System.out.println("enter number of rows:");
    int n=sc.nextInt();
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            
                System.out.print(" ");
        }
        for(int j=1;j<=(2*i-1);j++){ 
                System.out.print("*");
        }
        
            System.out.println();
        
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            
                System.out.print(" ");
        }
        for(int j=1;j<=(2*i-1);j++){ 
                System.out.print("*");
        }
        
            System.out.println();
        
    }
//    palindrome pattern:
int i,j,n=5;
for(i=1;i<=n;i++){
    for(j=1;j<=n-i;j++)
        System.out.print(" ");
    for(j=1;j<=i;j++)
        System.out.print(j);

    for(j=i-1;j>=1;j--)
        System.out.print(j);
    System.out.println();
}
// triangle
int i,j,n=5,num=1;
for(i=1;i<=n;i++){
    for(j=1;j<=n-i;j++)
    System.out.print("\t");
for(j=1;j<=i;j++)
{
    System.out.print(num+"\t\t");
    num++;
}
System.out.println();
}
// triangle full:
int i,j,n=5;
for(i=1;i<=n;i++){
    for(j=1;j<=n-i;j++)
        System.out.print(" ");
    for(j=1;j<=(2*i-1);j++){
        System.out.print("*");
    }
    System.out.println();
}
// triangle hollow:
int i,j,n=5;
for(i=1;i<=n;i++){
    for(j=1;j<=n-i;j++)
        System.out.print(" ");
    for(j=1;j<=(2*i-1);j++){
        if(i==1||i==n||j==1||j==(2*i-1))
        System.out.print("*");
    else
         System.out.print(" ");
    }
    System.out.println();
}*/




















            




            
        





    }
}
//boilerplate code

