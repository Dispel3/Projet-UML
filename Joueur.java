public class Joueur
{
	private String CouleurPions;
	private String Nom;
	public List<Pièce> pièce = new ArrayList<Pièce> (); 

	public Joueur(String nom, String couleur)
	{
			this.Nom = nom;
			this.CouleurPions = couleur;
	}
	
	public void bougerPiece(int x,int y)
	{
		if( piece.mouvementPiece(x,y) == true)
		{
			System.out.println("Déplacment Valide");
			piece.setOrdonnée(x);
			piece.setAbscisse(y);
		}

		else
		{
			System.out.println("Déplacement Invalide");
		}	
	}
							
	public void abandonnerPartie()
	{  
														
		System.out.println("FIN PARTIE");
		return;
	}
    
	String getNom()
	{
		return this.Nom;
	}

	void setNom(String value) 
	{
		this.Nom = value;
	}
}
