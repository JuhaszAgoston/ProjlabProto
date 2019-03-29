//  PETI
//  PETI
public abstract class Elem {

	protected Csempe position;
	
	abstract public void CollideWithOrangutan(Orangutan o);
	
	abstract public void AffectedByJatekgep(JatekGep j);
	
	abstract public void AffectedByCsokiautomata(CsokiAutomata csa);
	
	abstract public void AffectedByFotel(Fotel f);

	public Csempe GetPosition() {
		return position;
	}

	public void SetPosition(Csempe position) {
		this.position = position;
	}
}
