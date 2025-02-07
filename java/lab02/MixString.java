public class MixString{
  public static String mix(String str1, String str2, String str3){
    String result = "";
    if(str1 == "" || str2 == "" || str3 == ""){
      return "Invalid"; 
    }
    int str1Index;
    if(str1.length()>=2){
      str1Index=(str1.length()+1)/2 ; 
    }else{
      str1Index=1;
    }
    for(int i = 0;i<str1Index;i++){
      result+=str1.charAt(i);
    }
    int str2Index;
    if(str2.length()>=2){
      str2Index=str2.length()-2; 
    }else{
      str2Index=0;
    }
    int k =0;
    while(k<3){
      for(int i = str2Index;i<str2.length();i++){
        result+=str2.charAt(i);
      }
      k++;
    }
    int str3Index;
    if(str3.length()>=2){
      str3Index=2; 
    }else{
      str3Index=1;
    }
    k =0;
    while(k<5){
      for(int i = 0;i<str3Index;i++){
        result+=str3.charAt(i);
      }
      k++;
    }

    return result;
  }

  public static void main(String[] args){
    System.out.println(mix("Hello","How's","You"));
  }
}
