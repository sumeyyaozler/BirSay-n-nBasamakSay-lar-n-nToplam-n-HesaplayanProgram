import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("please , enter number :");
      int number = input.nextInt();
      int basNumber=0,tempNumber=number;
      int basValue;
      int result =0;

      while(tempNumber !=0){
          tempNumber/=10;
          basNumber++;
      }
      tempNumber=number;
        while(tempNumber!=0){
            basValue=tempNumber%10;


            for (int i=1;i<=basNumber;i++){

            }
             result+=basValue;
            tempNumber/=10;

        }
        System.out.println(result);

     /*   int a=2451,basamakSayisi,numberCounter=0;

        while(a!=0){
            a/=10;
            numberCounter++;
        }
        int b=2451;
        int c =b%10;
        int sub=2,sup=5;
        int result =1;
        for(int i=1;i<=sup;i++);
        result*=sub;*/
    }
}

