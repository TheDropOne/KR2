import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Kuryakov on 10-Dec-16.
 */
public class Runner {
    private static List<Question> questions = new ArrayList<>();

    public static void main(String[] args) {
        Пользователь я = new Пользователь("Аноним", "Анонимный", 2, 8);
        questions = readQuestionsFromFile(new File("test.txt"));
        for (Question question : questions) {
            System.out.println("Внимание, вопрос :");
            question.printQuestion();
            Scanner scanner = new Scanner(System.in);
            int yourVariant = scanner.nextInt();
            if (yourVariant == question.getCorrectNumber()) {
                System.out.println("Правильно, умник!");
            } else {
                System.out.println("Неправильно, дурак!");
            }
        }
    }

    private static List<Question> readQuestionsFromFile(File file) {
        List<Question> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (br.ready()) {
                Question tempQuestion = new Question();
                tempQuestion.setQuestion(br.readLine());
                tempQuestion.setCountAnswers(Integer.parseInt(br.readLine()));
                List<String> tempVariantsList = new ArrayList<>();
                for (int i = 0; i < tempQuestion.getCountAnswers(); i++) {
                    tempVariantsList.add(br.readLine());
                }
                tempQuestion.setVariants(tempVariantsList);
                tempQuestion.setCorrectNumber(Integer.parseInt(br.readLine()));

                list.add(tempQuestion);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}


