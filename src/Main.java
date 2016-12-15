import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Card> attackDekki = new CardList<Card>();
		attackDekki.add(new Card("Yuriko", 2500, 2000));
		attackDekki.add(new Card("Haruka", 1000, 4000));
		attackDekki.add(new RareCard("HogeHoge", 2000, 1000, "Super Strong!"));
		ArrayList<Card> defendCards = new ArrayList<Card>();
		defendCards.add(new Card("Momoko", 3000, 2000));
		defendCards.add(new Card("Yukiho", 2000, 3000));

		User attacker = new User("Taro", attackDekki);
		for (int i = 0; i < attacker.cards.size(); i++) {
			Card card = attacker.cards.get(i);
			System.out.println(card.getName());
		}
		for (Card card : attackDekki) {
			if(card instanceof RareCard){
				System.out.println(((RareCard) card).text);
			}else{
				System.out.println(card.name + " is normal.");
			}
		}

		User defender = new User("Jiro", defendCards);
		for (Card card : defender.cards) {
			System.out.println(card.getName());
		}

		boolean result = attacker.attack(defender);
		if (result) {
			System.out.println(attacker.name + " win");
		} else {
			System.out.println(defender.name + " win");
		}

	}

}
