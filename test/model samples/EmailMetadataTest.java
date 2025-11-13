package model;

import static org.junit.Assert.*;
import org.junit.Test;

public class EmailMetadataTest {

    @Test
    public void testToString() {
        EmailMetadata email = new EmailMetadata("test@example.com", "Hello", "2025-01-01");
        String expected = "test@example.com | Hello | 2025-01-01";
        assertEquals(expected, email.toString());
    }

    @Test
    public void testFlagSetterGetter() {
        EmailMetadata email = new EmailMetadata("spam@ads.com", "Buy now", "2025-03-01");

        assertFalse(email.isFlagged()); // default should be false
        email.setFlag(true);
        assertTrue(email.isFlagged());
    }
}
