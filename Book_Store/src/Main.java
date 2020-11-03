import java.util.Scanner;

public class Main {
	
		   public static void main(String[] args) {

	     Scanner s = new Scanner(System.in);
	     
	     System.out.println("bienvenu dans notre application console, Merci de choisir votre mode d'utilisation:\n");
	     System.out.println("tapez : 1 pour un administrateur \t OU \t 0 pour un simple utilisateur ");
	     int session = s.nextInt();
			      if(session ==1)
			      {   Administrateur A1 = new Administrateur("admin1", "AA", "bb", "Rue y", "56", "+21654000");
			    	  Utilisateur u1 =new Utilisateur("u01", "A", "B", "Rue x", "123", "+2160000");
			    	  Produit p1 =new Produit("p01", 15, 12, "aa");
			    	  Produit p2 =new Produit("p02", 10, 17, "ab");
			    	  Produit p3 =new Produit("p03", 15, 20, "ac");
			    	  // avant la supp
			    	  A1.ajouter_Produit(p1);
			    	  A1.ajouter_Produit(p2);
			    	  A1.ajouter_Produit(p3);
			    	  A1.ajouter_u(u1);
			    	  A1.afficher_ttProduits();
			    	  
			    	  A1.Supprimer_Produit(p2);
			    	  // apres la supp
			    	  A1.afficher_ttProduits();
			    	  A1.afficher_ttUtilisateurs();
			    	  
			      }
			      else if(session ==0)
			      { 
			    	  //les utilisateurs
			    	  Utilisateur u1 =new Utilisateur("u01", "A", "B", "Rue x", "123", "+2160000");
			    	  Utilisateur u01 =new Utilisateur("u001", "Ab", "Bc", "Rue x1", "1233", "+2160000");
			    	  
			    	  // les produits 
			    	  Produit p1 =new Produit("p01", 15, 12, "aa");
			    	  Produit p2 =new Produit("p02", 10, 17, "ab");
			    	  
			    	  // les commandes 
			    	  Commande c1 = new Commande("c01",0 ); 
			    	  Commande c2 = new Commande("c02",0 ); 
			    	  
			    	  //les commandes par utilisateur
			    	  u1.Ajouter_C(c1);
			    	  u01.Ajouter_C(c2);
			    	  
			    	  //les lignes de commandes 
					  LigneC lc1 = new LigneC("LC01",2, p1, c1);
					  
					  LigneC lc2 = new LigneC("LC02",3, p1, c1);
					  
					  LigneC lc3 = new LigneC("LC02",5, p2, c1);
					  
					  // les lignes de commandes par commande
					  c1.ajouter_ligneCo(lc2);
					  c1.ajouter_ligneCo(lc1);
					  c1.ajouter_ligneCo(lc3);
					 
					  c1.afficher();
					  c2.ajouter_ligneCo(lc3);
					  c2.afficher();
			    	  
			    	  
			      }
		       
		    }


	}


