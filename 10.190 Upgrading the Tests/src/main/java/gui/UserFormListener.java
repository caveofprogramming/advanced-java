package gui;

@FunctionalInterface
public interface UserFormListener {
	void formSubmitted(String username, String password);
}
