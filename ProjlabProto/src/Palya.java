//AKOS
import java.util.List;
import java.util.ArrayList;

public class Palya {
	/*ITT A LÁTHATÓSÁGOKNAK LEHET HOGY PUBLICNAK KÉNE LENNIE? MERT EGYES OBJEKTUMOK LÁTJÁK A PÁLYÁT*/
	private static ArrayList<Panda> pandalist = new ArrayList<>();
	private static ArrayList<Orangutan> jatekosok = new ArrayList<>();
	private static ArrayList<Csempe> tiles = new ArrayList<>();
	//private static int orangutan_life; --DEPRECATED? TÖBB ORÁNGUTÁN VAN
	private static Bejarat bejarat;
	private static Kijarat kijarat;
	
	
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
}
