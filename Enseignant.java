/**
 * ============================================
 *  PROJET JOUR 4 — Enseignant (squelette)
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
 * - throws SalaireInvalideException (Jour 5 — checked exception)
 * - StringBuilder pour toString() (Jour 2)
 *
 * Attributs supplémentaires :
 * - specialite (String)
 * - salaire (double)
 */
public class Enseignant extends Personne implements Notifiable {

    // TODO : Déclarer les attributs (private)

    // TODO : Créer le constructeur
    //        Paramètres : nom, prenom, email, specialite, salaire
    //        - Appeler super(nom, prenom, email)
    //        - Valider le salaire (>= 0), sinon throw SalaireInvalideException
    //          Attention : le constructeur doit déclarer "throws SalaireInvalideException"

    // TODO : Redéfinir afficherRole() avec @Override
    //        Afficher : [ENSEIGNANT], nom, prenom, email, specialite, salaire

    // TODO : Implémenter envoyerNotification(String message) de Notifiable
    //        Afficher : "📧 Notification pour Prof. [nom] : [message]"

    // TODO : Créer les getters (specialite, salaire)

    // TODO : Créer setSalaire(double salaire) throws SalaireInvalideException
    //        Si salaire < 0 → throw new SalaireInvalideException(salaire)
    //        Sinon → affecter la valeur

    // TODO : Redéfinir toString() avec @Override et StringBuilder

}
