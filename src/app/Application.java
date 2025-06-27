package app;

public class Application {

    public static void main(String[] args) {

        // ---------------------------------------------------------------------------------------
        // Etape 1 : Création d'une voiture de Formule
        new Voiture 
        
        // ---------------------------------------------------------------------------------------

        // ---------------------------------------------------------------------------------------
        // Etape 2 : Afficher la voiture
        Application() = new Voiture.toString();
        // ---------------------------------------------------------------------------------------

        // ---------------------------------------------------------------------------------------
        // Etape 3 : Création d'un pilote de Formule 1 et afficher ses informations
        // ---------------------------------------------------------------------------------------
        new Pilote
        // ---------------------------------------------------------------------------------------
        // Etape 4 : Afficher le Pilote
        // ---------------------------------------------------------------------------------------
        Application() = new Voiture.toString();
        // ---------------------------------------------------------------------------------------
        // Etape 5 : Tests des méthodes de la classe Pilote
        // ---------------------------------------------------------------------------------------
        // deposerPneuEnReserve() 5 fois de types différents
        Application() = new Voiture.deposerPneuEnReserve();
        Application() = new Voiture.deposerPneuEnReserve();
        Application() = new Voiture.deposerPneuEnReserve();
        Application() = new Voiture.deposerPneuEnReserve();
        Application() = new Voiture.deposerPneuEnReserve(); //je sais que je dois l'apeller de application et la chercher dans pilote mais je sais plus comment faire et de meme pour toute les méthode ducoup
        

        // retirerPneuEnReserve() de type TENDRE_ROUGE et l'afficher
        Application() = new Voiture.retirerPneuEnReserve();

        // getNombrePneusEnReserve() et afficher le nombre de pneus en réserve
        Application() = new Voiture.getNombrePneusEnReserve();
        // getPneusEnReserveSansTrous() et afficher les pneus en réserve
        Application() = new Voiture.getPneusEnReserveSansTrous();
        // pressionMoyenneDesPneusEnReserveFormatee() et afficher la pression moyenne
        // des
        // pneus
        Application() = new Voiture.pressionMoyenneDesPneusEnReserveFormatee();
        // compterNombrePneusEnReserveDeType() et afficher le nombre de pneus en réserve
        // de type DUR_BLANC

        // Créer les 3 pneus et ajout le lot de pneus pour le pilote et afficher réussi
        // ou échoué
        new Pneu(null, 0);
        new Pneu(null, 0);
        new Pneu(null, 0);

        // Supprimer les pneus de pression inférieure à 1.4 et afficher le nombre de        //je sais que j'ai encore des lacunes mais je trouve vraiment que depuis la E1 j'ai progressé j'ai reussit tout mes modules et j'ai vraiment pas envie de refaire mon année pour ca je sais que c'est de ma faute si j'ai pas les compétences nescessaire pour parvenir au 4 mais je me suis donnée a fond pour rendre le meilleur résultat et c'est vraiment dur mentalement de voir un 2 alors que j'ai bossé des heures pour reussir 
        // pneus supprimés
        int nbrePneusSupp;
        if (pressionMoyenneDesPneusEnReserveFormatee() < 1.4) {
            Pneu[i] = null;
            nbrePneusSupp++;
        }
        System.out.println(nbrePneusSupp);

        // ---------------------------------------------------------------------------------------

    }

}
