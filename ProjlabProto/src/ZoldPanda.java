//AKOS
public class ZoldPanda extends Panda{
	
	@Override
	public void AffectedByFotel(Fotel f){
		this.Lepihen(f);	
	}
	
	public void Lepihen(Fotel f){
		f.SetActivity(true);
		this.Die();
	}
	
	@Override
	public void AffectedByJatekgep(JatekGep j) {}
}
