import  java.util.Scanner;
public class HCF_lcm {
    public static void main(String[] args) {
        int temp1, temp2, num1, num2, temp, hcf, lcm;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Soogali numberka kowaad: ");
        num1 = scanner.nextInt();
        System.out.print("Soo gali numberka labaad : ");
        num2 = scanner.nextInt();
        scanner.close();
        temp1 = num1;
        temp2 = num2;
        while(temp2 != 0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }
        hcf = temp1;
        lcm = (num1*num2)/hcf;
        System.out.println("HCF of input numbers: "+hcf);
        System.out.println("LCM of input numbers: "+lcm);
    }
}
