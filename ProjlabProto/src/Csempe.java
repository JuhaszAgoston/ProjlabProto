//  PETI
//  PETI
import java.util.ArrayList;
import java.util.List;

public class Csempe {

	ArrayList<Csempe> neighbours = new ArrayList<>();

	private Elem e = null; 

	public List<Csempe> GetNeighbour() {

		return this.neighbours;
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

			return false;
		
		}

	public void SteppedOnByPanda(Panda p) {


	}

	public void Damage(MozgoElem m) {

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
}
