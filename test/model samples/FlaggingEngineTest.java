package model;

import static org.junit.Assert.*;
import org.junit.Test;

public class FlaggingEngineTest {

    @Test
    public void testFlagsEmailsWithSpamWords() {
        MetadataStore store = new MetadataStore();
        FlaggingEngine flagger = new FlaggingEngine(store);

        EmailMetadata spam = new EmailMetadata("scam@bad.com", "Free money now!", "2025-02-01");
        store.save(spam);

        flagger.flagEmails();

        assertTrue(spam.isFlagged());
    }
}
