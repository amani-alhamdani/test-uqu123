export class Card {
  question: string;
  answeredCorrectlyLastRound: boolean;

  constructor(question: string, answeredCorrectlyLastRound: boolean) {
    this.question = question;
    this.answeredCorrectlyLastRound = answeredCorrectlyLastRound;
  }

  wasAnsweredCorrectlyLastRound(): boolean {
    return this.answeredCorrectlyLastRound;
  }
}