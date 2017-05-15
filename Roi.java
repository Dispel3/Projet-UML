public class Roi extends Piece
{


	public Roi(String couleur)
	{
	    super(couleur,"");
	    if(couleur == "BLANC")
	        super.setSymbole("ROI_BLANC");
	    else
	        super.setSymbole("ROI_NOIR");
	}
	public void mouvementPiece(int x,int y)
	{
	
/*
// déplacement diagonale vers droite
		if ( r-1 == super.rangee && c-1 == super.rangee )
		{
			System.out.println("déplacement non autorisé");
			return;
		}
// déplacement diagonale vers gauche
		else if (r-1 == super.ranger && c+1 == super.rangee) 		
		{
			System.out.println("déplacement non autorisé");
			return;
		}
// déplacement diagonale vers droite et arrière
		else if ( r+1 == super.ranger && c-1 == super.rangee)
		{
			System.out.println("déplacement non autorisé");
			return;

		}
// déplacement diagonale vers gauche et arrière
		else if (r+1 == super.ranger && c+1 == super.rangee)
		{
			System.out.println("déplacement non autorisé");
			return;
		}

// autre déplacement
		if ( r >= super.ranger + 2 || c >= super.rangee + 2 || r >= super.ranger-2 || c <= super.ranger-2)
		{
			System.out.println("déplacement non autorisé");
			return;						
		}

		else
		{
			super.rangee = r;
			super.colonne = c;  
		} 
*/

	}
}
