public class MixString{
  public static String mix(String str1, String str2, String str3){
    String result = "";
    if(str1 == "" || str2 == "" || str3 == ""){
      return "Invalid"; 
    }
    int str1Length;
    if(str1.length()>=2){
      str1Length=(str1.length()+1)/2 ; 
    }else{
      str1Length=1;
    }
    for(int i = 0;i<str1Length;i++){
      result+=str1.charAt(i);
    }
    int str2Length;
    if(str2.length()>=2){
      str2Length=str2.length()-2; 
    }else{
      str2Length=0;
    }
    int k =0;
    while(k<3){
      for(int i = str2Length;i<str2.length();i++){
        result+=str2.charAt(i);
      }
      k++;
    }
    int str3Length;
    if(str3.length()>=2){
      str3Length=2; 
    }else{
      str3Length=1;
    }
    k =0;
    while(k<5){
      for(int i = 0;i<str3Length;i++){
        result+=str3.charAt(i);
      }
      k++;
    }

    return result;
  }

  public static void main(String[] args){
    System.out.println(mix("W","A","B"));
  }
}
