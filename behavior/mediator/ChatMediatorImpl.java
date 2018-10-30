package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> mUserList;
	
	public ChatMediatorImpl(){
		mUserList=new ArrayList<>();
	}

	@Override
	public void sendMessage(String mgs, User user) {
		for (User u : mUserList) {
			if	(u != user) {
				u.receive(mgs);
			}
		}
	}

	@Override
	public void addUser(User user) {
		mUserList.add(user);
		
	}
}
