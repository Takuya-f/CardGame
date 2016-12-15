import java.util.ArrayList;

public class User {
	public String name;
	public ArrayList<Card> cards;

	public User(String name, ArrayList<Card> cards) {
		this.name = name;
		this.cards = cards;
	}

	/**
	 * 攻撃を行うためのメソッドです。
	 * @param defender 守備者のUserクラスのインスタンス
	 * @return 攻撃が成功したかどうか
	 */
	public boolean attack(User defender) {
//		int attackPoint = 0;
//		for(Card card : this.cards){
//			attackPoint += card.attack;
//		}
		if(cards instanceof CardList){
			int attackPoint = ((CardList) cards).getTotalAttackPoint();
		}
		int defendPoint = 0;
		for(Card card : defender.cards){
			defendPoint += card.defence;
		}
//		int attackPoint = this.cards.getTotalAttackPoint();
//		int defendPoint = this.cards.getTotalDefendPoint();

		int attackPoint = 0;
		System.out.println(attackPoint  + " vs " + defendPoint);

		if (attackPoint >= defendPoint) {
			return true;
		} else {
			return false;
		}
	}
}
