package chatSystem;

import java.util.ArrayList;
import java.util.List;

public class Content {
	List<String> messages;
	
	Content() {
		messages = new ArrayList();
	}
	
	public void addMessage(String message) {
		System.out.println(message);
		messages.add(message);
	}
}
