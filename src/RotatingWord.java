import java.util.*;

public class RotatingWord
{
  public static String rotate(String Word, int num)
{
    int length = Word.length();
    String a = Word.substring(0,(length-num));
    String b = Word.substring((length-num),length);
    String c = b + a;
    return c;
}


public static void main(String[] args)
{
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a word:");
  String Word = input.nextLine();
  System.out.print("Enter a number:");
  int Number =input.nextInt();
  String finalWord = rotate(Word, Number);
  System.out.println("Your word rotated by you number is: "+ finalWord);
 }
}