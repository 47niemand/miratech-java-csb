package com.miratech.patterns.examples.factorymethod;

public class Main {
    public static void main(String[] args) {
        String filename = "myfile.mp3";
        String extension = filename.split("\\.")[1];

        AccountBasedProcessCreator creator = new AccountBasedProcessCreator();

        DataProcessor processor = creator.create(new ProcessorConfig(extension));
        processor.process();
    }
}
