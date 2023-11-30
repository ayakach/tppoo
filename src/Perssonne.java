public class Perssonne {
    protected String name;
    protected String prenom;
    protected int id;
    static int compteur;
    public Perssonne(String nom ,String prenom) {
        this.name=nom;
        this.prenom=prenom;
        this.id=compteur++;
    }


}
