import com.modeliosoft.modelio.javadesigner.annotations.objid;


public class Fou extends Piece {

	public void mouvementPiece()
	{
	}

	public Fou(String couleur)
	{
		super(couleur);
		if(couleur == BLANC)
			super.setSymbole(Character.toString((char)SYMB_FOU_B));
       		else
                	super.setSymbole(Character.toString((char)SYMB_FOU_N));
    }

}
