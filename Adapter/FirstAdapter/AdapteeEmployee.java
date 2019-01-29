package Adapter.FirstAdapter;

public class AdapteeEmployee {

    private int identity;
    private String nom;
    private String prenom;
    private String mail;

    public AdapteeEmployee(int identity, String nom, String prenom, String mail) {
        this.identity = identity;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "AdapteeEmployee{" +
                "identity=" + identity +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
