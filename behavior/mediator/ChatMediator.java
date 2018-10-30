package mediator;

public interface ChatMediator {
	public void sendMessage(String mgs, User user);
	
	void addUser(User user);
}
