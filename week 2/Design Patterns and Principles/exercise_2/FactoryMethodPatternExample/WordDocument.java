import javax.swing.text.Document;

abstract class WordDocument implements Document {

    public void open() {

        System.out.println("Word Document Opened");
    }
}