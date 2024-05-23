public class Wilder {
    private String firstname;
    private boolean aware;

    //Constructeur pour initialiser une valeur à l'attribut firstname de l'objet. 
    public Wilder(String firstname) {
        this.firstname = firstname;
        this.aware = false;
    }

    //Constructeur pour initialiser une valeur à l'attribut firstname de l'objet. 
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    //Obtenir le prénom
    public String getFirstname() {
        return this.firstname;
    }

    //Enregistrer la modification du prénom
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    //Obtenir l'état
    public boolean isAware() {
        return this.aware;
    }

    //Modifier l'état
    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if(this.aware) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware.";
        } else {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware.";
        }
    }
}