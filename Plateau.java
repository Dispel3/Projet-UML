import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1736dbfd-5b8c-4793-a6a5-075517ea3345")
public class Plateau implements Variables {
    @objid ("52e12e6d-6914-477b-a071-f847c48693bf")
    private List<Case> cadriage = new ArrayList<Case> ();
    
    public Plateau() {
    	initialiser();
    }

    @objid ("4aca89d3-735f-4c81-a67a-2f219c9e386b")
    public void initialiser() {
        Case c;
        for(int x = 0; x<8; x++){
             for(int y = 0; y<8; y++){
                 if(x<2) {
                     if(x%2==0){
                         if(y%2==0)
                             c = new Case(x,y,NOIR,tabPieceN[x*8+y]);
                         else
                            c = new Case(x,y,BLANC,tabPieceN[x*8+y]);
                     }
                     else{
                         if(y%2==1)
                             c = new Case(x,y,BLANC,tabPieceN[x*8+y]);
                         else
                             c = new Case(x,y,NOIR,tabPieceN[x*8+y]);
                     }
                 }
                 
                 else if(x>5) {
                     if(x%2==0){
                         if(y%2==0)
                             c = new Case(x,y,NOIR,tabPieceB[(x-6)*8+y]);
                         else
                            c = new Case(x,y,BLANC,tabPieceB[(x-6)*8+y]);
                     }
                     else{
                         if(y%2==1)
                             c = new Case(x,y,BLANC,tabPieceB[(x-6)*8+y]);
                         else
                             c = new Case(x,y,NOIR,tabPieceB[(x-6)*8+y]);
                     }
                 }
                 
                 else {
                      if(x%2==0){
                         if(y%2==0)
                             c = new Case(x,y,NOIR,null);
                         else
                            c = new Case(x,y,BLANC,null);
                     }
                     else{
                         if(y%2==1)
                            c = new Case(x,y,BLANC,null);
                         else
                             c = new Case(x,y,NOIR,null);
                     }
                 }
                 cadriage.add(c);
             }
        }
    }
    
    public String toString() {
    	String s = "";
    	s = s+"\n_____________________________________";
    	for(int x = 0; x<8; x++) {
    		s = s + "\n|";
    		for(int y = 0; y<8; y++) {
    			if(cadriage.get(x*8+y).getPiece() != null)
    				s = s+"_"+cadriage.get(x*8+y).getPiece().getSymbole()+"_|";
    			else
    				s = s+"____|";
    		}
    	}
        return s;
    }
    


}
