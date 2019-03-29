// GABOR
// GABOR
public class Szekreny extends FixElem{
	private Csempe target;
	
	public void Teleport(Orangutan o)
	{
		this.getTarget().SteppedOnByOrangutan(o);
	}


	@Override
	public void CollideWithOrangutan(Orangutan o) {
		// TODO Auto-generated method stub
		this.Teleport(o);
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
		// TODO Auto-generated method stub
		
	}


	public Csempe getTarget() {
		return target;
	}

	public void setTarget(Csempe target) {
		this.target = target;
	}
}
