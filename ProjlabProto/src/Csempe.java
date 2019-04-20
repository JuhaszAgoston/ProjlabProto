//  AKOS
// GABOR x,y valtoztatas
import java.util.ArrayList;
import java.util.List;

public class Csempe {

	ArrayList<Csempe> neighbours = new ArrayList<>();
	private Elem e = null;
	
	//sakktabla miatt kell kesobb ki lehet szedni
	private int posX;
	private int posY;

	
	
	public List<Csempe> GetNeighbour() {
		return neighbours;
	}

	public void RemoveElem() {
		e = null;
	}

	public boolean IsPandaSteppable() {
		if(!(this.HasElem())) {
			return true;
		}
		else {
			return false;
			}
	}

	public void SteppedOnByOrangutan(Orangutan o) {
		if(this.HasElem()) { 
			e.CollideWithOrangutan(o);
		}
		else {
			o.Move(this);
		}
	}
	
	public boolean HasElem() {
		if(e != null) {
			return true;
			}
		else {return false;}
		}

	public void SteppedOnByPanda(Panda p) {

	}

	public void Damage(MozgoElem m) {
		/*DO NOTHING HERE*/
	}

	public void AddNeighbour(Csempe cs) {
		neighbours.add(cs);
	}

	public Elem GetElem() {
		return e;
	}

	public void SetElem(Elem e) {
		this.e = e;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
}
