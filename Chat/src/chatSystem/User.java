package chatSystem;

public class User {
	private String username;
	private String password;
	private static int idCount = 0;
	private int id;
	private Chat chat;
	
	public User(String username, String password, Chat chat) {
		this.username = username;
		this.password = password;
		this.chat = chat;
		id = ++idCount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}
	
	public void sendMessage(String message) {
		chat.writeMessage(username + ": " + message);
	}
}
