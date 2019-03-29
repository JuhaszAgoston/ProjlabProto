import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//AKOS
//AKOS
public class Orangutan extends MozgoElem {
	
	public ArrayList<Panda> sor = new ArrayList<Panda>();

	public void AddPandaToSor(Panda p) {
		p.SetFree(false);
		Csempe temp = p.GetPosition();
		p.Move(this.GetPosition());
		temp.SetElem(this);
		this.SetPosition(temp);
		// this.GetPosition().SetElem(this);
		p.SetLeader(this);
		sor.add(0,p);
	}

	// public void PandatLeptet (Csempe cs) {}

	public void FreePandaSor(int index) {

		if (sor.isEmpty()) {
			return;
		}

		Iterator<Panda> iter = sor.listIterator(index);
		while (iter.hasNext()) {
			Panda temp = iter.next();
			temp.SetFree(true);
			iter.remove();
		}
		
	}
	public void RemovePandaFromSor(Panda p) {
		//this.FreePandaSor(sor.indexOf(p));
		this.sor.remove(p);
	}

	public void Move(Csempe cs1) {
		cs1.SetElem(this);
		this.SetPosition(cs1);
		this.position.RemoveElem();

	}

	@Override
	public void Die() {
		FreePandaSor(0);

	}

	@Override
	public void CollideWithOrangutan(Orangutan o) {

	}

	@Override
	public void AffectedByJatekgep(JatekGep j) {

	}

	@Override
	public void AffectedByCsokiautomata(CsokiAutomata csa) {

	}

	@Override
	public void AffectedByFotel(Fotel f) {
	}

}