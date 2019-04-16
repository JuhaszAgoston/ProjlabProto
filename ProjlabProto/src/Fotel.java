//AKOS
public class Fotel extends FixElem{
	
	public void Fotelkodik(Panda p){
		for(Csempe cs : this.GetPosition().neighbours) {
			if(this.GetActivity()) {
			cs.GetElem().AffectedByFotel(this);/*p.AffectedByFotel(this); - HELYETT*/
			}
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
