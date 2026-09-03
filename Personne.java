/**
 * ============================================
 *  PROJET JOUR 4 — Personne (squelette)
 * ============================================
 *
 * Classe abstraite représentant une personne.
 *
 * Concepts utilisés :
 * -------------------
 * - Classe abstraite + méthode abstraite (Jour 3)
 * - protected (Jour 3 — héritage)
 * - static compteur (Jour 2 — static)
 * - final constante (Jour 2 — final)
 * - toString() avec @Override (Jour 2 — String, Jour 3 — override)
 * - Validation avec throw (Jour 5 — exceptions)
 *
 * Attributs :
 * - nom (String)
 * - prenom (String)
 * - email (String)
 *
 * Méthode abstraite :
 * - afficherRole()
 */
public abstract class Personne {

    // TODO : Déclarer une constante final static pour le nombre max de caractères du nom
    //        private static final int NOM_MAX_LENGTH = 50;

    // TODO : Déclarer un compteur static pour compter les personnes créées
    //        private static int compteurPersonnes = 0;

    // TODO : Déclarer les attributs (protected)
    //        nom, prenom, email

    // TODO : Créer le constructeur
    //        - Valider que nom et prenom ne sont pas null ou vides
    //          (sinon throw new IllegalArgumentException)
    //        - Valider que email contient "@"
    //          (sinon throw new IllegalArgumentException)
    //        - Incrémenter le compteur static

    // TODO : Déclarer afficherRole() comme abstraite

    // TODO : Créer les getters (nom, prenom, email)

    // TODO : Créer les setters avec validation
    //        - setNom() : vérifier non null et non vide
    //        - setEmail() : vérifier contient "@"

    // TODO : Créer une méthode static getNombrePersonnes()
    //        qui retourne le compteur

    // TODO : Redéfinir toString() avec @Override
    //        Retourner : "nom prenom (email)"

}
