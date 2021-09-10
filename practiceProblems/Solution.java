import java.util.*;
 class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int count = 0;

        while(n != 0){
            int num = sc.nextInt();
            if(num % k == 0){
                count++;
            }
            n--;
        }
        System.out.print(count);
    }
}