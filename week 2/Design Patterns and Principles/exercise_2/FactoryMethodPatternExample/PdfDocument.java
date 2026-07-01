import javax.swing.text.Document;

abstract class PdfDocument implements Document {

    public void open() {

        System.out.println("PDF Document Opened");
    }
}