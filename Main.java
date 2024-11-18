import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(countProperContains("bada bada bada the badaboom the bobadabo baby", "bada"));
    System.out.println(countSub("gagagigo the risen", "ga"));
    System.out.println(deleteSub("gagagigo the giga Risen", "gig"));
  }

  public static int countSub(String word, String target)
  {
    int targetLength = target.length();
    int count = 0;
    for (int i = 0; i < word.length() - targetLength + 1; i++) {
      if (target.equals(word.substring(i, i + targetLength))) {
        count++;
      }
    }
    return count;
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
    while (word.indexOf(target) != -1) {
      int index = word.indexOf(target);
      word = word.substring(0, index) + word.substring(index + target.length());
    }
    return word;
  }
}
