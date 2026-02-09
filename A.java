import java.util.ArrayList;
import java.util.List;

public class A {

    public static void main(String[] args) {

        List<Card> cards = new ArrayList<>();
        cards.add(new Card("Q1", false));
        cards.add(new Card("Q2", true));
        cards.add(new Card("Q3", false));
        cards.add(new Card("Q4", true));

        CardOrganizer organizer = new RecentMistakesFirstSorter();
        List<Card> organizedCards = organizer.organize(cards);

        for (Card card : organizedCards) {
            System.out.println(card.getQuestion());
        }
    }
}
