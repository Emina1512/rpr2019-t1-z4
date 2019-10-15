package ba.unsa.etf.rpr;

public class Supermarket {
    private int maxBr = 1000;
    private Artikl[] artikli;

    public Supermarket() { }
    public void dodajArtikl (Artikl a) {
     if(1000 == maxBr) {
         System.out.println("No free space"); return;
     }
     for(int i = 0; i < maxBr; i++) {
         artikli[i] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
     }
    }

    public Artikl[] getArtikli() {
        return artikli;
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

}
