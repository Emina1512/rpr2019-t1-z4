package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Korpa korpa;
    private Artikl artikl;

    @BeforeEach
    void SetUp() {
        korpa = new Korpa();
        artikl = new Artikl("lopta", 150, "12");
    }

    @Test
    void testPopunjeno() {
        assertTrue(korpa.dodajArtikl(artikl));
    }

    @Test
    void testIzbaci() {
        Artikl tmp = korpa.izbaciArtiklSaKodom("12");
        assertSame(tmp, artikl);
    }

    @Test
    void testCijena() {
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "5"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "6"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "7"));

        assertEquals(4150, korpa.dajUkupnuCijenuArtikala());
    }

}