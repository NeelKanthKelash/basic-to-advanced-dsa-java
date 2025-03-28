package com.projects.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Card {
    static String[] suits = {"spades", "hearts", "diamonds", "clubs"};
    static String[] values = {null, null, "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    
    int value;
    int suit;

    public Card(int v, int s) {
        this.value = v;
        this.suit = s;
    }

    public boolean lessThan(Card c2) {
        if (this.value < c2.value) {
            return true;
        }
        if (this.value == c2.value) {
            return this.suit < c2.suit;
        }
        return false;
    }

    public boolean greaterThan(Card c2) {
        if (this.value > c2.value) {
            return true;
        }
        if (this.value == c2.value) {
            return this.suit > c2.suit;
        }
        return false;
    }

    @Override
    public String toString() {
        return values[this.value] + " of " + suits[this.suit];
    }
}

class Deck {
    ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (int i = 2; i <= 14; i++) {
            for (int j = 0; j < 4; j++) {
                cards.add(new Card(i, j));
            }
        }
        Collections.shuffle(cards);
    }

    public Card rmCard() {
        if (cards.size() == 0) {
            return null;
        }
        return cards.remove(cards.size() - 1);
    }
}

class Player {
    String name;
    int wins;
    Card card;

    public Player(String name) {
        this.name = name;
        this.wins = 0;
    }
}

class Game {
    Deck deck;
    Player p1, p2;

    @SuppressWarnings("resource")
	public Game() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("p1 name: ");
        String name1 = scanner.nextLine();
        System.out.print("p2 name: ");
        String name2 = scanner.nextLine();
        
        deck = new Deck();
        p1 = new Player(name1);
        p2 = new Player(name2);
    }

    public void wins(String winner) {
        System.out.println(winner + " wins this round");
    }

    public void draw(String p1n, Card p1c, String p2n, Card p2c) {
        System.out.println(p1n + " drew " + p1c + " " + p2n + " drew " + p2c);
    }

    public void playGame() {
        System.out.println("Beginning War!");
		try (Scanner scanner = new Scanner(System.in)) {
			while (deck.cards.size() >= 2) {
			    System.out.print("q to quit. Any key to play: ");
			    String response = scanner.nextLine();
			    if (response.equals("q")) {
			        break;
			    }
			    
			    Card p1c = deck.rmCard();
			    Card p2c = deck.rmCard();
			    
			    draw(p1.name, p1c, p2.name, p2c);
			    
			    if (p1c.greaterThan(p2c)) {
			        p1.wins++;
			        wins(p1.name);
			    } else {
			        p2.wins++;
			        wins(p2.name);
			    }
			}
		}
        
        String winner = winner(p1, p2);
        System.out.println("War is over. " + winner + " wins");
    }

    public String winner(Player p1, Player p2) {
        if (p1.wins > p2.wins) {
            return p1.name;
        } else if (p1.wins < p2.wins) {
            return p2.name;
        } else {
            return "It was a tie!";
        }
    }
}

public class CardGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
    }
}
