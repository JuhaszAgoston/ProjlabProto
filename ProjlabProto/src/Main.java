//Gabor
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void createMapFromArray(String[][] map, Palya p) {

		//feltoltunk egy palyat 7x7 csempevel
		for (int i = 0; i < 7; ++i) {
			for(int j = 0; j < 7; ++j) {
				String s = map[i][j];
				switch(s) {
					case "cs":
						Csempe cs = new Csempe();
						cs.setPosX(j);
						cs.setPosY(i);
						p.setTiles(cs);
						p.paja[i][j] = map[i][j];
						break;
						
					case "BE":
						Bejarat be = new Bejarat();
						be.setPosX(j);
						be.setPosY(i);
						p.setTiles(be);
						p.paja[i][j] = map[i][j];
						break;
						
					case "KI":
						Kijarat ki = new Kijarat();
						ki.setPosX(j);
						ki.setPosY(i);
						p.setTiles(ki);
						p.paja[i][j] = map[i][j];
						break;
						
					case "JT":
						Csempe jcs = new Csempe();
						JatekGep jt = new JatekGep();
						jcs.setPosX(j);
						jcs.setPosY(i);
						jcs.SetElem(jt);
						jt.SetPosition(jcs);
						p.setTiles(jcs);
						p.paja[i][j] = map[i][j];
						break;
						
					case "FE":
						Csempe fcs = new Csempe();
						Fotel f = new Fotel();
						fcs.setPosX(j);
						fcs.setPosY(i);
						fcs.SetElem(f);
						f.SetPosition(fcs);
						p.setTiles(fcs);
						p.paja[i][j] = map[i][j];
						break;
						
					case "AU":
						Csempe aucs = new Csempe();
						CsokiAutomata csau = new CsokiAutomata();
						aucs.setPosX(j);
						aucs.setPosY(i);
						aucs.SetElem(csau);
						csau.SetPosition(aucs);
						p.setTiles(aucs);
						p.paja[i][j] = map[i][j];
						break;
						
					case "O1":
					case "O2":
					case "O3":
						Csempe ocs = new Csempe();
						Orangutan o = new Orangutan();
						ocs.setPosX(j);
						ocs.setPosY(i);
						ocs.SetElem(o);
						o.SetPosition(ocs);  
						
						o.setPosX(ocs.getPosX());
						o.setPosY(ocs.getPosY());
						p.setTiles(ocs);
						p.paja[i][j] = map[i][j];
						break;
						
					case "P0":
					case "P1":
					case "P2":
						Csempe pcs = new Csempe();
						PirosPanda pp = new PirosPanda();
						pcs.setPosX(j);
						pcs.setPosY(i);
						pcs.SetElem(pp);
						pp.SetPosition(pcs);  
						
					    pp.setPosX(pcs.getPosX());
						pp.setPosY(pcs.getPosY());
						p.setTiles(pcs);
						p.paja[i][j] = map[i][j];
						break;
						
					case "K0":
					case "K1":
					case "K2":
						Csempe kcs = new Csempe();
						KekPanda kp = new KekPanda();
						kcs.setPosX(j);
						kcs.setPosY(i);
						kcs.SetElem(kp);
						kp.SetPosition(kcs);  
						
					    kp.setPosX(kcs.getPosX());
						kp.setPosY(kcs.getPosY());
						p.setTiles(kcs);
						p.paja[i][j] = map[i][j];
						break;
						
					case "Z0":
					case "Z1":
					case "Z2":
						Csempe zcs = new Csempe();
						ZoldPanda zp = new ZoldPanda();
						zcs.setPosX(j);
						zcs.setPosY(i);
						zcs.SetElem(zp);
						zp.SetPosition(zcs);  

					    zp.setPosX(zcs.getPosX());
						zp.setPosY(zcs.getPosY());
						p.setTiles(zcs);
						p.paja[i][j] = map[i][j];
						break;

					case "S0":
					case "S1":
					case "S2":
						Csempe scs = new Csempe();
						Szekreny sz = new Szekreny();
						scs.setPosX(j);
						scs.setPosY(i);
						scs.SetElem(sz);
						sz.SetPosition(scs);  
						
					    sz.setPosX(scs.getPosX());
						sz.setPosY(scs.getPosY());
						p.setTiles(scs);
						p.paja[i][j] = map[i][j];
						break;
						//
					//ezt meg ki kell talalni hogy linkeljuk ossze a szekrennyel
					//pl. mi van ha elobb van egy target es meg nincs meg a szekreny?
					case "T0":
					case "T1":
					case "T2":
						Csempe target = new Csempe();
						target.setPosX(j);
						target.setPosY(i);
						p.setTiles(target);
						p.paja[i][j] = map[i][j];
						break;
						
					case "G1":
						GyengeCsempe gycs1 = new GyengeCsempe();
						gycs1.setPosX(j);
						gycs1.setPosY(i);
						gycs1.SetLife(1);
						p.setTiles(gycs1);
						p.paja[i][j] = map[i][j];
						break;
						
					case "G2":
						GyengeCsempe gycs2 = new GyengeCsempe();
						gycs2.setPosX(j);
						gycs2.setPosY(i);
						gycs2.SetLife(2);
						p.setTiles(gycs2);
						p.paja[i][j] = map[i][j];
						break;
						
					case "G9":
						GyengeCsempe gycs9 = new GyengeCsempe();
						gycs9.setPosX(j);
						gycs9.setPosY(i);
						gycs9.SetLife(10);
						p.setTiles(gycs9);
						p.paja[i][j] = map[i][j];
						break;
						
						
					default:
						break;
				}
			}
		}
		
		// osszelinkeljuk a szomszedokat
		for(Csempe cs: p.getTiles()) {
			int x = cs.getPosX();
			int y = cs.getPosY();
			
			cs.AddNeighbour(p.GetATile(x-1, y));
			cs.AddNeighbour(p.GetATile(x+1, y));
			cs.AddNeighbour(p.GetATile(x, y-1));
			cs.AddNeighbour(p.GetATile(x, y+1));
			
		}
		
	}

	
	public static String[][] ReadMapFile(String filename) throws FileNotFoundException {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(new File(filename));
		int lineNum = 7; int columnNum = 7;
		String[][] result = new String[lineNum][columnNum];
		List<String[]> lines = new ArrayList<>();
		while(in.hasNextLine()) {
		    String line = in.nextLine().trim();
		    String[] split = line.split(" ");
		    lines.add(split);
		}
		for(int i = 0; i < result.length; i++) {
		    result[i] = lines.get(i);
		}
		return result;
	}
	
	public static void DisplayMapFile(String[][] a) {
		for (int i = 0; i < 7; ++i) {
			for(int j = 0; j < 7; ++j) {
				System.out.print(a[i][j]); System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	public static void TesztCheck(String [][] a, String [][] b) {
		for (int i = 0; i < 7; ++i) {
			for(int j = 0; j < 7; ++j) {
				if(!a[i][j].equals(b[i][j])) {
					System.out.println("A teszt elbukott (" + i + " ; " + j + ") pontban.");
					return; // ha nem egyezik a ket matrix barmelyik pontja ki kell lepnunk
				}
			}
		}
		System.out.println("A teszt sikeres"); // ide csak akkor jutunk el ha vegigfutottunk a teljes matrixon
	}
	
	

	public static void Teszt1() throws FileNotFoundException {
		/*ReadMapFile kódrészlet*/
		String[][] input = ReadMapFile("input01.txt");
		String[][] output = ReadMapFile("output01.txt");
		/*Pályalétrehozó kódrészlet*/
		Palya p = new Palya();
		createMapFromArray(input, p);
		/*Lépés fv*/
		//lepunk es korrigaljuk a p.paja-t
		/*TesztCheck kódrészlet*/
		TesztCheck(output, p.paja);
	}

	public static void Teszt2() {
		
	}

	public static void Teszt3() {

	}

	public static void Teszt4() {

	}

	public static void Teszt5() {

	}

	public static void Teszt6() {

	}

	public static void Teszt7() {

	}

	public static void Teszt8() {
		
	}

	public static void Teszt9() {
		
	}

	public static void Teszt10() {

	}

	public static void Teszt11() {
		
	}

	public static void Teszt12() {

	}

	public static void Teszt13() {

	}

	public static void Teszt14() {

	}

	public static void Teszt15() {
	
	}
	public static void menuPrint() {
		System.out.println("A tesztesetek:");
		System.out.println(" 1. Orangutan mozgasa szabad csempere.");
		System.out.println(" 2. Orangutan mozog gyenge csempere, aminek meg van egynel tobb elete.");
		System.out.println(" 3. Orangutan mozog gyenge csempere ami eltorik (sor nelkul).");
		System.out.println(" 4. Orangutan mozog gyenge csempere es az eltorik (ket elemu sorral).");
		System.out.println(" 5. Panda mozog gyenge csempere es az eltorik.");
		System.out.println(" 6. Orangutan pandaval talalkozik, ami szabad.");
		System.out.println(" 7. Zold Panda mozog fotel mellett.");
		System.out.println(" 8. Piros Panda mozog jatekgep mellett.");
		System.out.println(" 9. Kek Panda mozog csokiautomata mellett.");
		System.out.println("10. Orangutan szekrenyen atlep.");
		System.out.println("11. Orangutan kilep a kijaraton ket Pandaval.");
		System.out.println("12. Orangutan Pandaval talalkozik ami nem szabad.");
		System.out.println("13. Panda onalloan mozog (Step).");
		System.out.println("14. Orangutan masik Orangutannal talalkozik akinek elveszi a sorat.");
		System.out.println("15. Orangutan masik Orangutannal talalkozik akinek nem veheti el a sorat.");

	}

	public static void main(String[] args) throws IOException {

		System.out.println("INPUT");
		String[][] a = ReadMapFile("input01.txt");
		DisplayMapFile(a);
		
		//String[][] b = ReadMapFile("input02.txt");
		System.out.println("OUTPUT");
		String[][] output = ReadMapFile("output01.txt");
		DisplayMapFile(output);
		
		Palya p = new Palya();
		createMapFromArray(a, p);
	
		TesztCheck(a, a);
		TesztCheck(a, p.paja);
		
		Scanner in = new Scanner(System.in);
	
		while (true) {
			int menu = in.nextInt();
			switch (menu) {
			case 1:
				// Orangutan mozgasa szabad csempere
				System.out.println("Orangutan mozgasa szabad csempere.\r\n");
				Teszt1();
				System.out.println("----------------------------------\r\n");
				break;
			case 2:
				// Orangutan mozog olyan csempere aminek meg van egynel tobb elete
				System.out.println("Orangutan mozog gyenge csempere, aminek meg van egynel tobb elete.\r\n");
				Teszt2();
				System.out.println("----------------------------------\r\n");
				break;
			case 3:
				// Orangutan mozog gyenge csempere ami eltorik(sor nelkul)
				System.out.println("Orangutan mozog gyenge csempere ami eltorik (sor nelkul).\r\n");
				Teszt3();
				System.out.println("----------------------------------\r\n");
				break;
			case 4:
				// Orangutan mozog gyenge csempere es az eltorik(ket elemu sorral)
				System.out.println("Orangutan mozog gyenge csempere es az eltorik (ket elemu sorral).\r\n");
				Teszt4();
				System.out.println("----------------------------------\r\n");
				break;
			case 5:
				// Panda mozog gyenge csempére és az eltorik
				System.out.println("Panda mozog gyenge csempere es az eltorik.\r\n");
				Teszt5();
				System.out.println("----------------------------------\r\n");
				break;
			case 6:
				// Orangutan pandaval talalkozik, ami szabad
				System.out.println("Orangutan pandaval talalkozik, ami szabad.\r\n");
				Teszt6();
				System.out.println("----------------------------------\r\n");
				break;
			case 7:
				// Zold Panda mozog fotel mellett
				System.out.println("Zold Panda mozog fotel mellett.\r\n");
				Teszt7();
				System.out.println("----------------------------------\r\n");
				break;
			case 8:
				// Piros Panda mozog jatekgep mellett
				System.out.println("Piros Panda mozog jatekgep mellett.\r\n");
				Teszt8();
				System.out.println("----------------------------------\r\n");
				break;
			case 9:
				// Kek Panda mozog csokiautomata mellett
				System.out.println("Kek Panda mozog csokiautomata mellett.\r\n");
				Teszt9();
				System.out.println("----------------------------------\r\n");
				break;
			case 10:
				// Orangutan szekrenyen atlep
				System.out.println("Orangutan szekrenyen atlep.\r\n");
				Teszt10();
				System.out.println("----------------------------------\r\n");
				break;
			case 11:
				// Orangutan kilep a kijaraton ket Pandaval
				System.out.println("Orangutan kilep a kijaraton ket Pandaval.\r\n");
				Teszt11();
				System.out.println("----------------------------------\r\n");
				break;
			case 12:
				// Orangutan Pandaval talalkozik ami nem szabad
				System.out.println("Orangutan Pandaval talalkozik ami nem szabad.\r\n");
				Teszt12();
				System.out.println("----------------------------------\r\n");
				break;
			case 13:
				// Panda onalloan mozog (Step) egyetlen lepheto szomszedos csempere
				System.out.println("Panda onalloan mozog (Step).\r\n");
				Teszt13();
				System.out.println("----------------------------------\r\n");
				break;
			case 14:
				// Orangutan masik Orangutannal talalkozik akinek elveszi a sorat
				System.out.println("Orangutan masik Orangutannal talalkozik akinek elveszi a sorat.\r\n");
				Teszt14();
				System.out.println("----------------------------------\r\n");
				break;
			case 15:
				// Orangutan masik Orangutannal talakozik akinek nem veheti el a sorat
				System.out.println("Orangutan masik Orangutannal talalkozik akinek nem veheti el a sorat.\r\n");
				Teszt15();
				System.out.println("----------------------------------\r\n");
				break;
			default:
				System.exit(0);
			}
		}
	}

}