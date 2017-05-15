//import com.modeliosoft.modelio.javadesigner.annotations.objid;


public class Cavalier extends Piece 
{

	public Cavalier(String couleur)
	{
	        super(couleur,"");
	        if(couleur == "BLANC")
	        	super.setSymbole("CAVALIER_BLANC");
	        else
	        	super.setSymbole("CAVALIER_NOIR");
	 
	        /*	super.setSymbole(Character.toString((char)SYMB_CAVALIER_B));
        	else
            		super.setSymbole(Character.toString((char)SYMB_CAVALIER_N)); */
    }

	public void mouvementPiece(int x,int y)
	{
	}

}
