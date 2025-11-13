package model;

public class FlaggingEngine {
    private MetadataStore store;

    public FlaggingEngine(MetadataStore store) {
        this.store = store;
    }

    public void checkFlags() {
        System.out.println("Checking for flagged alerts...");
    }
}

