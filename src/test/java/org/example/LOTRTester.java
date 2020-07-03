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
        Assertions.assertEquals("Core Set", headerDTO.getName());
    }

    @Test
    void checkLOTRCode() {
        Assertions.assertEquals("Core", headerDTO.getCode());
    }

    @Test
    void checkLOTRPosition() {
        Assertions.assertEquals(1, headerDTO.getPosition());
    }

    @Test
    void checkLOTRCyclePosition() {
        Assertions.assertEquals(1, headerDTO.getCyclePosition());
    }

    @Test
    void checkLOTRAvailable() {
        Assertions.assertEquals("2011-04-20", headerDTO.getAvailable());
    }

    @Test
    void checkLOTRKnown() {
        Assertions.assertEquals(73, headerDTO.getKnown());
    }

    @Test
    void checkLOTRTotal() {
        Assertions.assertEquals(73, headerDTO.getTotal());
    }

    @Test
    void checkLOTRUrl() {
        Assertions.assertEquals("https://ringsdb.com/set/Core", headerDTO.getUrl());
    }

    @Test
    void checkLOTRID() {
        Assertions.assertEquals(1, headerDTO.getId());
    }


}
