package exam;
import java.io.*;
public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    String str;
    str=Integer.toBinaryString(n);
     return "str";
  }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(toBinary(num));
  }
}
