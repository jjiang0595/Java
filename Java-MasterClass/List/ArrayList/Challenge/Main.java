package ArrayList.Challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> itemList = new ArrayList<>();


        boolean flag = true;
        while (flag) {
            System.out.println("Available actions: " +
                    "\n0 - to shutdown" +
                    "\n1 - to add item(s) to list (comma delimited list)" +
                    "\n2 - to remove any items (comma delimited list)" +
                    "\nEnter a new number for which action you want to do.");
            switch (Integer.parseInt(s.nextLine())) {
                case 1 -> addItems(itemList);
                case 2 -> removeItems(itemList);
                default -> flag = false;
            }
            itemList.sort(Comparator.naturalOrder());
            System.out.println("CURRENT LIST: " + itemList);
        }
    }

    public static void addItems(ArrayList<String> groceries) {
        String[] items = s.nextLine().split(",");
        groceries.addAll(List.of(items));

        for (String i : groceries) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    public static void removeItems(ArrayList<String> groceries) {
        String[] items = s.nextLine().split(",");
        groceries.removeAll(List.of(items));

        for (String i : groceries) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }
}
