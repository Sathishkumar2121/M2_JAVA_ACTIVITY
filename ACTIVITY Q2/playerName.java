import java.util.*;

class playerName {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String stringF = sc.nextLine();
        String stringL = sc.nextLine();
        String stringO = stringF.substring(0, 1).toUpperCase() + stringF.substring(1);
        System.out.println(stringO + " " + stringL.toUpperCase());
        sc.close();

    }
}
