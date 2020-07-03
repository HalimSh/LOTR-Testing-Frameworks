package org.example;

public class HeaderDTO {
    private LOTRPOJO lotrpojo;

    public HeaderDTO(String s) {
        LOTRReader lotrReader = new LOTRReader();
        lotrReader.getHeader("https://ringsdb.com/api/public/packs/");
    }
}




