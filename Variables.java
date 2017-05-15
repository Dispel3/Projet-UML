import com.modeliosoft.modelio.javadesigner.annotations.objid;


public interface Variables {

	public static final String BLANC = "Blanc";
	public static final String NOIR = "Noir";
	public static final int SYMB_ROI_B = 0x2654;
	public static final int SYMB_REINE_B = 0x2655;
	public static final int SYMB_TOUR_B = 0x2656;
	public static final int SYMB_FOU_B = 0x2657;
	public static final int SYMB_CAVALIER_B = 0x2658;
	public static final int SYMB_PION_B = 0x2659;
	public static final int SYMB_ROI_N = 0x265A;
	public static final int SYMB_REINE_N = 0x265B;
	public static final int SYMB_TOUR_N = 0x265C;
	public static final int SYMB_FOU_N = 0x265D;
	public static final int SYMB_CAVALIER_N = 0x265E;
	public static final int SYMB_PION_N = 0x265F;

	public static final Piece[] tabPieceB = 
	{
    		new Tour(BLANC), new Cavalier(BLANC), new Fou(BLANC),
    		new Reine(BLANC), new Roi(BLANC), 
    		new Fou(BLANC), new Cavalier(BLANC), new Tour(BLANC),
    		new Pion(BLANC), new Pion(BLANC),
    		new Pion(BLANC), new Pion(BLANC),
    		new Pion(BLANC), new Pion(BLANC),
    		new Pion(BLANC), new Pion(BLANC)
	};

	public static final Piece[] tabPieceN = 
	{
    		new Pion(NOIR), new Pion(NOIR),
    		new Pion(NOIR), new Pion(NOIR),
    		new Pion(NOIR), new Pion(NOIR),
    		new Pion(NOIR), new Pion(NOIR),
    		new Tour(NOIR), new Cavalier(NOIR), new Fou(NOIR), 
    		new Reine(NOIR), new Roi(NOIR), 
    		new Fou(NOIR), new Cavalier(NOIR), new Tour(NOIR)
	};


/*public static final Fou FOU_BLANC = new Fou(BLANC);
    public static final Fou FOU_NOIR = new Fou(NOIR);
    
    public static final Dame DAME_BLANC = new Dame(BLANC);
    public static final Dame DAME_NOIR = new Dame(NOIR);

    public static final Pion PION_BLANC = new Dame(BLANC);
    public static final Dame PION_NOIR = new Dame(NOIR);*/
}
