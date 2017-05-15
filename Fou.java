//import com.modeliosoft.modelio.javadesigner.annotations.objid;


public class Fou extends Piece
{

	public void mouvementPiece(int x, int y)
	{
	}

	public Fou(String couleur)
	{
		super(couleur,"");
		if(couleur == "BLANC")
			super.setSymbole("FOU_BLANC");
		else
			super.setSymbole("FOU_NOIR");

		/*
					super.setSymbole(Character.toString((char)SYMB_FOU_B));
       		else
                	super.setSymbole(Character.toString((char)SYMB_FOU_N));
        */
    }

}
