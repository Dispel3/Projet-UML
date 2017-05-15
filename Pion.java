//import com.modeliosoft.modelio.javadesigner.annotations.objid;
public class Pion extends Piece 
{

	public void mouvementPiece(int x,int y) 
	{
	}

	public void promotion()
	{
	}

	public Pion(String couleur)
	{
        	super(couleur,"");
        	if(couleur == "BLANC")
        		super.setSymbole("PION_BLANC");
        	else
        		super.setSymbole("PION_NOIR");
        	
        	/*	
            		super.setSymbole(Character.toString((char)SYMB_PION_B));
        	else
            		super.setSymbole(Character.toString((char)SYMB_PION_N));
           */
	}

}
