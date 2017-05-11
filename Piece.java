public class Piece
{
	private int rangee;
	private int colonne;
	private String couleur;
	private String type;
	
	public Piece()
	{


	}

	public abstract mouvement() {};
	public abstract actions() {};

	public String getCouleur()
	{
		return this.couleur;
	}
	public String getType()
	{
		return this.type;
	}
	public void setCouleur(String c)
	{
		this.couleur = c;
	}
	public void setType(String t)
	{
		this.type = t;
	}
}
