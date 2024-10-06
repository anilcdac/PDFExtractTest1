package pdfFiles;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class ReadPDF2 {

    public static void main(String[] args) throws IOException {

        File pdfFile = new File("/Users/anilkumarkalshetti/Documents/workspace/PDFExtractTest1/data/sample.pdf");

        //        Load PDF Document
//        PDDocument document = PDDocument.load(pdfFile);
//        PDDocument document = Loader.loadPdf(pdfFile);//3

        PDFTextStripper pdfStripper = new PDFTextStripper();
        String text = pdfStripper.getText(document);

        document.close();
        System.out.println(text);


    }

}
