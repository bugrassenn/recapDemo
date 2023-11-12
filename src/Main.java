public class Main {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 20;
        num2 = 30;
        num3 = 40;
        int maxNum = num1;

        if (maxNum < num2) {
            maxNum = num2;
        }

        if (maxNum < num3) {
            maxNum = num3;
        }

        System.out.println("Max Number : " + maxNum );

    }
}