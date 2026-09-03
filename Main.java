import java.util.Scanner;

/**
 * ============================================
 *  PROJET JOUR 4 — Main (squelette)
 * ============================================
 *
 * Point d'entrée de l'application.
 *
 * Concepts utilisés :
 * -------------------
 * - Scanner (Jour 1 — entrées console)
 * - Boucle while + switch (Jour 1 — boucles, conditions)
 * - Méthodes static utilitaires (Jour 2 — static, méthodes)
 * - try-catch pour les saisies (Jour 5 — NumberFormatException, unchecked)
 * - try-catch pour les exceptions métier (Jour 5 — checked exceptions)
 * - finally (Jour 5)
 * - Validation String (Jour 1 — conditions, Jour 2 — String)
 *
 * Menu :
 * ------
 *  1. Ajouter un étudiant
 *  2. Ajouter un enseignant
 *  3. Ajouter une formation
 *  4. Afficher les étudiants
 *  5. Afficher les enseignants
 *  6. Afficher les formations
 *  7. Rechercher un étudiant
 *  8. Supprimer un étudiant
 *  9. Modifier la moyenne d'un étudiant
 * 10. Afficher les statistiques
 * 11. Envoyer une notification
 * 12. Quitter
 */
public class Main {

    // TODO : Créer une méthode static afficherMenu()
    //        Afficher le menu ci-dessus

    // TODO : Créer une méthode static lireEntier(Scanner scanner)
    //        Utiliser try-catch pour gérer NumberFormatException
    //        Boucler tant que la saisie n'est pas valide

    // TODO : Créer une méthode static lireDouble(Scanner scanner)
    //        Même logique que lireEntier

    // TODO : Créer une méthode static lireString(Scanner scanner, String label)
    //        Afficher le label, lire la saisie
    //        Vérifier que la saisie n'est pas vide (boucler si vide)

    // TODO : Créer une méthode static ajouterEtudiant(Scanner, SchoolManager)
    //        - Saisir nom, prenom, email, niveau, moyenne
    //        - Créer l'objet dans un try-catch
    //          (NoteInvalideException si moyenne invalide)
    //          (IllegalArgumentException si nom/email invalide)
    //        - Appeler manager.ajouterEtudiant()

    // TODO : Créer une méthode static ajouterEnseignant(Scanner, SchoolManager)
    //        Même logique avec SalaireInvalideException

    // TODO : Créer une méthode static ajouterFormation(Scanner, SchoolManager)
    //        try-catch pour IllegalArgumentException

    // TODO : Créer une méthode static rechercherEtudiant(Scanner, SchoolManager)

    // TODO : Créer une méthode static supprimerEtudiant(Scanner, SchoolManager)

    // TODO : Créer une méthode static modifierMoyenne(Scanner, SchoolManager)
    //        try-catch pour NoteInvalideException

    // TODO : Créer une méthode static envoyerNotification(Scanner, SchoolManager)

    public static void main(String[] args) {

        // TODO : Créer un SchoolManager

        // TODO : Créer un Scanner

        // TODO : Boucle du menu (while + switch)
        //        - Lire le choix avec lireEntier()
        //        - switch sur le choix
        //        - case 12 → quitter (continuer = false)
        //        - default → "Choix invalide"

        // TODO : Fermer le scanner dans un bloc finally

    }
}
