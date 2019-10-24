package ba.unsa.etf.rpr;

public class Artikl {
  private String name = null;
  private int price;
  private String code;


  //konstruktor
 public Artikl ( String name, int price, String code ) {
     this.name = name; this.price = price; this.code = code;
 }
 //getteri
    public String getNaziv() {
     return this.name;
}
    public String getKod() {
        return this.code;
    }
    public int getCijena() {
        return this.price;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
