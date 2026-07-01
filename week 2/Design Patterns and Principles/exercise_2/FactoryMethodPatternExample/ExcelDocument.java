import javax.swing.text.Document;

abstract class ExcelDocument implements Document {

    public void open() {

        System.out.println("Excel Document Opened");
    }
}