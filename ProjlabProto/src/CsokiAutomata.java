//AKOS
public class CsokiAutomata extends FixElem{
	/*EZ CSILINGEL VOLT EDDIG VALAMIÉRT*/
	public void Sipol(Panda p){
		p.AffectedByCsokiautomata(this);
	}

	@Override
	public void CollideWithOrangutan(Orangutan o) {}

	@Override
	public void AffectedByJatekgep(JatekGep j) {}

	@Override
	public void AffectedByCsokiautomata(CsokiAutomata csa) {}

	@Override
	public void AffectedByFotel(Fotel f) {}
}
