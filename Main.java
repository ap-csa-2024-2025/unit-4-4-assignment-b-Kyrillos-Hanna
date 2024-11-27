import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input word: ");
    String input1 = sc.nextLine();
    System.out.println("Input target: ");
    String input2 = sc.nextLine();
    System.out.println("The substring " + input2 + " appears " + countSub(input1, input2) + " times.");

    System.out.println("Input word: ");
    String input3 = sc.nextLine();
    System.out.println("Input target: ");
    String input4 = sc.nextLine();  
    System.out.println("The substring " + input4 + " is properly contained " + countProperContains(input3, input4) + " times.");

    System.out.println("Input word: ");
    String input5 = sc.nextLine();
    System.out.println("Input target: ");
    String input6 = sc.nextLine();   
    System.out.println("New String "); 
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
