public class Loops {

  //nHellos
public static void nHellos(int a){
  int num = a;
  for (int n = 1 ; n<=num ; n++){
    if (n==11||n==12||n==13){
      System.out.println(n+"th hello");
    }else if(n%10==1){
      System.out.println(n+"st hello");
    }else if(n%10==2){
      System.out.println(n+"nd hello");
    }else if(n%10==3){
      System.out.println(n+"rd hello");
    }else{
      System.out.println(n+"th hello");
    }
    
  }

}

public static void nRandoms(int length){
  double result = Math.random();
  System.out.println(result);
}
  public static void main(String[] args) {
    //nHellos(150);
    nRandoms(5);
  }
}