package domain.user;

/**
 * 게임 딜러를 의미하는 객체
 */
public class Dealer extends User {
    // TODO 추가 기능 구현
	
	public Name getName() {
		return new Name("딜러");
	}
	
	public String getFirstCardResult() {
    	return cards.getFirstCard();
    }
}
