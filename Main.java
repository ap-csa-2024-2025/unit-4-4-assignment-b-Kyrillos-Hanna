import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(countProperContains("bada bada bada the badaboom the bobadabo baby", "bada"));
  }

  public static int countSub(String word, String target)
  {
    int targetLength = target.length();
    return 0;
  }

  public static int countProperContains(String word, String target)
  {
    int counter = 0;
    int targetLength = target.length();
    for (int i = 0; i < word.length() - targetLength + 1; i++) {
      String sub = word.substring(i, i+targetLength);
      int endOfTarget = i + target.length();
      boolean beginOrSpaceBefore = (i == 0 || word.substring(i - 1, i).equals(" "));
      boolean endOrSpaceAfter = (endOfTarget == word.length() || word.substring(endOfTarget, endOfTarget + 1).equals(" "));
      boolean properlyContained = beginOrSpaceBefore && endOrSpaceAfter;
      if(sub.equals(target) && properlyContained) {
        counter++;
      }
    }
    return counter;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
