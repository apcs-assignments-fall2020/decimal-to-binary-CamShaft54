import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) {
        String[] binArr = binary.split("");
        int result = 0;
        for (int i = 0; i < binArr.length; i++)
            result += (int) Math.pow(2, binArr.length-1-i) * Integer.parseInt(binArr[i]);
        return result;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number in binary format:");
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(scan.next()));
        scan.close();
    }
}
