public class Main {
    public static void main(String[] args) {

        QuizManager quiz = new QuizManager();

        // Adding Questions
        quiz.addQuestion(new Question(
                "What is Java?",
                new String[]{"Programming Language", "Operating System", "Browser", "Game"},
                'A'
        ));

        quiz.addQuestion(new Question(
                "Which keyword is used for inheritance?",
                new String[]{"this", "super", "extends", "implements"},
                'C'
        ));

        quiz.addQuestion(new Question(
                "Which is not a data type?",
                new String[]{"int", "float", "string", "boolean"},
                'C'
        ));

        quiz.addQuestion(new Question(
                "Which company developed Java?",
                new String[]{"Microsoft", "Apple", "Sun Microsystems", "Google"},
                'C'
        ));

        quiz.addQuestion(new Question(
                "Which method is entry point?",
                new String[]{"start()", "run()", "main()", "init()"},
                'C'
        ));

        // Start Quiz
        quiz.startQuiz();
    }
}