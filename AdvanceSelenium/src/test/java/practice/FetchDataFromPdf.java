package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class FetchDataFromPdf {

	public static void main(String[] args) throws Throwable  {
		File file = new File("./src/test/resources/Day 1 - assignment, Component name and image (1).pdf");

		 PDDocument doc = PDDocument.load(file);
		//PDDocument doc = PDDocument.load(file);
		
		int pages = doc.getNumberOfPages();
		System.out.println(pages);
		
		PDFTextStripper pdfData = new PDFTextStripper();
		//String readData = pdfData.getText(doc);
		//System.out.println(readData);
		
		//pdfData.setStartPage(3);
		//String readData = pdfData.getText(doc);
		//System.out.println(readData);
		
		pdfData.setStartPage(3);
		pdfData.setEndPage(3);
	String readData = pdfData.getText(doc);
	System.out.println(readData);
		
		
		
		
		
		
		
		
		
	}

}
