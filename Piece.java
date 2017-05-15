public abstract class Piece implements Variables
{
	private String couleur;
	private int symbole;
	public abstract void mouvementPiece(int x,int y);
	
	public Piece(String c,int s)
	{
		this.couleur = c;
		this.symbole = s;
	}
	public String getCouleur()
	{
		return this.couleur;
	}
	public int getSymbole()
	{
		return this.symbole;
	}
	public void setCouleur(String c)
	{
		this.couleur = c;
	}
	public void setSymbole(int t)
	{
		this.symbole = t;
	}
	public String toString()
	{
		return "couleur: " + this.couleur + " type: "+ this.symbole + "\n";
		
	}
}
