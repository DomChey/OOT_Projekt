package OOT_SS14_DC.Spielkarton;
import OOT_SS14_DC.Spieler.Spieler;
/**
 * 
 * @author Dominik Meixner 1324227
 * @author Deniz Tas 1320360
 * @author Simon Sauerzapf 1320341
 *
 */
public class Spielstein {

	public int indexZeile;
	public Feld feld;
	public int indexSpalte;
	
    public Spieler zugehoerigerSpieler;
    
    public Spielstein() {}
    public Spielstein (Feld feld, Spieler zugehoerigerSpieler){
        this.feld = feld;
        this.zugehoerigerSpieler = zugehoerigerSpieler;
    }
    
    
    
    public Feld[] moeglicheZuege(){
		return null;
        
    }
    
    // Fürs Testen auf Public gestellt
    public void spielsteinBewegen(int zeile, int spalte) {
    	this.indexZeile = zeile;
    	this.indexSpalte = spalte;
    	
    }
}
