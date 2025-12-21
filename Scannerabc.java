import java.util.* ;
class Scannerabc {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int age ;
        String Name ;
        Name = sc.nextLine();
        age = sc.nextInt();
        double bweight = sc.nextDouble();
        System.out.println("Name = "+ Name);
        System.out.println("Age = "+ age);
        System.out.println("Body Weight = "+ bweight);
        sc.close();

    }
}
