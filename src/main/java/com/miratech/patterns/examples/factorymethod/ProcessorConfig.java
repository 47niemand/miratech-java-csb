package com.miratech.patterns.examples.factorymethod;


class ProcessorConfig {
    private String extension;

    ProcessorConfig(final String extension) {
        this.extension = extension;
    }

    String getExtension() {
        return extension;
    }

    void setExtension(final String extension) {
        this.extension = extension;
    }
}
