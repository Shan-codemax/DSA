
import java.math.BigInteger;
import java.util.Scanner;
 class Weordalgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.nextLine());
        sc.close();

        StringBuilder sb = new StringBuilder();
        BigInteger one = BigInteger.ONE;
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");

        while (true) {
            sb.append(n).append(" ");
            if (n.equals(one)) break;

            if (n.mod(two).equals(BigInteger.ZERO)) {
                n = n.divide(two); // n is even
            } else {
                n = n.multiply(three).add(one); // n is odd
            }
        }

        System.out.println(sb.toString().trim());
    }
}