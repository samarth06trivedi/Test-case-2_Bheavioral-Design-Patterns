public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        CommandManager manager = new CommandManager();

        Command appendCommand1 = new AppendCommand(editor, "Hello ");
        Command appendCommand2 = new AppendCommand(editor, "World!");

        manager.executeCommand(appendCommand1);
        manager.executeCommand(appendCommand2);

        manager.undoLastCommand(); // Undo "World!"
    }
}
