package memento;

public class Editor{
    private String content;

    public EditorState createState() {
        return new EditorState(content);
        // editor will save the current state
        // inside the EditorState object and return it
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
