import java.util.Scanner;

public class ch7
{
    Scanner in = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.println(indexOfMax(new int[]{-1, -2, -2, -2}));
        System.out.println(indexOfMax(new int[]{}));
        
        System.out.println("sieve of 50:");
        for (int i = 0; i < sieve(50).length; i++)
        {
            if (sieve(50)[i]) System.out.println("" + i + " is prime");
            else System.out.println("" + i + " is composite");
        }
         
        System.out.println(areFactors(2, new int[] {2, 4, 6, 16}));        
        System.out.println(areFactors(2, new int[] {2, 4, 7, 16}));       
        System.out.println(areFactors(1, new int[] {}));     
        System.out.println(areFactors(0, new int[] {}));
    }
    
    public static int indexOfMax(int[] arr)
    {
        if (arr.length > 0)
        {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] > max) max = arr[i];
            }
            return max;
        } else return 0;
    }
    
    public static boolean[] sieve(int n)
    {
        boolean[] ans = new boolean[n];
        for (int i = 0; i < n; i++)
        {
            ans[i] = true;
            for (int i2 = 2; i2 < i; i2++)
            {
                if (i2 != i && i % i2 == 0)
                {
                    ans[i] = false;
                    break;
                }
            }
        }
        return ans;
    }
    
    public static boolean areFactors(int n, int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (n != 0 && nums[i]%n != 0) return false;
        }
     
        if (nums.length == 0) return false;   
        return true;
    }
    
    public static boolean arePrimeFactors(int n, int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
        }
     
        return false;
    }
}

