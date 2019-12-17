package domain.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 트럼프 카드 전체 생성을 담당하는 객체
 */
public class CardFactory {
	public static int cardSize;
	private static List<Card> deck = CardFactory.create();
	
    public static List<Card> create() {
        List<Card> cards = new ArrayList<>();
        Symbol[] symbols = Symbol.values();
        for (Symbol symbol : symbols) {
            createByType(cards, symbol);
        }
        cardSize = cards.size();
        return Collections.unmodifiableList(cards);
    }

    private static void createByType(List<Card> cards, Symbol symbol) {
        Type[] types = Type.values();
        for (Type type : types) {
            cards.add(new Card(symbol, type));
        }
    }
    
    public static List<Card> getDeck() {
    	return deck;
    }
}
