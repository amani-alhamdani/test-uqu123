import java.util.ArrayList;
import java.util.List;

public class RecentMistakesFirstSorter implements CardOrganizer {

    @Override
    public List<Card> organize(List<Card> cards) {

        List<Card> incorrect = new ArrayList<>();
        List<Card> correct = new ArrayList<>();

        for (Card card : cards) {
            if (card.wasAnsweredCorrectlyLastRound()) {
                correct.add(card);
            } else {
                incorrect.add(card);
            }
        }

        List<Card> result = new ArrayList<>();
        result.addAll(incorrect);
        result.addAll(correct);

        return result;
    }
}