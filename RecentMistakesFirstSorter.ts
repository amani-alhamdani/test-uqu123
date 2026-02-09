import { Card } from "./Card";
import { CardOrganizer } from "./CardOrganizer";

export function newRecentMistakesFirstSorter(): CardOrganizer {
  return {
    organize(cards: Card[]): Card[] {

      const incorrect: Card[] = [];
      const correct: Card[] = [];

      for (const card of cards) {
        if (card.wasAnsweredCorrectlyLastRound()) {
          correct.push(card);
        } else {
          incorrect.push(card);
        }
      }

      return [...incorrect, ...correct];
    }
  };
}