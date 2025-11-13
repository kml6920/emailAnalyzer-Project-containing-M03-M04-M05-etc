package model;

import java.util.ArrayList;

public class MetadataStore {
    private ArrayList<EmailMetadata> emails = new ArrayList<>();

    public void addEmail(EmailMetadata email) {
        emails.add(email);
    }

    public ArrayList<EmailMetadata> search(String keyword) {
        ArrayList<EmailMetadata> result = new ArrayList<>();
        for (EmailMetadata e : emails) {
            if (e.toString().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(e);
            }
        }
        return result;
    }

    public int countFlagged() {
        int count = 0;
        for (EmailMetadata e : emails) {
            if (e.flagged) count++;
        }
        return count;
    }
}
