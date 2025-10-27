import java.util.Scanner;

public class ch7
{
    Scanner in = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.println(indexOfMax(new int[]{-1, -2, -2, -2}));
        System.out.println(indexOfMax(new int[]{}));
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
}

