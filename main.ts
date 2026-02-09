import { Card } from "./Card";
import { newRecentMistakesFirstSorter } from "./RecentMistakesFirstSorter";

const cards: Card[] = [
  new Card("Q1", false),
  new Card("Q2", true),
  new Card("Q3", false),
  new Card("Q4", true),
];

const organizer = newRecentMistakesFirstSorter();
const organizedCards = organizer.organize(cards);

for (const card of organizedCards) {
  console.log(card.question);
}