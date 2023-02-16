import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scannerString = new Scanner(System.in);

        while (true) {
            System.out.println("Write a String for the List");
            String userScanned = scannerString.nextLine();

            switch (userScanned) {
                case "size":
                    System.out.println("The list size is: " + list.size());
                    break;
                case "clear":
                    list.clear();
                    System.out.println("The list was cleared");
                    break;
                case "print":
                    System.out.println(list);
                    break;
                default:
                    System.out.println("Adding to the list");
                    list.add(userScanned);
            }
        }
    }
}
