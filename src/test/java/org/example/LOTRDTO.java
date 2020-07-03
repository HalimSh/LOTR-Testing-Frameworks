package org.example;

import java.net.HttpURLConnection;

public class LOTRDTO {
    private LOTRPOJO lotrpojo;

    public LOTRDTO(String path) {
        LOTRReader lotrReader = new LOTRReader();
        lotrpojo = lotrReader.readLOTRasJSON("https://ringsdb.com/api/public/packs/");
    }

    public Integer getStatus() {
        LOTRReader lotrReader = new LOTRReader();
        return Integer.valueOf(lotrReader.getStatus("https://ringsdb.com/api/public/packs/"));
    }
}


