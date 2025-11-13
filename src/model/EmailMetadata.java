package model;

public class EmailMetadata {
    public String email;
    public String subject;
    public String date;
    public boolean flagged = false;  

    public EmailMetadata(String email, String subject, String date) {
        this.email = email;
        this.subject = subject;
        this.date = date;
    }

    @Override
    public String toString() {
        return email + " | " + subject + " | " + date + (flagged ? " | FLAGGED" : "");
    }
}

