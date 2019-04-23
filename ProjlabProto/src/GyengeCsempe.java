// AKOS
public class GyengeCsempe extends Csempe{

	private int life;

	public int GetLife() {
		return life;
	}

	public void SetLife(int life) {
		this.life = life;
	}

	public void Damage (MozgoElem m) {
		if(life > 0) { 
			m.Move(this);
			life--;
		}
		else {
			m.Die();
		}
	}

	@Override
	public void SteppedOnByOrangutan (Orangutan o) {
		if (!this.HasElem()) {
			this.Damage(o);
		}
	}
	
	@Override
	public void SteppedOnByPanda (Panda p) {
		if (!this.HasElem()) {
			this.Damage(p);
		}
	}	
}
