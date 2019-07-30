
package entiteti;

public class Predmeti extends Ucenik{
    
    private int predmeti_id;
    private String naziv;

    public Predmeti() {
    }

    public Predmeti(int predmeti_id, String naziv) {
        this.predmeti_id = predmeti_id;
        this.naziv = naziv;
    }

    public int getPredmeti_id() {
        return predmeti_id;
    }

    public void setPredmeti_id(int predmeti_id) {
        this.predmeti_id = predmeti_id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Predmeti{" + "predmeti_id=" + predmeti_id + ", naziv=" + naziv + '}';
    }
    
    
    
    
    
}
