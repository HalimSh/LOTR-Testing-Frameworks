package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LOTRTester {
    LOTRReader lotrReader = new LOTRReader();
    LOTRDTO lotrdto = new LOTRDTO("https://ringsdb.com/api/public/packs/");
    LOTRPOJO lotrpojo = LOTRReader.readLOTRasJSON("https://ringsdb.com/api/public/packs/");
    HeaderDTO headerDTO = new HeaderDTO("https://ringsdb.com/api/public/packs/");

    @Test
    void checkStatusCode() { Assertions.assertEquals(200, lotrdto.getStatus()); }

    @Test
    void checkLOTRName() {
        Assertions.assertEquals("Core Set", lotrpojo.getName());
    }

    @Test
    void checkLOTRCode() {
        Assertions.assertEquals("Core", lotrpojo.getCode());
    }

    @Test
    void checkLOTRPosition() {
        Assertions.assertEquals(1, lotrpojo.getPosition());
    }

    @Test
    void checkLOTRCyclePosition() {
        Assertions.assertEquals(1, lotrpojo.getCyclePosition());
    }

    @Test
    void checkLOTRAvailable() {
        Assertions.assertEquals("2011-04-20", lotrpojo.getAvailable());
    }

    @Test
    void checkLOTRKnown() {
        Assertions.assertEquals(73, lotrpojo.getKnown());
    }

    @Test
    void checkLOTRTotal() {
        Assertions.assertEquals(73, lotrpojo.getTotal());
    }

    @Test
    void checkLOTRUrl() {
        Assertions.assertEquals("https://ringsdb.com/set/Core", lotrpojo.getUrl());
    }

    @Test
    void checkLOTRID() {
        Assertions.assertEquals(1, lotrpojo.getId());
    }

    @Test
    void checkHeaders() { Assertions.assertEquals("name, code, position, cycle_position, available, known, total, url, id", headerDTO);}
}
