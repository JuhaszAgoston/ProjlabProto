// AGO
// AGO
public abstract class Panda extends MozgoElem {
	private boolean free = true;
	protected Orangutan leader;

	public boolean IsFree() {
		if (free == true) {
			return true;
		} else {
			return false;
		}
	}

	public void Step() {
		for (Csempe szomszed : this.position.neighbours) {
			boolean f = szomszed.IsPandaSteppable();
			if (f == true) {
				szomszed.SetElem(this);
				this.SetPosition(szomszed);
				this.position.RemoveElem();
			}
		}
	}

	public void CollideWithOrangutan(Orangutan o) {
		boolean f = this.IsFree();
		if (f == true) {
			o.AddPandaToSor(this);
		} else
			o.Die();

	}

	public void SetFree(boolean b) {
		free = b;
	}

	@Override
	public void Die() {
		/*this.position.SetElem(null);
		this.SetPosition(null);
		this.leader.RemovePandaFromSor(this);
		this.leader = null; // ?*/
	}

	@Override
	public void Move(Csempe cs) {
		// cs.Damage();
		cs.SetElem(this);
		this.SetPosition(cs);

	}

	@Override
	public void AffectedByJatekgep(JatekGep j) {
		// TODO Auto-generated method stub

	}

	@Override
	public void AffectedByCsokiautomata(CsokiAutomata csa) {
		// TODO Auto-generated method stub

	}

	@Override
	public void AffectedByFotel(Fotel f) {

	}

	public void SetLeader(Orangutan o) {
		leader = o;
	}
}