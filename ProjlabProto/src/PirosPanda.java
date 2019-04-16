//AKOS
public class PirosPanda extends Panda{
	@Override
	public void AffectedByJatekgep(JatekGep j){
		this.Megijed();
	}

	public void Megijed(){
		leader.FreePandaSor(leader.sor.indexOf(this));
		this.leader = null;
	}
}
