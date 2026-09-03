import java.util.HashMap;

/**
 * ============================================
 *  PROJET JOUR 4 — SchoolManager (squelette)
 * ============================================
 *
 * Classe qui gère le stockage et la logique métier.
 *
 * Concepts utilisés :
 * -------------------
 * - HashMap pour le stockage (Jour 2 — Map)
 * - Boucles sur les valeurs (Jour 1 — boucles)
 * - Conditions (Jour 1)
 * - try-catch dans les méthodes (Jour 5)
 * - Méthodes avec throws (Jour 5)
 * - Polymorphisme dans les affichages (Jour 3)
 * - static final pour la taille max (Jour 2)
 *
 * Stockage avec HashMap :
 * - HashMap<String, Etudiant>    → clé = email
 * - HashMap<String, Enseignant>  → clé = email
 * - HashMap<String, Formation>   → clé = code
 */
public class SchoolManager {

    // TODO : Déclarer les HashMap
    //        private HashMap<String, Etudiant> etudiants;
    //        private HashMap<String, Enseignant> enseignants;
    //        private HashMap<String, Formation> formations;

    // TODO : Créer le constructeur
    //        Initialiser les 3 HashMap vides

    // ==========================================
    //  AJOUTER
    // ==========================================

    // TODO : ajouterEtudiant(Etudiant etudiant)
    //        - Vérifier si l'email existe déjà : containsKey(email)
    //        - Si oui → afficher "Étudiant déjà existant"
    //        - Si non → put(email, etudiant) + message succès

    // TODO : ajouterEnseignant(Enseignant enseignant)
    //        Même logique que ajouterEtudiant

    // TODO : ajouterFormation(Formation formation)
    //        Clé = code de la formation

    // ==========================================
    //  AFFICHER
    // ==========================================

    // TODO : afficherEtudiants()
    //        - Vérifier si la map est vide : isEmpty()
    //        - Parcourir avec : for (Etudiant e : etudiants.values())
    //        - Appeler afficherRole() sur chaque étudiant (polymorphisme)
    //        - Afficher le total : size()

    // TODO : afficherEnseignants()
    //        Même logique

    // TODO : afficherFormations()
    //        Parcourir et appeler afficherDetails() (interface Affichable)

    // ==========================================
    //  RECHERCHER
    // ==========================================

    // TODO : rechercherEtudiant(String nom)
    //        - Parcourir etudiants.values()
    //        - Comparer avec equalsIgnoreCase() (Jour 2 — String)
    //        - Afficher les résultats ou "Aucun trouvé"

    // ==========================================
    //  SUPPRIMER
    // ==========================================

    // TODO : supprimerEtudiant(String email)
    //        - Vérifier si l'email existe : containsKey(email)
    //        - Si oui → remove(email) + message succès
    //        - Si non → message "Étudiant non trouvé"

    // ==========================================
    //  MODIFIER
    // ==========================================

    // TODO : modifierMoyenneEtudiant(String email, double nouvelleMoyenne)
    //            throws NoteInvalideException
    //        - Récupérer l'étudiant : get(email)
    //        - Appeler setMoyenne() (peut lancer NoteInvalideException)
    //        - Si email non trouvé → message erreur

    // ==========================================
    //  STATISTIQUES
    // ==========================================

    // TODO : afficherStatistiques()
    //        - Nombre total d'étudiants, enseignants, formations
    //        - Nombre de personnes créées (Personne.getNombrePersonnes())
    //        - Moyenne des moyennes des étudiants (boucle + calcul)
    //        - Nombre d'étudiants admis (estAdmis())

    // ==========================================
    //  NOTIFICATIONS
    // ==========================================

    // TODO : envoyerNotificationATous(String message)
    //        - Parcourir étudiants et enseignants
    //        - Appeler envoyerNotification(message) sur chacun (interface Notifiable)

}
