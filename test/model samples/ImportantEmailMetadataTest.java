package model.samples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import model.ImportantEmailMetadata;

public class ImportantEmailMetadataTest {

    @Test
    public void testPriorityLevel() {
        ImportantEmailMetadata email = new ImportantEmailMetadata("boss@example.com", "Urgent Meeting", "2025-11-13",
                10, true);
        assertEquals(10, email.getPriorityLevel());
        assertTrue(email.requiresImmediateAttention());
    }

    @Test
    public void testToStringIncludesPriority() {
        ImportantEmailMetadata email = new ImportantEmailMetadata("boss@example.com", "Urgent Meeting", "2025-11-13", 5,
                false);
        String text = email.toString();
        assertTrue(text.contains("Priority"));
    }
}
