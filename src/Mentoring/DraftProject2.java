package Mentoring;

public class DraftProject2 {
    public static void main(String[] args) {
        int n = 6;

        int sumOfDivisors=0;
        for (int i = 1; i <n; i++) {
            if(n%i==0){
                sumOfDivisors=sumOfDivisors+i;
            }
        }

        if(n==sumOfDivisors){
            System.out.println(n+" is a perfect number");
        }else{
            System.out.println(n+ " is not a perfect number");
        }
    }
}
