// AKOS
public class Kijarat extends Csempe{
	
	@Override
	public void SteppedOnByOrangutan (Orangutan o) {
		Kilep(o);
	}

	public void Kilep (Orangutan o) {
		o.Move(this);
		while (!o.sor.isEmpty()) {
			Panda p = o.sor.get(0);
			Csempe cs = p.GetPosition();
			o.RemovePandaFromSor(p);
			for (Panda i: o.sor) {
				Csempe temp = i.GetPosition();
				i.Move(cs);
				cs = temp;
			}
			//Palya.RemoveFromList(p);
		}
		Palya.OrangutanKilep(o);
	}
}
