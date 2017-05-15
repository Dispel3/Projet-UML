import java.util.*;

public class Joueur extends Partie
{
	private String CouleurPions;
	private String Nom;
	public List<Piece> Piece = new ArrayList<Piece>(); 

	public Joueur(String nom, String couleur)
	{
			this.Nom = nom;
			this.CouleurPions = couleur;
	}
	
	public void bougerPiece(Piece p,int x,int y)
	{
		if( super.testMouvement())
		{
			System.out.println("Déplacment Valide");
			p.mouvementPiece(x,y);
		}
		else
		{
			System.out.println("Déplacement Invalide");
		}	
	}
							
	public void abandonnerPartie()
	{  											
		System.out.println("FIN DE LA PARTIE");
		return;
	}
    
	public String getNom()
	{
		return this.Nom;
	}

	public void setNom(String value) 
	{
		this.Nom = value;
	}
	public String toString()
	{
		return "CouleurPions" + this.CouleurPions + "Nom" +this.Nom +"\n";
	}
}
