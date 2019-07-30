package model;

import entiteti.Ocjene;
import entiteti.Ucenik;
import entiteti.Korisnici;
import entiteti.Nastavnici;
import entiteti.UcenikOcjene;
import java.sql.*;
import java.util.ArrayList;

public class UslugeUcenik {

    private static Statement st;
    private static ResultSet rs;
    private static final ArrayList<Ucenik> ucenikLista = new ArrayList();
    private static final ArrayList<Ocjene> ocjeneLista = new ArrayList();
    private static final ArrayList<UcenikOcjene> ocjeneUcenikLista = new ArrayList();

    public static UslugeUcenik prikazOcjenaUcenika(UslugeUcenik ocjene) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    CallableStatement c = null;

    private static Statement poveziSe() throws SQLException {
        return Konekcija.konekcija().createStatement();
    }

    public static Ucenik prikaziUcenika(String ime) throws SQLException {
        st = poveziSe();
        rs = st.executeQuery("select * from ucenici where ime='"
                + ime + "'");
        Ucenik u = null;
        if (rs.next()) {
            u = new Ucenik(rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5));
        }
        return u;
    }

    public static ArrayList<Ucenik> listajSve() throws SQLException {

        st = poveziSe();
        rs = st.executeQuery("select * from ucenici");
        ucenikLista.clear();
        while (rs.next()) {
            ucenikLista.add(new Ucenik(rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4), rs.getString(5)));
        }
        return ucenikLista;
    }

    public static void unesi(Ucenik u) throws SQLException {
        st = poveziSe();
       
       // String upis = "INSERT INTO `mydb2`.`ucenici` ( `ime`, `prezime`, `dob`, `razred_id`,`ucenici_id`) VALUES ('" 
               // + u.getIme() + "','" + u.getPrezime() +"','" + u.getDob() + "','" + u.getRazred_id() +"','"+ u.getId() +  "')";
        //st.executeUpdate(upis);
        String procedura = "{ CALL unesi('" + u.getIme() + "','" + u.getPrezime() +"','" 
                + u.getDob() + "','" + u.getRazred_id() +"') }";
        st.executeQuery(procedura);

    }

    public static void brisi(int id) throws SQLException {
        st = poveziSe();
        String upit = "delete from ucenici where id='" + id + "'";
        st.executeUpdate(upit);
    }

    public static boolean ocijeni(Ocjene o) throws SQLException {
        st = poveziSe();
        String ocjeni = "{ CALL mydb.ocijeniUcenika('" + o.getUceniciId() + "','" + o.getPredmetiId() +"','" 
                + o.getOcjeneId()+"') }";
        rs = st.executeQuery(ocjeni);
        //if(rs.next()) return true;
        //return false;
        return rs.next();
    }

    public static ArrayList<Ocjene> prikazOcjena() throws SQLException {

        st = poveziSe();
        rs = st.executeQuery("select * from ucenici_has_predmeti_has_ocjene order by ucenici_has_predmeti_ucenici_ucenici_id");
        ucenikLista.clear();
        while (rs.next()) {
            ocjeneLista.add(new Ocjene(rs.getString(1), rs.getString(2),
                    rs.getString(3)));
        }
        return ocjeneLista;
    }
     public static UcenikOcjene prikazOcjenaUcenika(UcenikOcjene u) throws SQLException {

        st = poveziSe();
        rs = st.executeQuery("{ CALL mydb.pregledUcenika(); }"+u.getId()
        + u.getIme()
        + u.getPrezime()
        + u.getDob()
        + u.getRazred()
        + u.getPredmet()
        + u.getOcjena());
        ucenikLista.clear();
        while (rs.next()) {
           ocjeneLista.add(new Ocjene(rs.getString(1), rs.getString(2),
                    rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7)));
        }
        return u;
    }
    
    public static boolean login(Korisnici k) throws SQLException
    {
        st = poveziSe();
        String upit = "select * from korisnici where username ='"+k.getUsername()+
                "' and password='"+k.getPassword()+"'";
        rs = st.executeQuery(upit);
        //if(rs.next()) return true;
        //return false;
        return rs.next();
    }
      public static boolean loginNastavnici(Nastavnici n) throws SQLException
    {
        st = poveziSe();
        String upit = "select * from nastavnici where username ='"+n.getUsername()+
                "' and password='"+n.getPassword()+"'";
        rs = st.executeQuery(upit);
        //if(rs.next()) return true;
        //return false;
        return rs.next();
      
    }

}
