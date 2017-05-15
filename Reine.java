//import com.modeliosoft.modelio.javadesigner.annotations.objid;

public class Reine extends Piece implements Variables 
{

	public Reine(String couleur)
	{
        	super(couleur,0);
        	if(couleur == super.BLANC)
        			super.setSymbole(super.SYMB_REINE_B);
        	else
        			super.setSymbole(super.SYMB_REINE_N);
        	
          //  		super.setSymbole(Character.toString((char)SYMB_REINE_B));
        //	else
          //  		super.setSymbole(Character.toString((char)SYMB_REINE_N));
    }
    
	public void mouvementPiece(int x,int y)
	{
		System.out.println("*************");
		return;
	}
}
