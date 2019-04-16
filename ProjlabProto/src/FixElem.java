//AKOS
public abstract class FixElem extends Elem{

	private Boolean active;

	public void SetActivity(Boolean b){
		this.active = b;
	}

	public Boolean GetActivity() {
		return active;
	}
}
