package model;

public class AlertPanel {
    private MetadataStore store;

    public AlertPanel(MetadataStore store) {
        this.store = store;
    }

    public void showAlerts() {
        System.out.println("== ALERTS ==");
        for (EmailMetadata e : store.search("")) {
            if (e.flagged) {
                System.out.println("FLAGGED: " + e.toString());
            }
        }
    }
}

