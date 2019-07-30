
package entiteti;

public class UcenikOcjene {
    public int id;
    public String ime;
    public String prezime;
    public int dob;
    public int razred;
    public int predmet;
    public int ocjena;

    public UcenikOcjene() {
    }

    public UcenikOcjene(int id, String ime, String prezime, int dob, int razred, int predmet, int ocjena) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.dob = dob;
        this.razred = razred;
        this.predmet = predmet;
        this.ocjena = ocjena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getRazred() {
        return razred;
    }

    public void setRazred(int razred) {
        this.razred = razred;
    }

    public int getPredmet() {
        return predmet;
    }

    public void setPredmet(int predmet) {
        this.predmet = predmet;
    }

    public int getOcjena() {
        return ocjena;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }

    @Override
    public String toString() {
        return "UcenikOcjene{" + "id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", dob=" + dob + ", razred=" + razred + ", predmet=" + predmet + ", ocjena=" + ocjena + '}';
    }
    
    
}
