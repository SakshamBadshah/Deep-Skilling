import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.swing.text.PlainDocument;

abstract class WordFactory extends DocumentBuilderFactory {

    @SuppressWarnings("unused")
    Document createDocument() {

        return new PlainDocument();
    }
}