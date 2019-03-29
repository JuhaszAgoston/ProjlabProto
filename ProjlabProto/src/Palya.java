//  PETI
//  PETI
import java.util.List;
import java.util.ArrayList;

public class Palya {

	private static ArrayList<Panda> pandalist = new ArrayList<>();
	private static ArrayList<Orangutan> jatekosok = new ArrayList<>();

	private static int orangutan_life;

	ArrayList<Csempe> tiles = new ArrayList<>();

	private static Bejarat bejarat;

	private static Kijarat kijarat;
	
	
	public static void NewOrangutan(Orangutan o) {
		System.out.println("NewOrangutan");
		orangutan_life--;
		bejarat.SetElem(o);
		o.SetPosition(bejarat);
	}
	
	public void NewPanda() {
		// nincs ra teszt, nincs implementalva
		
		//random generaljunk 1-3ig hogy milyen szinut dobunk, 
		//tileson keresunk egy olyat ahol ispandasteppable true, es hivunk egy moveot arra a csempere
		
	}
	
	public static  void RemoveFromList(Panda p) {
		
	}
	
	public static void OrangutanKilep(Orangutan o) {
		
	}

	private static void GameOver() {
		// TODO Auto-generated method stub

	}

	public List<Csempe> getTiles() {
		return tiles;
	}

	public void setTiles(Csempe tile) {
		this.tiles.add(tile);
	}
}
