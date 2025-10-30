import java.util.Scanner;

public class ch7
{
    Scanner in = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        //System.out.println(indexOfMax(new int[]{-1, -2, 5, -2}));
        //System.out.println(indexOfMax(new int[]{}));
        
        System.out.println("sieve of 120:");
        for (int i = 0; i < sieve(120).length; i++)
        {
            if (sieve(120)[i]) System.out.println("" + i + " is prime");
            else System.out.println("" + i + " is NOT PRIME " + randomName());
        }
         
        /*System.out.println(areFactors(2, new int[] {2, 4, 6, 16}));        
        System.out.println(areFactors(2, new int[] {2, 4, 7, 16}));       
        System.out.println(areFactors(1, new int[] {}));     
        System.out.println(areFactors(0, new int[] {}));*/
        
        //System.out.println(arePrimeFactors(6, new int[] {3, 2}));
        //System.out.println(arePrimeFactors(2, new int[] {3, 2}));
        //System.out.println(arePrimeFactors(60, new int[] {30, 2}));
        //System.out.println(arePrimeFactors(60, new int[] {5, 2, 3, 2, 1}));
        
        //System.out.println(arePrimeFactors(1, new int[] {1, 1}));
        //System.out.println(arePrimeFactors(0, new int[] {0, 1}));
    }
    
    public static int indexOfMax(int[] arr)
    {
        int max = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max) max = i;
        }
        return max;
    }
    
    public static boolean[] sieve(int n)
    {
        boolean[] ans = new boolean[n];
        for (int i = 2; i < n; i++)
        {
            ans[i] = true;
            for (int i2 = 2; i2 < i; i2++)
            {
                if (i % i2 == 0)
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
        boolean[] numsp = sieve(n+1);
        int prod = 1;
        
        for (int i = 0; i < nums.length; i++)
        {
            if (numsp[nums[i]] == false) return false;
            System.out.println("hi " + nums[i] + numsp[nums[i]]);
            prod *= nums[i];
        }
        
        System.out.println("number: " + n + " product: " + prod);
        return (prod == n);
    }
    
    public static String randomName()
    {
        String vowels = "aeiouy";
        String consonants = "qwrtypsdfghjklzxcvbnm";
        String name = "";
        
        int c = (int) (Math.random()*20) + 1;
        name += consonants.substring(c, c+1).toUpperCase();
        
        int v = (int) (Math.random()*5) + 1;
        name += vowels.substring(v, v+1);
        
        c = (int) (Math.random()*20) + 1;
        name += consonants.substring(c, c+1);
        
        c = (int) (Math.random()*20) + 1;
        name += consonants.substring(c, c+1);
        
        v = (int) (Math.random()*5) + 1;
        name += vowels.substring(v, v+1);
        
        c = (int) (Math.random()*20) + 1;
        name += consonants.substring(c, c+1);
        
        return name;
    }
}

