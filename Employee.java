package com.traning.inter;

import java.util.Scanner;

interface Extractor {
    void extractFiles(String... filenames);
}

class ZipExtractor implements Extractor {
    @Override
    public void extractFiles(String... filenames) {
        System.out.println("Extracting from zip => files as .txt, .jpeg, .doc files:");
        for (String filename : filenames) {
            System.out.println("Extracted file: " + filename);
        }
    }
}

class JarExtractor implements Extractor {
    @Override
    public void extractFiles(String... filenames) {
        System.out.println("Extracting from jar => files as .class files:");
        for (String filename : filenames) {
            System.out.println("Extracted file: " + filename);
        }
    }
}

class RarExtractor implements Extractor {
    @Override
    public void extractFiles(String... filenames) {
        System.out.println("Extracting from rar => files as .tex files from Linux OS:");
        for (String filename : filenames) {
            System.out.println("Extracted file: " + filename);
        }
    }
}

public class Employee {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter file type (z for zip, j for jar, r for rar):");
	        String fileType = scanner.next();

	        Extractor extractor;
	        switch (fileType) {
	            case "z":
	                extractor = new ZipExtractor();
	                extractor.extractFiles("a.txt", "b.txt", "c.txt");
	                break;
	            case "j":
	                extractor = new JarExtractor();
	                extractor.extractFiles("x.class", "y.class", "z.class");
	                break;
	            case "r":
	                extractor = new RarExtractor();
	                extractor.extractFiles("file1.tex", "file2.tex", "file3.tex");
	                break;
	            default:
	                System.out.println("Invalid file type");
	        }
	    }
}
