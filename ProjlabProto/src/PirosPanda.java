// AGO
// AGO
public class PirosPanda extends Panda{
	@Override
	public void AffectedByJatekgep(JatekGep j)
	{
		this.Megijed();
	}

	public void Megijed()
	{
		//leader.RemovePandaFromSor(this);
		leader.FreePandaSor(leader.sor.indexOf(this));

	}
}
