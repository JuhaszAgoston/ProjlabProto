//  Gabor
public abstract class Elem {
	/*EZ MIÉRT PROTECTED?*/
	protected Csempe position;
	
	
	
	abstract public void CollideWithOrangutan(Orangutan o);
	abstract public void AffectedByJatekgep(JatekGep j);
	abstract public void AffectedByCsokiautomata(CsokiAutomata csa);
	abstract public void AffectedByFotel(Fotel f);

	//x,y miatt irtam at return type csempe es return position;-rol erre
	public int[] GetPosition() {
		int[] pos = new int[2];
		pos[1] = position.getPosX();
		pos[2] =  position.getPosY();
		return pos;
	}

	//setter x es y koordinitakmiatt ez lett
	public void SetPosition(Csempe position) {
		this.position.setPosX(position.getPosX());
		this.position.setPosY(position.getPosY());
	}
}
