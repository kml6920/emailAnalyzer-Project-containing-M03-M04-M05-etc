package model;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class MetadataStoreTest {

    @Test
    public void testSaveAddsEmail() {
        MetadataStore store = new MetadataStore();
        store.save(new EmailMetadata("a@b.com", "Hello", "2025-02-01"));

        assertEquals(1, store.getAll().size());
    }

    @Test
    public void testSearchFindsMatches() {
        MetadataStore store = new MetadataStore();
        store.save(new EmailMetadata("me@mail.com", "Meeting tomorrow", "2025-02-01"));
        store.save(new EmailMetadata("boss@mail.com", "Buy supplies", "2025-02-01"));

        List<EmailMetadata> results = store.search("buy");

        assertEquals(1, results.size());
    }
}
