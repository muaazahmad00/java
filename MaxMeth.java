public class MaxMeth {

    public static int Max(int x, int y) {

        if (x > y)
            return x;
        else
            return y;
    }

   public static void main(String[] args) {
       
    int a = 5;
    int b = 10;
    int m = 0;
    
    m = Max(a, b);       //Calling method

    System.out.println("Max = " + m);
   }
}