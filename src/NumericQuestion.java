
public class NumericQuestion extends Question1 {
    private double numericAnswer;


    public void setAnswer(double correctResponse) {
        numericAnswer = correctResponse;
    }


    public void setAnswer(String correctResponse) {
        numericAnswer = Double.parseDouble(correctResponse);
    }


    @Override
    public boolean checkAnswer(String response) {
        double responseValue = Double.parseDouble(response);
        return Math.abs(responseValue - numericAnswer) <= 0.01;
    }
}
