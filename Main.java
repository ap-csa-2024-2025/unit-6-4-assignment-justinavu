import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String[] kyr = {"yourmom", "mom", "mom", "dad", "none", "dad"};
    System.out.println(countLength(kyr, 3));
    double[] roo = {5, 3, 4, 1};
    System.out.println(indexOf(roo, 4));
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0;
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i].length() == targetLength)
      {
        count++;
      }
    }
    return count;
  }

  public static int indexOf(double[] arr, double target)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == target)
      {
        return i;
      }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    // replace with your code
    return false;
  }

  public static String findMode(String[] arr)
  {
    // replace with your code
    return null;
  }
}
