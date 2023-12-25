package courseWork;

import java.util.Map;

class Paragraph {
    String id;
    String text;

    Map<String, String> options;

    public Paragraph(String id, String text, Map<String, String> options) {
        this.id = id;
        this.text = text;
        this.options = options;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}