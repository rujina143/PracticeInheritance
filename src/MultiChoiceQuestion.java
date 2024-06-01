
import java.util.HashSet;
import java.util.Set;

public class MultiChoiceQuestion extends Question {
    private Set<String> correctChoices;

    public MultiChoiceQuestion(String text) {
        super(text);
        correctChoices = new HashSet<>();
    }

    public void addCorrectChoice(String choice) {
        correctChoices.add(choice.toLowerCase()); // Store choices in lowercase for case-insensitive comparison
    }

    @Override
    public void display() {
        System.out.println(getText());
        System.out.println("Provide all correct choices separated by spaces.");
    }

    @Override
    public boolean checkAnswer(String response) {
        String[] userChoices = response.toLowerCase().split("\\s+");
        Set<String> userSet = new HashSet<>();
        for (String choice : userChoices) {
            userSet.add(choice);
        }
        return userSet.equals(correctChoices);
    }
}

