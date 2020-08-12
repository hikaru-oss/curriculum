public class Task1_5 {

 public static void main(String[] args) {

  String[] fluits = {"みかん","りんご","ぶどう","メロン"};

 for (int i = 0; i < fluits.length; i++) {
     
     System.out.println(fluits[i]);


 }
 //1から100に到達するまで出力する
 int i = 1;
 while(i <= 100) {
     System.out.print(i);
     i++;
 }
 System.out.println();

   
   

   for(int k = 1; k <= 9; k++) {
       System.out.print(k + "||");
     for(int j = 1; j <= 9; j++) {
       
       System.out.print( (k * j) + "|" + "");
     }
     System.out.println("");
  }
 } 
}