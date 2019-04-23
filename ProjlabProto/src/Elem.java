//  Gabor
public abstract class Elem {
	/*EZ MIÉRT PROTECTED?*/
	protected Csempe position;
	
	
	abstract public void CollideWithOrangutan(Orangutan o);
	abstract public void AffectedByJatekgep(JatekGep j);
	abstract public void AffectedByCsokiautomata(CsokiAutomata csa);
	abstract public void AffectedByFotel(Fotel f);

	public Csempe GetPosition() {
		return position;
	}
	

 
	//setter x es y koordinitakmiatt ez lett
	public void SetPosition(Csempe p) {
		position = p;
	}
	

}
