public class Task7{
  public static void main(String[] args){
    String a = isPerfectSquare(64);
    System.out.println(a);
  }

  public static String isPerfectSquare(int n) {
    boolean flag = false;
    if(n<0){
      return "Integer is not a Perfect Square";
    }else if(n==0){
      return "Integer 0 is a Perfect Square";
    }else{
      int i = 0;
      while(true){
        if(i*i==n){
          flag = true;
          break;
        }else if(i*i>n){
          break; 
        }else{
          i++;
        }
      }
      return flag ? "Integer "+n+" is a Perfect Square" : "Integer "+n+" is not a Perfect Square";
    }

  }
}
