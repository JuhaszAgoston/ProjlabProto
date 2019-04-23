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
	
	public static void createMapFromArray(String[][] map) {
		Palya p = new Palya();
		
		//tomb feltoltese sima csempekkel
		Csempe[][] csempeArray = new Csempe[7][7]; 
		for (int i = 0; i < 7; ++i) {
			for(int j = 0; j < 7; ++j) {
				//ha ezek a pos ok kellenek...
				csempeArray[i][j].setPosX(i);
				csempeArray[i][j].setPosY(j);
			}
		}
		
		String ch;
		char[] cha = new char[1];
		int num;
		
		for (int i = 0; i < 7; ++i) {
			for(int j = 0; j < 7; ++j) {
				switch(map[i][j]){
					case "cs":
						p.setTiles(csempeArray[i][j]);
						break;
					case "G":
						//splitting to get num
						ch = map[i][j];
						cha = new char[1];
						ch.getChars(1, 1, cha, 0);
						System.out.println(cha + "\r\n");
						num = Integer.parseInt(String.valueOf(cha));
						
						GyengeCsempe gy = new GyengeCsempe();
						gy.setPosX(i);
						gy.setPosY(j);
						gy.SetLife(num);
						p.setTiles(gy);
						break;
					//be es kijaratnal igy a csempeArrayben bent marad a helyukon a csempe, de nem hasznaljuk
					case "BE":
						Bejarat be = new Bejarat();
						be.setPosX(i);
						be.setPosY(j);
						p.setTiles(be);
						break;
					case "KI":
						Kijarat ki = new Kijarat();
						ki.setPosX(i);
						ki.setPosY(j);
						p.setTiles(ki);
						break;
					case "O":
						//splitting to get num
						ch = map[i][j];
						cha = new char[1];
						ch.getChars(1, 1, cha, 0);
						System.out.println(cha + "\r\n");
						String stringCha = cha.toString();
						
						//szamit mi a valtozo neve..?
						//szerintem külön orangutan attributum kéne a kezeléséhez
						Orangutan O = new Orangutan();
						O.SetPosition(csempeArray[i][j]);
						csempeArray[i][j].SetElem(O);
						p.setTiles(csempeArray[i][j]);
						break;
					case "s":
						//splitting to get num
						ch = map[i][j];
						cha = new char[1];
						ch.getChars(1, 1, cha, 0);
						num = Integer.parseInt(String.valueOf(cha));
						Szekreny s = new Szekreny();
						csempeArray[i][j].SetElem(s);
						
						//melyik szekrénynek a kezeléséhez szerintem külön attributum kéne
						p.setTiles(csempeArray[i][j]);
						break;
					case "t":
						//kezelni kell kinek a targetje de ahhoz szerintem kéne az az attributum
						break;
					case "##":
						GyengeCsempe gycs = new GyengeCsempe();
						gycs.SetLife(0);
						gycs.setPosX(i);
						gycs.setPosY(j);
						p.setTiles(gycs);
						break;
					case "au":
						CsokiAutomata csa = new CsokiAutomata();
						csa.SetPosition(csempeArray[i][j]);
						csempeArray[i][j].SetElem(csa);
						p.setTiles(csempeArray[i][j]);
						break;
					case "jt":
						JatekGep jt = new JatekGep();
						jt.SetPosition(csempeArray[i][j]);
						csempeArray[i][j].SetElem(jt);
						p.setTiles(csempeArray[i][j]);
						break;
					case "fe":
						Fotel fe = new Fotel();
						fe.SetPosition(csempeArray[i][j]);
						csempeArray[i][j].SetElem(fe);
						p.setTiles(csempeArray[i][j]);						
						break;
					case "K":
						//leadert/sort allitani kell
						Panda kp = new KekPanda();
						kp.SetPosition(csempeArray[i][j]);
						csempeArray[i][j].SetElem(kp);
						p.setTiles(csempeArray[i][j]);
						break;
					case "P":
						//leadert/sort allitani kell
						Panda pp = new PirosPanda();
						pp.SetPosition(csempeArray[i][j]);
						csempeArray[i][j].SetElem(pp);
						p.setTiles(csempeArray[i][j]);
						break;
					case "Z":
						//leadert/sort allitani kell
						Panda zp = new ZoldPanda();
						zp.SetPosition(csempeArray[i][j]);
						csempeArray[i][j].SetElem(zp);
						p.setTiles(csempeArray[i][j]);
						break;
					default:
						System.exit(0);			
				}
			}
			//System.out.println("");
		}
		//System.out.println("");
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
		for(int i = 0; i<result.length; i++) {
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
	
	

	public static void Teszt1() {
		/*ReadMapFile kÃ³drÃ©szlet*/
		/*PÃ¡lyalÃ©trehozÃ³ kÃ³drÃ©szlet*/
		/*LÃ©pÃ©s fv*/
		/*TesztCheck kÃ³drÃ©szlet*/
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

		String[][] a = ReadMapFile("input01.txt");
		DisplayMapFile(a);
		String[][] b = ReadMapFile("input02.txt");
		DisplayMapFile(b);
		
		TesztCheck(a,a);
		TesztCheck(a,b);
		createMapFromArray(a);
		
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
				// Panda mozog gyenge csempÃ©re Ã©s az eltorik
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