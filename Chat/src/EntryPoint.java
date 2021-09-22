import chatSystem.Chat;
import chatSystem.User;

public class EntryPoint {
	public static void main(String[] args) {
		Chat chat = new Chat();
		
		chat.signUp("Fedor", "Qq12345678");
		chat.signUp("Grisha", "Banan228");
		
		User user1 = chat.signIn("Fedor", "Qq12345678");
		User user2 = chat.signIn("Grisha", "Banan228");
		
		user1.sendMessage("Hello");
		user2.sendMessage("Hi!");
	}
}
