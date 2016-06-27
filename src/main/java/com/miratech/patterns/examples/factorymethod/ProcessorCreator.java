package com.miratech.patterns.examples.factorymethod;


import java.util.HashSet;
import java.util.Set;

abstract class ProcessorCreator {
    abstract DataProcessor create(ProcessorConfig config);
}

class AccountBasedProcessCreator extends ProcessorCreator{
    private Set<String> media = new HashSet<String>() {{
        add("mp3");
        add("png");
        add("avi");
    }};

    private Set<String> text = new HashSet<String>() {{
        add("txt");
        add("doc");
    }};

    private MediaProcessorCreator mediaProcessorCreator = new MediaProcessorCreator();
    private TextProcessorCreator textProcessorCreator = new TextProcessorCreator();

    DataProcessor create(final ProcessorConfig config) {
        String extension = config.getExtension();

        if (media.contains(extension)) {
            return mediaProcessorCreator.create(config);
        }

        if (text.contains(extension)) {
            if(Account.isPremium()){
                return textProcessorCreator.create(config);
            }
        }

        return null;
    }
}

class MediaProcessorCreator extends ProcessorCreator {
    DataProcessor create(ProcessorConfig config) {
        if (config.getExtension().equals("mp3")) {
            return new Mp3Processor(config);
        }

        if (config.getExtension().equals("png")) {
            return new ImageProcessor(config);
        }

        return null;
    }
}

class TextProcessorCreator extends ProcessorCreator {

    DataProcessor create(ProcessorConfig config) {
        return null;
    }
}




