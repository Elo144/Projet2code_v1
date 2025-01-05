public class Employe{
    private int numeroemploye;
    private String dateEmbauche;
    public String nomEmploye;

    public Employe(String dateEmbauche, int numeroemploye, String nomEmploye) {
        this.dateEmbauche = dateEmbauche;
        this.numeroemploye = numeroemploye;
        this.nomEmploye = nomEmploye;
    }

    public int getNumeroemploye() {
        return numeroemploye;
    }
    public String getDateEmbauche() {
        return dateEmbauche;
    }
    public String getNomEmploye() {
        return nomEmploye;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "numeroemploye=" + numeroemploye +
                ", dateEmbauche='" + dateEmbauche + '\'' +
                ", nomEmploye='" + nomEmploye + '\'' +
                '}';
    }

    //Fonction ObtenirRole()
    public void ObtenirRole() {
        System.out.println("Role = void");
    }
}
