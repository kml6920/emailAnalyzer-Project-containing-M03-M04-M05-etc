package model;

public class EmailParser {
    private MetadataStore store;

    public EmailParser(MetadataStore store) {
        this.store = store;
    }

    public void parse(String filePath) {
        // fake emails randomly inserted just for now
        EmailMetadata e1 = new EmailMetadata("test@spam.com", "Win money now!", "2025-11-01");
        EmailMetadata e2 = new EmailMetadata("boss@company.com", "Meeting tomorrow", "2025-11-01");

        store.addEmail(e1);
        store.addEmail(e2);
    }
}

