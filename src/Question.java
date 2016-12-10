import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kuryakov on 10-Dec-16.
 */
public class Question {
    private String question;
    private int countAnswers;
    private List<String> variants = new ArrayList<>();
    private int correctNumber;

    public void printQuestion() {
        System.out.println(this.question);
        System.out.println("Варианты ответа :");
        for (String variant : variants) {
            System.out.println(variant);
        }
        System.out.println("Уважаемые знатоки, ваш ответ?");
    }

    public Question() {
    }

    public String getQuestion() {

        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getCountAnswers() {
        return countAnswers;
    }

    public void setCountAnswers(int countAnswers) {
        this.countAnswers = countAnswers;
    }

    public List<String> getVariants() {
        return variants;
    }

    public void setVariants(List<String> variants) {
        this.variants = variants;
    }

    public int getCorrectNumber() {
        return correctNumber;
    }

    public void setCorrectNumber(int correctNumber) {
        this.correctNumber = correctNumber;
    }

    public Question(String question, int countAnswers, List<String> variants, int correctNumber) {
        this.question = question;
        this.countAnswers = countAnswers;
        this.variants = variants;
        this.correctNumber = correctNumber;
    }
}
