public abstract class Piece implements Variables
{
	private String couleur;
	private String symbole;

	public abstract void mouvementPiece();
	
	public Piece()
	{


	}

	public abstract mouvement() {};
	public abstract actions() {};

	public String getCouleur()
	{
		return this.couleur;
	}
	public String getSymbole()
	{
		return this.symbole;
	}
	public void setCouleur(String c)
	{
		this.couleur = c;
	}
	public void setSymbole(String t)
	{
		this.symbole = t;
	}
	public String toString()
	{
		return "rangee: " + this.rangee + "colonne: " + this.colonne + "couleur: "+this.couleur + " type: "+ this.symbole + "\n";
		
	}
}
