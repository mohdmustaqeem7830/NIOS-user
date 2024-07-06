package com.Hamza.niosgeniusbookshub;

public class PdfModal {
    private String category;
    private String name;
    private String standard;
    private String url;

    // Required empty constructor for Firebase
    public PdfModal() {
    }

    // Constructor
    public PdfModal(String category, String name, String standard, String url) {
        this.category = category;
        this.name = name;
        this.standard = standard;
        this.url = url;
    }

    // Getters and setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

