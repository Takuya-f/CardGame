
/**
 * @author fukamachi
 *
 */
public class Card {
	public String name;
	public int attack;
	public int defence;
		
	/**
	 * コンストラクタです
	 * @param name 名前
	 * @param attack 攻撃力
	 * @param defence 守備力
	 */
	public Card(String name, int attack, int defence){
		this.name = name;
		this.attack = attack;
		this.defence = defence;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
