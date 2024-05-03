package memento;

public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content; //initialize the field with the value of the parameter
    }

    //getter since we need the value of this field later
    public String getContent() {
        return content;
    }
}
