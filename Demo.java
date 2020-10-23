import java.util.Arrays;
import java.util.Random;
public class Demo {
  public static void printLoop(int n)
  {
    for(int i = 1; i <= n; i++)
      {
        for(int j = 0; j <= n-i; j++)
          System.out.print(i);
        System.out.println();
      }
  }

  public static String arrToString(int[] arr)
    {
      String n = String.valueOf(arr[0]);
      for (int i = 1; i < arr.length; i++)
        n += ", " + String.valueOf(arr[i]);
      return n;
    }

  public static String arrayDeepToString(int[][] arr2)
    {
      String allarrays = "";
      for (int i = 0; i < arr2.length; i++)
        {
          allarrays += "{";
              for (int j = 0; j < arr2[0].length; j++)
              {
                if (j == arr2[0].length-1)
                  allarrays += String.valueOf(arr2[i][j]);
                else
                  allarrays += String.valueOf(arr2[i][j]) + ", ";
              }

          allarrays += "}";
          if (i < arr2.length-1)
            allarrays += ", ";
        }
      return allarrays;
    }

  public static int[][] create2DArray(int rows, int cols, int maxValue)
    {
      Random rand = new Random();
      int[][] newarray = new int[cols][rows];
      for (int i = 0; i < cols; i++)
        {
          for (int j = 0; j < newarray[i].length; j++)
            newarray[i][j] = rand.nextInt(maxValue);
        }

      String testing = "";
      for (int i = 0; i < cols; i++)
      {
        testing += "{";
        for (int j = 0; j < newarray[i].length; j++)
          {
            if (j == newarray[i].length-1)
              testing += newarray[i][j];
            else
              testing += newarray[i][j] + ", ";
          }
        testing += "}";
        if (i < newarray.length-1)
          testing += ",\n";
      }
      System.out.println(testing);
      return newarray;
    }

  public static void main(String[] args)
    {
      if(args.length == 0)
        {printLoop(5);}
      else
        {printLoop(Integer.parseInt(args[0]));}
/*Tests:
      int[] testarr = new int[] {3, 4, 5};
      arrToString(testarr);

      int[][] w = new int[][] { {1,2,3}, {4,5,6} };
      int[][] h = new int[][] { {4,90,3}, {-9,4,7} };
      arrayDeepToString(w);
      arrayDeepToString(h);
      create2DArray(3,6,5);
      create2DArray(6,3,100);
*/
      }
}
