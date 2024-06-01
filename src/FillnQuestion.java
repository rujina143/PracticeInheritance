
public class FillnQuestion extends Question {

    public FillInQuestion(String text) {
        super(text);
    }

    @Override
    public void display() {
        String formattedText = getText().replaceAll("_([^_]*)_", "_____");
        System.out.println(formattedText);
    }

    @Override
    public boolean checkAnswer(String response) {
        String[] parts = getText().split("_");
        if (parts.length < 3) {
            // Malformed question, cannot extract answer
            return false;
        }
        String answer = parts[1].trim(); // Extract the answer between underscores
        return response.equalsIgnoreCase(answer);
    }
}

