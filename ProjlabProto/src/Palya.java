//AKOS
import java.util.List;
import java.util.ArrayList;

public class Palya {
	/*ITT A LĂ�THATĂ“SĂ�GOKNAK LEHET HOGY PUBLICNAK KĂ‰NE LENNIE? MERT EGYES OBJEKTUMOK LĂ�TJĂ�K A PĂ�LYĂ�T*/
	private static ArrayList<Panda> pandalist = new ArrayList<>();
	private static ArrayList<Orangutan> jatekosok = new ArrayList<>();
	private static ArrayList<Csempe> tiles = new ArrayList<>();
	//private static int orangutan_life; --DEPRECATED? TĂ–BB ORĂ�NGUTĂ�N VAN
	private static Bejarat bejarat;
	private static Kijarat kijarat;
	
	//teszt miatt
	String[][] paja = new String[7][7];
	
	public static void NewOrangutan(Orangutan o) {
		//orangutan_life--;//!!!!!!
		bejarat.SetElem(o);
		o.SetPosition(bejarat);
	}
	
	public void NewPanda() {}
	
	public static  void RemoveFromList(Panda p) {}
	
	public static void OrangutanKilep(Orangutan o) {}

	private static void GameOver() {}

	public List<Csempe> getTiles() {
		return tiles;
	}

	public void setTiles(Csempe tile) {
		this.tiles.add(tile);
	}
	
	public Csempe GetATile(int x,int y) {
		for(Csempe cs: this.tiles) {
			int csx = cs.getPosX();
			int csy = cs.getPosY();
			if(csx == x && csy == y)
				return cs;
		}
		return null;
	}
}
