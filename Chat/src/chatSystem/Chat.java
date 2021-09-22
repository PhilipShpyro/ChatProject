package chatSystem;

import java.util.Map;
import java.util.HashMap;

public class Chat {
	Map<String, User> users;
	private Content content;
	
	public Chat() {
		users = new HashMap<>();
		content = new Content();
	}
	
	private boolean userExists(String username) {
		return users.containsKey(username);
	}
	
	public boolean signUp(String username, String password) {
		if(userExists(username))
			return false;
		users.put(username, new User(username, password, this));
		return true;
	}
	
	public User signIn(String username, String password) {
		if(userExists(username)) {
			User user = users.get(username);
			return user.getPassword() == password ? user : null;
		}
		return null;
	}
	
	void writeMessage(String message) {
		content.addMessage(message);
	}
}
