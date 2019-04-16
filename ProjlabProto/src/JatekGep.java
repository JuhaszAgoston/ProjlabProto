//AKOS
public class JatekGep extends FixElem{
	/*EZ SIPOL VOLT VALAMIERT*/
	public void Csilingel(Panda p){
		for(Csempe cs : this.GetPosition().neighbours) {
			cs.GetElem().AffectedByJatekgep(this);
		}
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
