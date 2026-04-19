import java.util.ArrayList;
import java.util.Scanner;

public class QuizManager {
    private ArrayList<Question> questions;
    private int score;

    public QuizManager() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public void startQuiz() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            q.displayQuestion();

            System.out.print("Enter your answer (A/B/C/D): ");
            char answer = sc.next().charAt(0);

            if (q.checkAnswer(answer)) {
                System.out.println("Correct ✅");
                score++;
            } else {
                System.out.println("Wrong ❌");
            }
        }

        showResult();
    }

    private void showResult() {
        System.out.println("\n===== RESULT =====");
        System.out.println("Score: " + score + "/" + questions.size());

        if (score == questions.size()) {
            System.out.println("Excellent! 🎉");
        } else if (score >= questions.size() / 2) {
            System.out.println("Good Job 👍");
        } else {
            System.out.println("Keep Practicing 💪");
        }
    }
}