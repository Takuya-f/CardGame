import java.util.ArrayList;

public class CardList<E> extends ArrayList<E> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -977429705493126000L;

	public int getTotalAttackPoint(){
		int attack = 0;
		for(Object obj : this){
			if(obj instanceof Card){
				attack += ((Card) obj).attack;
			}
		}
		return attack;
	}
	
	public int getTotalDefendPoint(){
		int defend = 0;
		for(Object obj : this){
			if(obj instanceof Card){
				defend += ((Card) obj).defence;
			}
		}
		return defend;
	}
}
