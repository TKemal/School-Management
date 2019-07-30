
package entiteti;

public class Ocjene extends Ucenik{
    private String uceniciId;
    private String predmetiId;
    private String ocjeneId;

    public Ocjene() {
    }

    public Ocjene(String uceniciId, String predmetiId, String ocjeneId) {
        this.uceniciId = uceniciId;
        this.predmetiId = predmetiId;
        this.ocjeneId = ocjeneId;
    }

    public Ocjene(String string, String string0, String string1, String string2, String string3, String string4, String string5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUceniciId() {
        return uceniciId;
    }

    public void setUceniciId(String uceniciId) {
        this.uceniciId = uceniciId;
    }

    public String getPredmetiId() {
        return predmetiId;
    }

    public void setPredmetiId(String predmetiId) {
        this.predmetiId = predmetiId;
    }

    public String getOcjeneId() {
        return ocjeneId;
    }

    public void setOcjeneId(String ocjeneId) {
        this.ocjeneId = ocjeneId;
    }

    @Override
    public String toString() {
        return "Ocjene{" + "uceniciId=" + uceniciId + ", predmetiId=" + predmetiId + ", ocjeneId=" + ocjeneId + '}';
    }
    
    
            
}
