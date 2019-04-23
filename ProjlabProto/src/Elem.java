//  Gabor
public abstract class Elem {
	/*EZ MIÉRT PROTECTED?*/
	protected Csempe position;
	
	private int posX;
	private int posY;
	
	abstract public void CollideWithOrangutan(Orangutan o);
	abstract public void AffectedByJatekgep(JatekGep j);
	abstract public void AffectedByCsokiautomata(CsokiAutomata csa);
	abstract public void AffectedByFotel(Fotel f);

	public Csempe GetPosition() {
		return position;
	}
	
	//x,y miatt irtam at return type csempe es return position;-rol erre
	/*public int[] GetPosition() {
		int[] pos = new int[2];
		pos[1] = position.getPosX();
		pos[2] =  position.getPosY();
		return pos;
	}*/
	
	
 
	//setter x es y koordinitakmiatt ez lett
	public void SetPosition(Csempe position) {
		this.position = position;
		//this.position.setPosX(position.getPosX());
		//this.position.setPosY(position.getPosY());
	}
	

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}
	
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	public void setPosY(int posY) {
		this.posY = posY;
	}
}
