import com.modeliosoft.modelio.javadesigner.annotations.objid;


public class Tour extends Piece {

	public void mouvementPiece()
	{
	}

	public void rock()
	{
	}

	public Tour(String couleur)
	{
		super(couleur);
        	if(couleur == BLANC)
			super.setSymbole(Character.toString((char)SYMB_TOUR_B));
        	else
            		super.setSymbole(Character.toString((char)SYMB_TOUR_N));
    }

}
