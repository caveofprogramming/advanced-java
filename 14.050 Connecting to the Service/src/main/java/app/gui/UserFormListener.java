package app.gui;

@FunctionalInterface
public interface UserFormListener {
	void formSubmitted(String author, String authorLabel);
}
