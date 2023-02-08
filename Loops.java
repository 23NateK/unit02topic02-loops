//import java.util.Arrays;
public class Loops {

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
  result = Math.round(result*Math.pow(10, length))/Math.pow(10, length);
  System.out.println(result);
}

public static boolean isPrime(int integer){
  boolean bool = true;
  if(integer%2==0||integer%3==0||integer%5==0||integer%7==0){
    bool=false;
  }
  return bool;
}

public static int[] getFactors(int integer){
  int [] listnums = new int[0];
    for (int n = 1; n <= integer; n++){
      if (integer%n==0){
        int [] copyList = new int[listnums.length+1];
        for(int x = 0; x< listnums.length; x++){
          copyList[x] = listnums[x];
        }
        copyList[copyList.length-1] = n;
        listnums = copyList;
      }
    }
  return listnums;
}

public static void pepysSimulation(){
  int winc6=0;
  int winc12=0;
  for (int n=1;n<=6;n++){
    double roll = Math.round(Math.random()*7);
    if (roll==1.0);{
      winc6++;
    }
  }
  int minicount=0;
  for (int n=1;n<=12;n++){
    double roll = Math.round(Math.random()*7);
    if (roll==1.0){
      minicount++;
    }
    if (minicount==2){
      winc12++;
    }
  }
  if (winc6>winc12){
    System.out.println("6 rolls won");
  }else if(winc6<winc12){
    System.out.println("12 rolls won");
  }else{
    System.out.println("neither or both won");
  }
}

public static void montyHallSimulation(int n){
  int winsa=0;
for (int a=1;a<=n;a++){
  double correctans= Math.round(Math.random()*2+1);
  double guess = Math.round(Math.random()*2+1);
  double originalguess=guess;
  double removedoor=Math.round(Math.random()*2+1);;
  while(removedoor==correctans||removedoor==guess){
    removedoor=Math.round(Math.random()*2+1);
  }
  while(guess==removedoor||guess==originalguess){
    guess=Math.round(Math.random()*2+1);
  }
  if (guess==correctans){
    winsa++;
  }
}
System.out.println("Always Switch Wins: "+winsa);
int winsn=0;
for (int a=1;a<=n;a++){
  double correctans= Math.round(Math.random()*2+1);
  double guess = Math.round(Math.random()*2+1);
if (guess==correctans){
  winsn++;
  }
}
System.out.println("Never Switch Wins: "+winsn);
}




  public static void main(String[] args) {
    //nHellos(150);
    //nRandoms(10);
    //System.out.println(isPrime(59));
    //System.out.println(Arrays.toString(getFactors(24)));
    //pepysSimulation();
    montyHallSimulation(5);
  }
}