import java.util.*;

public class Partie implements Verifieur
{					
	private String difficulte;
	public ArrayList<Joueur> joueur = new ArrayList<Joueur>();
	public Plateau plateau;
	public Verifieur verifieur;
					
	public Partie()
	{

		super();
		System.out.println("COMMENCEMENT PARTIE");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Saisie nom Joueur 1");
		String nom = input.nextString();
		Joueur j1 = new Joueur(nom,"blanc");

		System.out.println("Saisie nom Joueur 2");
		nom = input.nextString();
		Joueur j2 = new Joueur(nom,"noir");

		Plateau p = new Plateau();
		
		while( this.mat() != true || this.mat() != true )
		{
			System.out.println("MOUVEMENT JOUEUR 1");
			System.out.println("Saisie des coordonnées de la pièce à modifier");
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			// récupération de la pièce sur le plateau
			Piece p1 = this.getPiece(x1,y1);
			
			System.out.println("Saisie des coordonnées du nouvel emplacement");
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			j1.bougerPiece(p1,x2,y2);
			
			System.out.println("MOUVEMENT JOUEUR 2");
			System.out.println("Saisie des coordonnées de la pièce à modifier");
			x1 = input.nextInt();
			y1 = input.nextInt();
			p1 = this.getPiece(x1,y1);
			
			System.out.println("Saisie des coordonnées du nouvel emplacement");
			x2 = input.nextInt();
			y2 = input.nextInt();
			j2.bougerPiece(p1,x2,y2);	
		}
		System.out.println("FIN DE LA PARTIE");		
	}
	
	public Piece getPiece(int x1,int y1) // récupérer la pièce associé 
	{
		Piece p1;
		ArrayList<Case> coll= this.plateau.getListe();

		for (int i = 0; i < coll.size(); i++)
		{
			Case c = (Case) coll.get(i);		
			if (c.getX() == x1 && c.getY() == y1)
			{
				p1 = (Piece) c.getPiece();				
				break;
			}
		}
		return p1;

	}
	
	public String getDifficulte()
	{
		return this.difficulte;
	}
		
	public void setDifficulte(String d)
	{
		this.difficulte = d;
	}
	public String toString()
	{
		return "difficulte: " + this.difficulte + "\n";
	} 	
	
	public boolean testMouvement()
	{
		System.out.println("Mouvement effectué");
		return true;
	}
	public boolean mat()
	{
		return false;	
	}

	public boolean pat()
	{
		return false;
	}
	
	
}
