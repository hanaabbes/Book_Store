
public class LigneC {
	
	// les attributs 
private String IdLigneCommande; 
private int quantite; //quantité d'achat 
private Produit produit;
private Commande commande;


    // constructeur

LigneC(String iD, int q , Produit p , Commande c)
{
	this.IdLigneCommande=iD;
	this.quantite=q;
	this.produit =p;
	this.commande=c;
	}

   //getters + setters 

public String getIdLigneCommande() {
	return IdLigneCommande;
}
public void setIdLigneCommande(String idLigneCommande) {
	IdLigneCommande = idLigneCommande;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public Produit getProduit() {
	return produit;
}
public void setProduit(Produit produit) {
	this.produit = produit;
}
public Commande getCommande() {
	return commande;
}
public void setCommande(Commande commande) {
	this.commande = commande;
}
   // les methodes 



public String toString() {
	return "la referance de ligne de commande =" + IdLigneCommande + ", quantite=" + quantite + ", produit=" + produit
			+ ", commande=" + commande +"ayant un prix total est "+calculer(this.produit,this.quantite) ;
}

public double calculer(Produit p, int quantite)
{
    double sum;
    sum= this.quantite* p.getPrix_P();
    return sum;
}

 
}
