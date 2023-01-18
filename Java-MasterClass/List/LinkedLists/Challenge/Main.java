package LinkedLists.Challenge;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    record Town(String name, int distance) {
        @Override
        public String toString() {
            return String.format("%s %d", name, distance);
        }
    }
    public static void main(String[] args) {
        LinkedList<Town> towns = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        boolean flag = true;

        Town Adelaide = new Town("Adelaide", 1374);
        addTown(towns, Adelaide);
        addTown(towns, new Town("Brisbane", 917));
        addTown(towns, new Town("Perth", 3923));
        addTown(towns, new Town("Alice Springs", 2771));
        addTown(towns, new Town("Darwin", 3972));
        addTown(towns, new Town("Melbourne", 877));
        addTown(towns, new Town("Sydney", 0));

        boolean forward = true;
        var iterator = towns.listIterator();

        printMenu();

        while (flag) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }
            System.out.print("Enter Value: ");
            String menuItem = s.nextLine().toUpperCase().substring(0, 1);
            switch (menuItem) {
                case "F":
                    if (!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    if (forward) {
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println(towns);
                    break;
                case "M":
                    printMenu();
                    break;
                default:
                    flag = false;
                    break;
            }
        }

    }

    public static void addTown(LinkedList<Town> towns, Town town) {
        if (towns.contains(town)) {
            System.out.println("ALREADY IN LIST");
            return;
        }
        for (Town p : towns) {
            if (p.name().equalsIgnoreCase(town.name())) {
                System.out.println("Found duoplicate: " + town);
                return;
            }
        }
        int matchedIndex = 0;
        for (var listPlace : towns) {
            if (town.distance() < listPlace.distance()) {
                towns.add(matchedIndex, town);
                return;
            }
            matchedIndex++;
        }
        towns.add(town);
        System.out.println(towns);
    }

    private static void printMenu() {
        System.out.println("Available actions (select word or letter): " +
                "\n(F)orward" +
                "\n(B)ackward" +
                "\n(L)ist Places" +
                "\n(M)enu" +
                "\n(Q)uit");
    }
}
