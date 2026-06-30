import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilderFactory;

abstract class ExcelFactory extends DocumentBuilderFactory {

    abstract Document createDocument();
}