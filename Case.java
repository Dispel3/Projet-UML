//import com.modeliosoft.modelio.javadesigner.annotations.objid;

public class Case implements Variables
{

	private String couleur;
	private int x;
	private int y;
	private Piece piece;

	public String getCouleur()
	{
		return this.couleur;
	}

	public void setCouleur(String value)
	{
		this.couleur = value;
	}

	public int getY()
	{
		return this.y;
  	}

	public void setY(int value)
	{
		this.y = value;
	}

	public int getX()
	{
		return this.x;
	}

	public void setX(int value)
	{
		this.x = value;
	}

	public Case(int x, int y, String couleur) 
	{
 	       this.x = x;
	        this.y = y;
	        this.couleur = couleur;
	}

	public Case(int x, int y, String couleur, Piece piece) 
	{
	        this.x = x;
	        this.y = y;
	        this.couleur = couleur;
	        this.piece = piece;
	}

	public Piece getPiece()
	{
	        return this.piece;
	}

	public void setPiece(Piece value)
	{
	        this.piece = value;
	}
}
