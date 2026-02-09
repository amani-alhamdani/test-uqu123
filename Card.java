public class Card {

    private String question;
    private boolean answeredCorrectlyLastRound;

    public Card(String question, boolean answeredCorrectlyLastRound) {
        this.question = question;
        this.answeredCorrectlyLastRound = answeredCorrectlyLastRound;
    }

    public boolean wasAnsweredCorrectlyLastRound() {
        return answeredCorrectlyLastRound;
    }

    public String getQuestion() {
        return question;
    }
}
