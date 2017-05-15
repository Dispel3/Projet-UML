public class Roi extend Piece
{
	public Piece()
	{
		super();
	}
	public void mouvement(int r,int c)
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
*/
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
	}
	public void actions(Piece p)
	{
		if (p.rangee 	
	}
}
