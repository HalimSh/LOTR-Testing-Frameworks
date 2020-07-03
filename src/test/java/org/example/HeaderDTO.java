package org.example;

public class HeaderDTO {
    private LOTRPOJO lotrpojo;
    private LOTRPOJO httpURLConnection;

    public HeaderDTO(String s) {
        LOTRReader lotrReader = new LOTRReader();
        httpURLConnection = LOTRReader.readLOTRasJSON("https://ringsdb.com/api/public/packs/");
    }

    public String getName() {
        return httpURLConnection.getName();
    }

    public String getCode() {
        return httpURLConnection.getCode();
    }
    public Integer getPosition() {
        return httpURLConnection.getPosition();
    }
    public Integer getCyclePosition() {
        return httpURLConnection.getCyclePosition();
    }
    public String getAvailable() {
        return httpURLConnection.getAvailable();
    }
    public Integer getKnown() {
        return httpURLConnection.getKnown();
    }
    public Integer getTotal() {
        return httpURLConnection.getTotal();
    }
    public String getUrl() {
        return httpURLConnection.getUrl();
    }
    public Integer getId() {
        return httpURLConnection.getId();
    }
}



