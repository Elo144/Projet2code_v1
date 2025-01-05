public class Personnel extends Employe {
    private String historiquePersonnel;
    public Personnel(String historiquePersonnel) {
        super();
        this.historiquePersonnel = historiquePersonnel;
    }

    public String getHistoriquePersonnel() {
        return historiquePersonnel;
    }

    @Override
    public String toString() {
        return "Personnel{" + "historiquePersonnel='" + historiquePersonnel + '\'' + ", nomEmploye='" + nomEmploye + '\'' +'}';
    }
}
