import model.*;

public class Main {
    public static void main(String[] args) {
        MetadataStore store = new MetadataStore();
        EmailParser parser = new EmailParser(store);
        FlaggingEngine flagger = new FlaggingEngine(store);
        DashboardView dashboard = new DashboardView(store);
        AlertPanel alerts = new AlertPanel(store);


        parser.parse("sample_email.pst");  // Pretend to parse an email
        dashboard.display();               // Show total emails parsed
        alerts.showAlerts();               // Show flagged emails
    }
}


