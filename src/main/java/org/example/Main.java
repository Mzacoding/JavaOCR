package org.example;


import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Main {
    public static void main(String[] args) {


         Tesseract tesseract =new Tesseract();


        tesseract.setDatapath("C://Program Files//Tess4J//tessdata");

        String extractedText = null;
        try {
            extractedText = tesseract.doOCR(new File("C://Users//nyiko//Downloads//R.jpg"));
        } catch (TesseractException e) {
            throw new RuntimeException(e);
        }
        System.out.println(extractedText);

    }
}