//import com.modeliosoft.modelio.javadesigner.annotations.objid;

public class Tour extends Piece {

	public Tour(String couleur)
	{
		super(couleur,"");
        	if(couleur == "TOUR_BLANC")
        		super.setSymbole("TOUR_BLANC");
        	else
        		super.setSymbole("TOUR_NOIR");
       
        	
        	
			//super.setSymbole(Character.toString((char)SYMB_TOUR_B));
        	//else
            //		super.setSymbole(Character.toString((char)SYMB_TOUR_N));
    }
    
	public void mouvementPiece(int x, int y)
	{
	}

	public void rock()
	{
	}


}
