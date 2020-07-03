package org.example;

public class LOTRDTO {
    private LOTRPOJO lotrpojo;

    public LOTRDTO(String path) {
        LOTRReader lotrReader = new LOTRReader();
        lotrpojo = lotrReader.readLOTRasJSON(path);
    }

    public Integer getStatus() {
        LOTRReader lotrReader = new LOTRReader();
        return Integer.valueOf(lotrReader.getStatus("https://ringsdb.com/api/public/packs/"));
    }
}


//fix
//headers
//github
//presentation
//readme
