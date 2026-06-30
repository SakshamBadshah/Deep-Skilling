import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.swing.text.PlainDocument;

abstract class WordFactory extends DocumentBuilderFactory {

    Document createDocument() {

        return new PlainDocument();
    }
}