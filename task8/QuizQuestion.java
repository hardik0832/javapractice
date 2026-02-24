import java.util.List;

public class QuizQuestion {

    private String question;
    private List<String> options;
    private int correctAnswerIndex;

    // Constructor
    public QuizQuestion(String question, List<String> options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    // Display question
    public void displayQuestion() {
        System.out.println("\n" + question);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    // Check answer
    public boolean isCorrect(int userAnswer) {
        return userAnswer - 1 == correctAnswerIndex;
    }
}
