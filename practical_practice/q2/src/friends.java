import java.sql.SQLOutput;
import java.util.*;
public class friends {
    public static void main(String[] args) {
        int n,m,amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        n = sc.nextInt();
        System.out.println("Enter how many no of items B cant eat: ");
        m = sc.nextInt();
        System.out.println("Enter price of each item present: ");
        int sum = 0;
        int [] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
            sum += arr1[i];
        }
        System.out.println("Enter price of items which B cant eat: ");
        int sum2 = 0;
        int [] arr2 = new int[m];
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
            sum2 += arr2[i];
        }
        System.out.println("Enter amount payed by B: ");
        amount = sc.nextInt();
        if((sum - sum2) >= amount){
            System.out.println("NO ISSUE!");
        } else{
            System.out.println("Extra Shared Payed By B : " + (amount - (sum - sum2)));
        }

    }
}

