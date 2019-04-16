//AKOS
public class Szekreny extends FixElem{
	
	private Csempe target;
	
	public void Teleport(Orangutan o){
		this.getTarget().SteppedOnByOrangutan(o);
	}

	@Override
	public void CollideWithOrangutan(Orangutan o) {
		this.Teleport(o);
	}

	@Override
	public void AffectedByJatekgep(JatekGep j) {}

	@Override
	public void AffectedByCsokiautomata(CsokiAutomata csa) {}

	@Override
	public void AffectedByFotel(Fotel f) {}

	public Csempe getTarget() {
		return target;
	}

	public void setTarget(Csempe target) {
		this.target = target;
	}
}
