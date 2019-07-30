package entiteti;

public class Ucenik {

    private String id;
    private String ime;
    private String prezime;
    private String dob;
    private String razred_id;

    public Ucenik() {
    }

    public Ucenik(String id, String ime, String prezime, String dob, String razred_id) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.dob = dob;
        this.razred_id = razred_id;

    }

    public Ucenik(String ime, String prezime, String dob, String razred_id) {
        this.ime = ime;
        this.prezime = prezime;
        this.dob = dob;
        this.razred_id = razred_id;
    }

    public Ucenik(String ime) {
        this.ime = ime;

    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    /* public Ucenik(String ime, String password){
         this.ime = ime;
         this.password = password;
     }*/
    public Ucenik(String parameter, String parameter0, String parameter1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRazred_id() {
        return razred_id;
    }

    public void setRazred_id(String razred_id) {
        this.razred_id = razred_id;
    }

    @Override
    public String toString() {
        return "Ucenik{" + "id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", dob=" + dob + ", razred_id=" + razred_id + '}';
    }

}
