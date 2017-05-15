import java.util.*;

public class Partie extends Verifieur
{					
	private String difficulte;
	public List<Joueur> joueur = new ArrayList<Joueur>();
	public Plateau plateau;
	public Verifieur verifieur;
					
	public Partie()
	{
		System.out.println("COMMENCEMENT PARTIE");

		Scanner input = new Scanner(System.in);
		System.out.println("Saisie nom Joueur 1");
		String nom = input.nextString();
		Joueur j1 = new Joueur(nom,"blanc");

		System.out.println("Saisie nom Joueur 2");
		String nom = input.nextString();
		Joueur j2 = new Joueur(nom,"noir");

		Plateau p = new Plateau();
		
		while( this.pat() != true || this.mat() != true )
		{
			System.out.println("MOUVEMENT JOUEUR 1");
			j1.bouger();
			System.out.println("MOUVEMENT JOUEUR 2");
			j2.bouger();		
		}
		System.out.println("FIN PARTIE");		
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
		return "difficulte: "this.difficulte + "\n";
	} 	
}
