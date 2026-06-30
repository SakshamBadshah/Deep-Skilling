import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

abstract class PdfFactory extends DocumentBuilderFactory {

    abstract Document createDocument();
}