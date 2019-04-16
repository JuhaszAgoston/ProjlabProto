//AKOS
public class KekPanda extends Panda{
	
	@Override
	public void AffectedByCsokiautomata(CsokiAutomata csa){
		this.Ugrik();
	}

	public void Ugrik(){
		this.GetPosition().Damage(this);
	}
	
	@Override
	public void AffectedByFotel(Fotel f) {}
	
	@Override
	public void AffectedByJatekgep(JatekGep j) {}
}
