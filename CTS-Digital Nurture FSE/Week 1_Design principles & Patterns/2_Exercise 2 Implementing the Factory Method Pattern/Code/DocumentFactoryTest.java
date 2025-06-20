
interface Document {
    void open();
}
class WordDoc implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document.");
    }
}

class PdfDoc implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}


class ExcelDoc implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}

// File: DocumentFactory.java
abstract class DocumentFactory {
    public abstract Document createDocument();
}

// File: WordDocumentFactory.java
class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDoc();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDoc();
    }
}

// File: ExcelDocumentFactory.java
class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDoc();
    }
}

// File: DocumentFactoryTest.java
public class DocumentFactoryTest {
    public static void main(String[] args) {
        DocumentFactory w = new WordDocumentFactory();
        Document wordDoc =w.createDocument();
        wordDoc.open();

        DocumentFactory p = new PdfDocumentFactory();
        Document pdfDoc = p.createDocument();
        pdfDoc.open();

        DocumentFactory e = new ExcelDocumentFactory();
        Document excelDoc = e.createDocument();
        excelDoc.open();
    }
}

