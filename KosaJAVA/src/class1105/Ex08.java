package class1105;

public class Ex08 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0;i<=100;i++){
            sum +=i;
        }
        System.out.println("sum = " + sum);
        sum = 0;
        int i = 0;
        while (i<=100){
            sum +=i;
            i+=1;
        }
        System.out.println("sum = " + sum);
    }
}
