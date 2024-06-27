import java.util.Scanner;
public class get_input_count {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter the number : ");
            int a =sc.nextInt();
            int arr[]=new int[a];
            System.out.println("Enter the " + a + " values " );
            for(int i=0;i<a;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
            for(int i=0;i<a;i++){
                count=count+1;
            }
            System.out.println("Count of the given number is : " + count);
        }       
    }

/* 
Output:
Enter the number : 5
Enter the 5 values  
1
2
3
5
4
Count of the given number is : 5   
*/