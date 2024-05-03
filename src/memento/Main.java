package memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop()); //undo. prints b - hey editor, restore yourself with this state
//        editor.restore(history.pop()); //undo again. prints c.


        System.out.println(editor.getContent()); //prints b

    }
}
