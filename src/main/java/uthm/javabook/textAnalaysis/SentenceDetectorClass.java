package uthm.javabook.textAnalaysis;

/*
 * Author : Aamir Khan
 * Faculty of Computer Science and Information Technology
 * University Tun Hussein Onn Malaysia
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;

public class SentenceDetectorClass {

	public static void main(String[] args) {

		String rawText = "Hi everyone? Welcome to the Java Book Programs from FSKTM UTHM. "
				+ "This is a test code for sentence detector. hope you will find it easy to understand.";

		try {
			// Load model for sentence detector from your models location.
			// In my case is "C:/apache-opennlp-1.9.2/models/"
			InputStream inputModel = new FileInputStream("C:/apache-opennlp-1.9.2/models/da-sent.bin");

			SentenceModel sentenceDetectModel = new SentenceModel(inputModel);

			// Instantiate the SentenceDetectorME class for loading its methods
			SentenceDetectorME sentenceDetector = new SentenceDetectorME(sentenceDetectModel);

			// List of detected sentences
			String sentencesList[] = sentenceDetector.sentDetect(rawText);

			// Print all detected sentences in the list.
			for (String sentence : sentencesList)
				System.out.println(sentence);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
