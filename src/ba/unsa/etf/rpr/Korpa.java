package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli;
    private int maxBr = 50;

    public Korpa() { artikli = null; }
    public boolean dodajArtikl (Artikl a)  {
      for(int i = 0; i < maxBr; i++) {
          if(artikli[i] == null) {
              artikli[i] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
              return true;
          }
      } return false;
    }

    public Artikl[] getArtikli () {
        return this.artikli;
    }
    public Artikl izbaciArtiklSaKodom (String code) {
        Artikl tmpi = null;
        for(int i = 0; i < maxBr; i++) {
            String tmp = artikli[i].getKod();
            if(code.equals(tmp)) {
                tmpi = artikli[i];
                for(int j = i; j + 1 < maxBr; j++)
                {
                    artikli[j] = artikli[j+1];
                }
                artikli[maxBr-1] = null;
                break;
            }
        } return tmpi;
    }

        public int dajUkupnuCijenuArtikala () {
        int rez = 0;
        for( int i = 0; i < maxBr; i++) {
            if(artikli[i] == null) break;
            rez += artikli[i].getCijena();
        }
        return rez;
    }

}
