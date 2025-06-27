package app;

public class Pilote {
    public static int NOMBRE_PNEUS_EN_RESERVE = 16;
    private final String nom;
    private final String nationalite;
    private int nombrePoints;
    private int nombreCourse;
    private int nombreVictoire;
    private int nombrePodiums;
    private final Pneu[] pneusEnReserve;
    private final Voiture voiture;

    public Pilote(String nom, String nationalite) {
        this.nom = nom;
        this.nationalite = nationalite;
        this.nombrePoints = 0;
        this.nombreCourse = 0;
        this.nombreVictoire = 0;
        this.nombrePodiums = 0;
        this.pneusEnReserve = new Pneu[0];
        this.voiture = null;

    }

    public Pilote(String nom, String nationalite, Voiture voiture) { // j'ai fait se qui était demandé mais je n'ai pas
                                                                     // compris pourquoi on doit faire deux constructeur
                                                                     // qui font a peu près la meme chose
        this.nom = nom;
        this.nationalite = nationalite;
        this.voiture = voiture;
        this.nombreCourse = 0;
        this.nombrePodiums = 0;
        this.nombreVictoire = 0;
        this.nombrePoints = 0;
        this.pneusEnReserve = new Pneu[0];

    }

    public boolean deposerPneuEnReserve(Pneu pneu) {
        boolean depotReussi = false;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] == null) {
                depotReussi = true;
                break;
            }

        }
        return depotReussi;
    }

    public Pneu retirerPneuEnReserve(TypePneu type) {
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] != null) {
                pneusEnReserve[i] = null;
            }
        }
        return retirerPneuEnReserve(type); // je suis absolument pas sur de se que je viens de faire mais au moins j'ai
                                           // pas d'erreur

    }

    public int compterNombrePneusEnReserveDeType(TypePneu type) {

        int blanc = 0;
        int jaune = 0;
        int rouge = 0;

        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (TypePneu.DUR_BLANC != null) {
                blanc++;

                if (TypePneu.MEDIUM_JAUNE != null) {
                    jaune++;
                }

                if (TypePneu.TENDRE_ROUGE != null) {
                    rouge++;
                }
            }
        }
        return blanc + jaune + rouge;

    }

    public int getNombrePneusEnReserve() {
        int nbre_reserve = 0;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] != null) {
                nbre_reserve++;
            }
        }
        return nbre_reserve;
    }

    public Pneu[] getPneusSansEnReserveSansTrous() {
        int nbrePneuSansTrous = 0;
        Pneu[] sansTrous = new Pneu[nbrePneuSansTrous];
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] != null) {
                nbrePneuSansTrous++;
            }
        }
        for (int i = 0; i < sansTrous.length; i++) {
            if (sansTrous[i] == null) {
                sansTrous[i] = pneusEnReserve[i];
            }
        }
        return sansTrous;
    }

    public String pressionMoyenneDesPneusEnReserveFormatee() {
        int pression = 1;
        for (int i = 0; i < pneusEnReserve.length; i++) { // je comprends pas cette méthode dans le sens ou je dois
                                                          // retourner un string alors que je dois calculer une moyenne
                                                          // enfait c'est les trois dernière que je comprends pas, je
                                                          // sais pas vraiment comment m'y prendre

        }
    }

    public int supprimerPneusDePressionInferieur(double pression) {
        int nbreDePneusSupp = 0;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i]) {
                nbreDePneusSupp++;

            }
        }
        return nbreDePneusSupp;
    }

    public boolean ajouterLotDePneus(Pneu[] pneus) {

    }

    public String getNom() {
        return nom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public int getNombrePoints() {
        return nombrePoints;
    }

    public int getNombreCourse() {
        return nombreCourse;
    }

    public int getNombreVictoire() {
        return nombreVictoire;
    }

    public int getNombrePodiums() {
        return nombrePodiums;
    }

    public void setNombrePoints(int nombrePoints) {
        this.nombrePoints = nombrePoints;
    }

    public void setNombreCourse(int nombreCourse) {
        this.nombreCourse = nombreCourse;
    }

    public void setNombreVictoire(int nombreVictoire) {
        this.nombreVictoire = nombreVictoire;
    }

    public void setNombrePodiums(int nombrePodiums) {
        this.nombrePodiums = nombrePodiums;
    }

    @Override
    public String toString() {
        for (int i = 0; i < pneusEnReserve.length; i++) {
            String resultat = "Pilote: " + nom + (" + nationalite + ");

            if (voiture != null) {
                getNomEquipe();
                getNumero();
                for (int j = 0; j < pneusEnReserve.length; j++) {
                    resultat += "-> Voiture " + getNomEquipe() + " numéro " + getNumero();
                    resultat += "-> Points: " + getNombreDePoints();
                    resultat += "-> Course: " + getNombreCourse();
                    resultat += "-> Victoires: " + getNombreDeVictoires();
                    resultat += "-> Podiums: " + getNombreDePodiums();
                    resultat += "-> Pas de voiture assignée";

                }
            }

            for (Pneu pneu : pneusEnReserve) {
                if (pneu[i] != null) {
                    getType();
                }
                resultat += "-> Pneu en réserve: " + type;
            }

            return resultat;

        }

    }
}
