package com.miratech.patterns.examples.factorymethod;

interface DataProcessor {
    ProcessorConfig getConfiguration();

    void process();
}

class Mp3Processor implements DataProcessor {
    private ProcessorConfig config;

    Mp3Processor(final ProcessorConfig config) {
        this.config = config;
    }

    public ProcessorConfig getConfiguration() {
        return config;
    }

    public void process() {
        System.out.println("Process audio");
    }
}

class ImageProcessor implements DataProcessor {
    private ProcessorConfig config;

    ImageProcessor(ProcessorConfig config) {
        this.config = config;
    }

    public ProcessorConfig getConfiguration() {
        return config;
    }

    public void process() {
        System.out.println("Process image");
    }
}
