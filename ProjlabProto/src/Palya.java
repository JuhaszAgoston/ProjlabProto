//AKOS
import java.util.List;
import java.util.ArrayList;

public class Palya {
	/*ITT A LĂ�THATĂ“SĂ�GOKNAK LEHET HOGY PUBLICNAK KĂ‰NE LENNIE? MERT EGYES OBJEKTUMOK LĂ�TJĂ�K A PĂ�LYĂ�T*/
	public ArrayList<Panda> pandalist = new ArrayList<>();
	private ArrayList<Orangutan> jatekosok = new ArrayList<>();
	private ArrayList<Csempe> tiles = new ArrayList<>();
	//private static int orangutan_life; --DEPRECATED? TĂ–BB ORĂ�NGUTĂ�N VAN
	private static Bejarat bejarat;
	private static Kijarat kijarat;
	
	//teszt miatt
	String[][] palya = new String[7][7];
	
	public static void NewOrangutan(Orangutan o) {
		//orangutan_life--;//!!!!!!
		bejarat.SetElem(o);
		o.SetPosition(bejarat);
	}
	
	public void NewPanda() {}
	
	public void RemoveFromList(Panda p) {
		this.pandalist.remove(p);
	}
	
	public static void OrangutanKilep(Orangutan o) {
		
	}

	private static void GameOver() {}
	
	public Bejarat getBejarat() {
		return bejarat;
	}
	public void SetBejarat(Bejarat b) {
		bejarat = b;
	}
public Kijarat getKijarat() {
		return kijarat;
	}
	public void SetKijarat(Kijarat k) {
		kijarat = k;
	}

	public List<Csempe> getTiles() {
		return tiles;
	}

	public void setTiles(Csempe tile) {
		this.tiles.add(tile);
	}
	
	public List<Panda> getPandalist() {
		return pandalist;
	}

	public void setPandalist(Panda p) {
		this.pandalist.add(p);
	}
	
	public List<Orangutan> GetPlayerList() {
		return jatekosok;
	}

	public void setPalyerList(Orangutan o) {
		this.jatekosok.add(o);
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
