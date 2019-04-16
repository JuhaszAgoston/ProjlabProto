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
	public void SteppedOnByOrangutan (Orangutan o) { //Ezt mondjuk nem írtuk bele a doksiba, de nem szólt be érte
		if (!this.HasElem()) {
			this.Damage(o);
		}
	}
	
	@Override
	public void SteppedOnByPanda (Panda p) { //ezt se
		if (!this.HasElem()) {
			this.Damage(p);
		}
	}	
}
