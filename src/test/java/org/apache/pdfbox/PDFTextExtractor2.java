package org.apache.pdfbox;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFTextExtractor2 {

    public static void main(String[] args) {
        // PDF file path
        String pdfFilePath = "path/to/your/file.pdf";

        try {
            // Load PDF document
            PDDocument document = PDDocument.load(new File(pdfFilePath));

            // Check if document is encrypted
            if (!document.isEncrypted()) {
                // Extract text
                PDFTextStripper pdfStripper = new PDFTextStripper();
                String text = pdfStripper.getText(document);

                // Print the extracted text
                System.out.println(text);
            } else {
                System.out.println("The document is encrypted and cannot be read.");
            }

            // Close the document
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
