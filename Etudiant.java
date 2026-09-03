/**
 * ============================================
 *  PROJET JOUR 4 — Etudiant (squelette)
 * ============================================
 *
 * Hérite de Personne, implémente Notifiable.
 *
 * Concepts utilisés :
 * -------------------
 * - Héritage : extends Personne (Jour 3)
 * - Interface : implements Notifiable (Jour 3)
 * - super() dans le constructeur (Jour 3)
 * - @Override (Jour 3)
 * - throws NoteInvalideException (Jour 5 — checked exception)
 * - StringBuilder pour toString() (Jour 2)
 * - Conditions dans estAdmis() (Jour 1)
 *
 * Attributs supplémentaires :
 * - niveau (String)
 * - moyenne (double)
 */
public class Etudiant extends Personne implements Notifiable {

    // TODO : Déclarer les attributs (private)

    // TODO : Créer le constructeur
    //        Paramètres : nom, prenom, email, niveau, moyenne
    //        - Appeler super(nom, prenom, email)
    //        - Valider la moyenne (0-20), sinon throw NoteInvalideException
    //          Attention : le constructeur doit déclarer "throws NoteInvalideException"

    // TODO : Redéfinir afficherRole() avec @Override
    //        Afficher : [ÉTUDIANT], nom, prenom, email, niveau, moyenne

    // TODO : Implémenter envoyerNotification(String message) de Notifiable
    //        Afficher : "📧 Notification pour [nom] : [message]"

    // TODO : Créer une méthode estAdmis()
    //        Retourne true si moyenne >= 10, false sinon (Jour 1 — conditions)

    // TODO : Créer les getters (niveau, moyenne)

    // TODO : Créer setMoyenne(double moyenne) throws NoteInvalideException
    //        Si moyenne < 0 ou > 20 → throw new NoteInvalideException(moyenne)
    //        Sinon → affecter la valeur

    // TODO : Redéfinir toString() avec @Override
    //        Utiliser StringBuilder (Jour 2)
    //        Retourner : "Etudiant{nom=X, prenom=X, niveau=X, moyenne=X}"

}
