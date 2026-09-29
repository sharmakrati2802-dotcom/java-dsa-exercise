package dsa_chat_gpt_question;

public class CountEvenAndOdd {
    public static void main(String []args){
    int [] x = {1,2,3,4,5};
    CountEvenAndOdd obj = new CountEvenAndOdd();
     obj.countEvenAndOdd(x);
    }

    public void countEvenAndOdd(int [] x){
        int countEven = 0;
        int countOdd =0;
        for(int i=0;i<x.length;i++){
           if(x[i]%2 ==0){
               countEven++;
           }
           else{
               countOdd++;
           }
        }
        System.out.println("CountEven:" + countEven);
        System.out.println("CountOdd:" + countOdd);
    }
}
