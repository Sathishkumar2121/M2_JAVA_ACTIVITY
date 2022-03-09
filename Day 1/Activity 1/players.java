import java.util.*;

class players {
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        String Player1 = "";
        String Player2 = "";

        String fname = "";
        String lname = "";
        String lname1 = "";
        String lname2 = "";

        String str, str1;

        int space;
        int i = 0;
        int j = 0;

        while (i < 2) {

            while (j == i) {
                str = scan.nextLine();

                space = str.indexOf(" ");
                fname = str.substring(0, space);

                str1 = str.toLowerCase();
                lname = str.substring(space);

                str1 = lname.toLowerCase();
                j++;

            }
            if (i == 0) {
                Player1 = fname;
                lname1 = lname;
            }

            else if (i == 1) {
                Player2 = fname;
                lname2 = lname;
            }

            i++;
        }

        if (lname1.equals(lname2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}