public class MainChallenge {
    public static void main(String[] args) {
        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println(highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;

    }

