public class PalindromeNumber{
  public static String isPalindrome(int n){
    int reversed = 0;
    int number = n;
    while(n>0){
      reversed = reversed*10 + n%10;
      n = n/10;
    }
    return number == reversed ? "Integer "+number+" is Palindrome" : "Integer "+number+" is NOT Palindrome";
  }
  public static void main(String[] args){
    System.out.println(isPalindrome(0));
    System.out.println(isPalindrome(10));
    System.out.println(isPalindrome(3635363));
    System.out.println(isPalindrome(121121));
    System.out.println(isPalindrome(112545214));
  }
}
