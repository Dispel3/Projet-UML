import com.modeliosoft.modelio.javadesigner.annotations.objid;


public class Reine extends Piece {

	public void mouvementPiece()
	{
	}

	public Reine(String couleur)
	{
        	super(couleur);
        	if(couleur == BLANC)
            		super.setSymbole(Character.toString((char)SYMB_REINE_B));
        	else
            		super.setSymbole(Character.toString((char)SYMB_REINE_N));
    }

}
