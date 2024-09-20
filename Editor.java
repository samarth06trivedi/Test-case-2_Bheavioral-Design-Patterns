// Editor.java
public class Editor {
    private StringBuilder text = new StringBuilder();

    public void append(String newText) {
        text.append(newText);
        System.out.println("Text: " + text);
    }

    public void deleteLast(int count) {
        text.delete(text.length() - count, text.length());
        System.out.println("Text: " + text);
    }

    public String getText() {
        return text.toString();
    }
}
