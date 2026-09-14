import java.util.*;
public class Arrays {
    public static void update(int marks[],int nonchangable){
        nonchangable=10;
       for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
       }
    }
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
       if(numbers[i]==key)
        return i;      
    }
    return -1;
    }
    public static int getLargest(int numbers[]){
        int largest= Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
          if(numbers[i]>largest)
            largest=numbers[i];
        if(smallest>numbers[i])
            smallest=numbers[i];
        
        }
        System.out.println("smallest = "+smallest);
        return largest;
    }
    public static int binarysearch(int numbers[],int key){
        int start=0,end=numbers.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return -1;
    }
    public static void reverse(int numbers[]){
        int first=0,last=numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void pairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = "+tp);
    }
    public static void subarrays(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays = "+ts);
    }
    public static void maxsumsubarray(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                   
                   currsum+=numbers[k];
                }
                 System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
               
            }
            
        }
        System.out.println("max sum = "+maxsum);
    }
    public static void maxsumsubarray1(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int [numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                
                
                   
                   currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                
                 System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
               
            }
            
        }
        System.out.println("max sum = "+maxsum);
    }
    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0,n=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0)
                n++;
        }
        if(n==numbers.length)
        {
            for(int i=0;i<numbers.length;i++)
            ms=Math.max(ms,numbers[i]);
        }
        else{
        for(int i=0;i<numbers.length;i++){
            cs+=numbers[i];
            if(cs<0)
                cs=0;
            ms=Math.max(cs,ms);
        }
    }
        System.out.print("max sub array sum is "+ms);
    }
    public static void main(String args[]){
        // int marks[]=new int[100];
      Scanner sc=new Scanner(System.in);
    //   marks[0]= sc.nextInt();
    //   marks[1]= sc.nextInt();
    //   marks[2]= sc.nextInt();
    //   System.out.println("phy = "+marks[0]);
    //   System.out.println("chem = "+marks[1]);
    //   System.out.println("math = "+marks[2]);
    //   int percentage=(marks[0]+marks[1]+marks[2])/3;
    //   System.out.println("percentage = "+percentage+"%");
    //   marks[2]=marks[2]+2;
    //   System.out.println("math = "+marks[2]);
    // System.out.println("length of array = "+marks.length);
    /*  int marks[]={97,98,99};
     int nonchangable=5;
     update(marks,nonchangable);
     System.out.println(nonchangable);
     for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+" ");
     }
    // linear search:
    int numbers[]={2,4,6,8,10,12,14,16};
    // int key=10;
    int index=linearsearch(numbers,20);
    if(index==-1)
        System.out.println("Not Found");
         else
        System.out.println("key is at the index = "+index);
    

// largest in array:
  int numbers[]={1,2,6,3,5};
   
   System.out.println("largest = "+getLargest(numbers));
//    binary search:
int numbers[]={2,4,6,8,10,12,14};
int key=10;
    System.out.println("key is at index = "+binarysearch(numbers,key));
    // reverse an array:

int numbers[]={2,4,5,6,8,69};
reverse(numbers);
for(int i=0;i<numbers.length;i++)
System.out.print(numbers[i]+" ");

// pairs in arrays:
 int numbers[]={2,4,6,8,10};
  pairs(numbers);

//   subarrays:
int numbers[]={2,4,6,8,10};
 subarrays(numbers);
//  max subarray (brute force):
int numbers[]={1,-2,6,-1,3};
maxsumsubarray1(numbers);
*/
// kadanes algo:
int n[]={-1,-2,-3,-4};
kadanes(n);







    }
}
