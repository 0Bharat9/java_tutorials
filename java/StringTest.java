public class StringTest{
  public static void main(String[] args){
    String s1 = "Sieze the day";
    int a = s1.indexOf("t");
    String s2 = s1.substring(9,12);
    System.out.println(s2);
    System.out.println(a);
    String poem = "As I was walking down the stair,\n"
    + "   I met a man who wasn't there.\n"
    + "He wasn't there again today.\n"
    + "   I wish, I wish he'd go away!";
    System.out.println(poem);

  }
}
