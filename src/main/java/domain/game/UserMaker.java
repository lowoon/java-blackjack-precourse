package domain.game;

import java.util.ArrayList;
import java.util.List;

import domain.user.BettingMoney;
import domain.user.Dealer;
import domain.user.Name;
import domain.user.Player;
import domain.user.User;
import domain.view.ViewInput;

public class UserMaker {
	private List<Name> playerNameList;
	
	public UserMaker(List<Name> playerNameList) {
		this.playerNameList = playerNameList;
	}
	
	public List<User> makeUserList() {
		ViewInput viewInput = new ViewInput();
		List<User> userList = new ArrayList<User>();
		Dealer dealer = new Dealer();
		userList.add(dealer);
		
		for (Name name : playerNameList) {
			BettingMoney bettingMoney = viewInput.getBettingPrice(name);
			Player player = new Player(name, bettingMoney);
			
			userList.add(player);
		}
		System.out.println();
		
		return userList;
	}
}
