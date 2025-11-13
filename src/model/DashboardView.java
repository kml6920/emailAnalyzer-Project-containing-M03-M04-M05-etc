package model;

public class DashboardView {
    private MetadataStore store;

    public DashboardView(MetadataStore store) {
        this.store = store;
    }

    public void display() {
        System.out.println("Total emails: " + store.search("").size());
        System.out.println("Flagged emails: " + store.countFlagged());
    }
}

