 import java.util.*;

public class Problems {
    public static boolean check(int[] a){
        int i,j;
        int n=a.length;
        
        for(i=0;i<n-1;i++){
        for(j=i+1;j<n;j++){
            if(a[i]==a[j]){
                return true;
            }
        }
        }
        return false;

    }
    public static int search(int b[],int target){
        int n=b.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(b[mid]==target)
                return mid;
            else if(b[l]<=b[mid]){
                if(target>=b[l] && target<=b[mid]){
                    h=mid;    
            }
            else
                l=mid+1;
        }
        else{
            if(target>=b[mid+1] && target<=b[h]){
                    l=mid+1;    
            }
            else
                h=mid;
        }
    }
    return -1;
}
//     public static void pal_n(int m){
//         int l,rev=0;
  
  
  
//   while(m>0){
//    l=m%10;
//    rev=rev*10+l;
//    m/=10;
//   }
//     }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       /* 1. int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("average is : "+ avg);

       2. int s = sc.nextInt();
        int Area = s*s;
        System.out.println("Area of square is "+Area);

       3. float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float items_price = pencil+pen+eraser;
        float tax = (items_price)*18/100;
        float total = items_price+tax;
        System.out.println("total bill : "+items_price);
        System.out.println("TOTAL BILL WITH TAX : "+total);

       4. byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d= 99.9954;
        double result = (f*b)+(i%c)-(d*s);
        System.out.println(result);*/

        // 5. int $ = 5;
        
        
        // operators:
        /* 1. int x = 2, y = 5;
        int exp1 = (x*y/x);
        int exp2 = (x*(y/x));
        System.out.println(exp1+" , ");
        System.out.println(exp2);

       2. int x=200,y=50,z=100;
        if ((x>y)&&(y>z)){
        System.out.println("Hello");
        }
        if ((z>y)&&(x>z)){
            System.out.println("Java");
        }
        if ((y+200)<x && (y+150)<z){
            System.out.println("Hello Java");
        }
       3. int x,y,z;
        x=y=z=2;
        x +=y;
        y -= z;
        z/= (x+y);
        System.out.println(x + " "+y+" "+z);
       4. int x = 9, y = 12;
        int a = 2 , b = 4, c = 6;
        int exp = 4/3 * (x+34) + 9*(a+b*c)+(3+y*(2+a))/(a+b*y);
        System.out.println(exp);

       5. int x = 10, y = 5;
        int exp1=(y*(x/y+x/y));
        int exp2=(y*x/y+y*x/y);
        System.out.println(exp1);
        System.out.println(exp2);

        // conditional:
        1. System.out.println("enter a number:");
        int number=sc.nextInt();
        if(number>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }

        2. double temp=103.5;
        if(temp>100){
            System.out.println("you have a fever");
        }
        else{
            System.out.println("you don't have a fever");
        }

        3. int number=9;
        switch(number){
            case 1: System.out.println("monday");
            break;
            case 2 : System.out.println("tuesday");
            break;
            case 3: System.out.println("wednesday");
            break;
            case 4 : System.out.println("thursday");
            break;
            case 5: System.out.println("friday");
            break;
            case 6 :System.out.println("saturday");
            break;
            case 7: System.out.println("sunday");
            break;
            default:System.out.println("invalid week number");

        }
       5. System.out.println("enter a year:");
        int year=sc.nextInt();
       boolean x = (year%4==0);
       boolean y= (year%100!=0);
       boolean z=((year%100==0)&&(year%400==0));
       if(x && y||z){
        System.out.println(year + " is a leap year");
       }
       else{
        System.out.println(year + " is not a leap year");
       }

    //    loops :
   2. int number;
    int choice;
    int evensum=0;
    int oddsum=0;
    do{
        number = sc.nextInt();
        if(number%2==0){
            evensum+=number;

        }
        else{
            oddsum+=number;
        }
        System.out.println("press 1 to continue or 0 to discontinue");
        choice=sc.nextInt();

    }while(choice==1);
    System.out.println("sum of the even numbers is "+evensum);
    System.out.println("sum of the odd numbers is "+oddsum);

    3.int fact=1;
    
    System.out.println("enter a number:");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
         fact*=i;
    }
    System.out.println(fact);

    4.int n=sc.nextInt();
    for(int i=1;i<=10;i++){
        System.out.println(n +"*"+i+"="+n*i);
    }
// pyramid
    int n= sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=n;j>=1;j--){
            if(i>=j)
            System.out.print("* ");
            else
            System.out.print(" ");
        }
        System.out.println("");
    }
    int i,j,count=1;
    int n= sc.nextInt();
    int m=sc.nextInt();
    
    for( i=n;i<=m;i++){
        for( j=1;j<=i;j++){
            if(i%j==0){
                count=0;
            }
            

        }
        if(count==1){
            System.out.println(i);

        }
    }

        // functions problems:
       1. System.out.println("enter first number");
        double x=sc.nextDouble();
        System.out.println("enter second number");
        double y=sc.nextDouble();
        System.out.println("enter third number");
        double z=sc.nextDouble();
        System.out.println("average of three numbers ="+ avg(x,y,z)+"\n");
  
    
  2. System.out.println("Enter any number :");
   int num=sc.nextInt();
   if(isEven(num)){
    System.out.println("EVEN");
   }
   else{
   System.out.println("ODD");
   }

  3. int m,l,rev=0;
  System.out.println("Enter any number:");
  int n=sc.nextInt();
  m=n;
  
  while(m>0){
   l=m%10;
   rev=rev*10+l;
   m/=10;
  }
  if(rev==n){
    System.out.println(n+" is palindrome number");
  }
  else{
    System.out.println(n+" is not palindrome number");
  }
 int l,sum=0;
 System.out.println("enter any number:");
 int n=sc.nextInt();
 int m=n;
 while(m>0){ 
    l=m%10;
    sum+=l;
     m/=10;
 }
 System.out.println("sum of the digits of "+n+" = "+sum);
 
// ARRAYS:
1.
int ar[]={1,1,1,3,3,4,3,2,4,2};
System.out.println(check(ar));
 */
int d[]={1};
System.out.println(search(d,0));








        

    }
    
}
