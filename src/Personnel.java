public class Personnel {
    private int numeroemploye;
    private String dateEmbauche;
    private String nomEmploye;
    private String historiqueEmploye;

    public Personnel(String dateEmbauche, int numeroemploye, String nomEmploye, String historiqueEmploye) {
        this.dateEmbauche = dateEmbauche;
        this.numeroemploye = numeroemploye;
        this.nomEmploye = nomEmploye;
        this.historiqueEmploye = historiqueEmploye;
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
    public String getHistoriqueEmploye() {
        return historiqueEmploye;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "numeroemploye=" + numeroemploye +
                ", dateEmbauche='" + dateEmbauche + '\'' +
                ", nomEmploye='" + nomEmploye + '\'' +
                ", historiqueEmploye='" + historiqueEmploye + '\'' +
                '}';
    }

    //Fonction ObtenirRole()
    public void ObtenirRole() {
        System.out.println("Role = void");
    }
}
