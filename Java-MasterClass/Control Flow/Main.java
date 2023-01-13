public class Main {
    public static void main(String[] args) {
        int num = 5;
        int count = 0;

        while (num <= 20) {
            if (isEvenNumber(num)) {
                count++;
                System.out.println(num);
            }
            if (count >= 5) {
                break;
            }
            num += 1;
        }

    }
    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
