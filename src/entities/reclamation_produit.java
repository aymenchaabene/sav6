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
public class reclamation_produit {
    
    private int id_reclamation_produit;
    private String nom;
    private String prenom;
    private int num;
    private String e_mail;
    private String nom_produit;    
    private String description;
    private boolean état;
    private int id_user;

    public reclamation_produit() {
    }

    public reclamation_produit(int id_reclamation_produit, String nom, String prenom, int num, String e_mail, String nom_produit, String description) {
        this.id_reclamation_produit = id_reclamation_produit;
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.e_mail = e_mail;
        this.nom_produit = nom_produit;
        this.description = description;
    }

    public reclamation_produit(String nom, String prenom, int num, String e_mail, String nom_produit, String description) {
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.e_mail = e_mail;
        this.nom_produit = nom_produit;
        this.description = description;
    }

    public reclamation_produit(int id_reclamation_produit, String nom, String prenom, int num, String e_mail, String nom_produit, String description, boolean état) {
        this.id_reclamation_produit = id_reclamation_produit;
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.e_mail = e_mail;
        this.nom_produit = nom_produit;
        this.description = description;
        this.état = état;
    }

    public reclamation_produit(int id_reclamation_produit, String nom, String prenom, int num, String e_mail, String nom_produit, String description, boolean état, int id_user) {
        this.id_reclamation_produit = id_reclamation_produit;
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.e_mail = e_mail;
        this.nom_produit = nom_produit;
        this.description = description;
        this.état = état;
        this.id_user = id_user;
    }

    public reclamation_produit(String nom, String prenom, int num, String e_mail, String nom_produit, String description, boolean état, int id_user) {
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.e_mail = e_mail;
        this.nom_produit = nom_produit;
        this.description = description;
        this.état = état;
        this.id_user = id_user;
    }

    public reclamation_produit(String nom, String prenom, int num, String e_mail, String nom_produit, String description, int i) {
       this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.e_mail = e_mail;
        this.nom_produit = nom_produit;
        this.description = description;
        
        this.id_user = id_user;
    }



    public boolean getÉtat() {
        return état;
    }

    public void setÉtat(boolean état) {
        this.état = état;
    }
    

    public int getId_reclamation_produit() {
        return id_reclamation_produit;
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

    public String getNom_produit() {
        return nom_produit;
    }

    public String getDescription() {
        return description;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_reclamation_produit(int id_reclamation_produit) {
        this.id_reclamation_produit = id_reclamation_produit;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
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

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public void setDescription(String description) {
        this.description = description;
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
                 + "Nom Produit= "
                + "" + nom_produit+Newligne
                 + "Description= "
                + "" + description+Newligne
                 + "Etat= "
                + "" + état+Newligne;
                
    }
    

    
    
}
