/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author chabene
 */
public class reclamation_prestation {
    
    private int id_reclamation_prestation;
    private String nom;
    private String prenom;
    private int num;
    private String e_mail;
    private String nom_prestataire;
    private String description;
    private boolean état;
    private int id_user;

    public reclamation_prestation() {
    }

    public reclamation_prestation(int id_reclamation_prestation, String nom, String prenom, int num, String e_mail, String nom_prestataire, String description) {
        this.id_reclamation_prestation = id_reclamation_prestation;
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.e_mail = e_mail;
        this.nom_prestataire = nom_prestataire;
        this.description = description;
    }

    public reclamation_prestation(String nom, String prenom, int num, String e_mail, String nom_prestataire, String description) {
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.e_mail = e_mail;
        this.nom_prestataire = nom_prestataire;
        this.description = description;
    }

    public reclamation_prestation(String nom, String prenom, int num, String e_mail, String nom_prestataire, String description, boolean état) {
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.e_mail = e_mail;
        this.nom_prestataire = nom_prestataire;
        this.description = description;
        this.état = état;
    }

    public reclamation_prestation(String nom, String prenom, int num, String e_mail, String nom_prestataire, String description, boolean état, int id_user) {
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.e_mail = e_mail;
        this.nom_prestataire = nom_prestataire;
        this.description = description;
        this.état = état;
        this.id_user = id_user;
    }

    public reclamation_prestation(int id_reclamation_prestation, String nom, String prenom, int num, String e_mail, String nom_prestataire, String description, boolean état, int id_user) {
        this.id_reclamation_prestation = id_reclamation_prestation;
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.e_mail = e_mail;
        this.nom_prestataire = nom_prestataire;
        this.description = description;
        this.état = état;
        this.id_user = id_user;
    }

    public reclamation_prestation(String nom, String prenom, int num, String e_mail, String nom_prestataire, String description, int id_user) {
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.e_mail = e_mail;
        this.nom_prestataire = nom_prestataire;
        this.description = description;
        this.id_user = id_user;
    }



    public boolean isÉtat() {
        return état;
    }

 

    public void setÉtat(boolean état) {
        this.état = état;
    }

    public int getId_user() {
        return id_user;
    }
    

    public int getId_reclamation_prestation() {
        return id_reclamation_prestation;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNum() {
        return num;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getNom_prestataire() {
        return nom_prestataire;
    }

    public String getDescription() {
        return description;
    }

    public void setId_reclamation_prestation(int id_reclamation_prestation) {
        this.id_reclamation_prestation = id_reclamation_prestation;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setNom_prestataire(String nom_prestataire) {
        this.nom_prestataire = nom_prestataire;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

   String Newligne=System.getProperty("line.separator");
    @Override
    public String toString() {
        return  "Nom= "
                + "" + nom +Newligne
                + " Prénom= "
                + "" + prenom +Newligne
                + " numéro=  "
                + "" + num +Newligne
                + "Email= "
                + "" + e_mail+Newligne
                 + "Nom Prestataire= "
                + "" + nom_prestataire+Newligne
                 + "Description= "
                + "" + description+Newligne
                 + "Etat= "
                + "" + état+Newligne;
                
    }
    
}
