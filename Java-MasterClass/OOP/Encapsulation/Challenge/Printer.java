package Encapsulation.Challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > 100 || tonerLevel < 0 ? -1 : tonerLevel);
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount > 100 || tempAmount < 0) {
            return -1;
        } else {
            tonerLevel = tempAmount;
            return tonerLevel;
        }
    }

    public int printPages(int pages) {
//        if (duplex) {
//            pagesPrinted += Math.ceil(pages / 2.0);
//            System.out.println("This is a duplex printer");
//        } else {
//            pagesPrinted += pages;
//            System.out.printf("Printing %d pages", pages);
//        }
        int jobPages = duplex ? (int) Math.ceil((pages / 2.0)) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
