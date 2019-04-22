//AKOS
//GABOR filereader
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	
	private static Scanner in;
	
	public static String[][] readFile(String filename) {
		BufferedReader reader;
		String[][] matrix = new String[100][100];
		try {
			//getting the sizes
			int lineNum = 0;
			int columnNum = 0;
			reader = new BufferedReader(new FileReader("../Inputs/"+filename));
			String lineForSize = reader.readLine();
			String[] attr = lineForSize.split(" ");
			while (lineForSize != null) {
				lineNum++;
				lineForSize = reader.readLine();
			}
			
			System.out.println(lineForSize);
			columnNum = attr.length-2; //getting columnNum cou
			lineNum = lineNum-2; //lines read minus the first and last
			reader.close();
			
			matrix = new String[lineNum][columnNum];
			
			reader = new BufferedReader(new FileReader("../Inputs/"+filename));
			String line = reader.readLine();
			int i = 0;
			while (line != null) {
				//System.out.println(line);
				line = reader.readLine();
				String[] attributes = line.split(" ");
	            
				//getting the first and last line out
				if(attributes[0] == "-" && attributes[1] == "--")
	            {
					//DO NOTHING
					//System.out.println("---\r\n");
	            }else {
	            	//starts from 1 so the first [ symbol is ignored
	            	//ends at length-1 so the last ] symbol is ignored
					for(int j = 0 ; j < attributes.length-1 ; j++){
						matrix[i][j] = attributes[j];
		            	
		            	//adding attributes to the program
		            	//System.out.println(matrix[i][j]+"\r\n");
		            	
		            }
					
					i++;
	            }
				//line = reader.readLine();
				attributes = line.split(" ");
			}
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return matrix;
	}

	public static void Teszt1() {
		// Teszt1 inic
		System.out.println("-------inic------");
		Orangutan o = new Orangutan();
		Csempe cs1 = new Csempe();
		Csempe cs2 = new Csempe();
		cs1.SetElem(o);
		o.SetPosition(cs1);
		cs2.AddNeighbour(cs1);
		cs1.AddNeighbour(cs2);
		// Teszt1 run
		System.out.println("-------run------");
		o.Move(cs2);

	}

	public static void Teszt2() {
		// Teszt2 inic
		System.out.println("-------inic------");
		Orangutan o = new Orangutan();
		JatekGep j = new JatekGep();
		Csempe ocs = new Csempe();
		Csempe jcs = new Csempe();
		ocs.SetElem(o);
		o.SetPosition(ocs);
		jcs.SetElem(j);
		j.SetPosition(jcs);
		ocs.AddNeighbour(jcs);
		jcs.AddNeighbour(ocs);
		// Teszt2 run
		System.out.println("-------run------");
		jcs.SteppedOnByOrangutan(o);

	}

	public static void Teszt3() {
		// Teszt3 inic
		System.out.println("-------inic------");
		Orangutan o = new Orangutan();
		Csempe cs1 = new Csempe();
		GyengeCsempe cs2 = new GyengeCsempe();
		cs1.SetElem(o);
		o.SetPosition(cs1);
		cs2.AddNeighbour(cs1);
		cs1.AddNeighbour(cs2);
		cs2.SetLife(10);
		// Teszt3 run
		System.out.println("-------run------");
		cs2.SteppedOnByOrangutan(o);
	}

	public static void Teszt4() {
		// Teszt4 inic
		System.out.println("-------inic------");
		Orangutan o = new Orangutan();
		Csempe cs1 = new Csempe();
		GyengeCsempe cs2 = new GyengeCsempe();
		cs1.SetElem(o);
		o.SetPosition(cs1);
		cs2.AddNeighbour(cs1);
		cs1.AddNeighbour(cs2);
		cs2.SetLife(0);
		// Teszt4 run
		System.out.println("-------run------");
		cs2.SteppedOnByOrangutan(o);

	}

	public static void Teszt5() {
		// Teszt5 inic
		System.out.println("-------inic------");
		GyengeCsempe gycs = new GyengeCsempe();
		Csempe cs1 = new Csempe();
		Csempe cs2 = new Csempe();
		Csempe cs3 = new Csempe();
		Orangutan o = new Orangutan();
		Panda p1 = new KekPanda();
		Panda p2 = new KekPanda();
		gycs.AddNeighbour(cs1);
		cs1.AddNeighbour(gycs);
		cs1.AddNeighbour(cs2);
		cs2.AddNeighbour(cs1);
		cs2.AddNeighbour(cs3);
		cs3.AddNeighbour(cs2);
		o.SetPosition(cs1);
		cs1.SetElem(o);
		p1.SetPosition(cs2);
		cs2.SetElem(p1);
		p2.SetPosition(cs3);
		cs3.SetElem(p2);
		o.AddPandaToSor(p1);
		o.AddPandaToSor(p2);
		p1.SetLeader(o);
		p2.SetLeader(o);
		gycs.SetLife(0);
		// Teszt5 run
		System.out.println("-------run------");
		gycs.SteppedOnByOrangutan(o);

	}

	public static void Teszt6() {
		// Teszt6 inic
		System.out.println("-------inic------");
		Csempe cs1 = new Csempe();
		GyengeCsempe cs2 = new GyengeCsempe();
		Panda p = new KekPanda();
		cs1.AddNeighbour(cs2);
		cs2.AddNeighbour(cs1);
		cs1.SetElem(p);
		p.SetPosition(cs1);
		cs2.SetLife(0);
		// Teszt6 run
		System.out.println("-------run------");
		cs2.SteppedOnByPanda(p);

	}

	public static void Teszt7() {
		// Teszt7 inic
		System.out.println("-------inic------");
		Csempe cs1 = new Csempe();
		Csempe cs2 = new Csempe();
		Panda p = new KekPanda();
		Orangutan o = new Orangutan();
		cs1.SetElem(p);
		p.SetPosition(cs1);
		cs2.SetElem(o);
		o.SetPosition(cs2);
		p.SetFree(true);
		// Teszt7 run
		System.out.println("-------run------");
		p.CollideWithOrangutan(o);

	}

	public static void Teszt8() {
		// Teszt8 inic
		System.out.println("-------inic------");
		Orangutan o = new Orangutan();
		Szekreny sz = new Szekreny();
		Csempe ocs = new Csempe();
		Csempe szcs = new Csempe();
		Csempe target = new Csempe();
		ocs.SetElem(o);
		o.SetPosition(ocs);
		szcs.SetElem(sz);
		sz.SetPosition(szcs);
		ocs.AddNeighbour(szcs);
		szcs.AddNeighbour(ocs);
		sz.setTarget(target);
		target.SetElem(null);
		// Teszt8 run
		System.out.println("-------run------");
		sz.CollideWithOrangutan(o);

	}

	public static void Teszt9() {
		// Teszt9 inic
		System.out.println("-------inic------");
		Csempe cs1 = new Csempe();
		Csempe cs2 = new Csempe();
		Fotel f = new Fotel();
		Panda zp = new ZoldPanda();
		cs1.AddNeighbour(cs2);
		cs2.AddNeighbour(cs1);
		f.SetPosition(cs1);
		cs1.SetElem(f);
		zp.SetPosition(cs2);
		cs2.SetElem(zp);
		// Teszt9 run
		System.out.println("-------run------");
		zp.AffectedByFotel(f);

	}

	public static void Teszt10() {
		// Teszt10 inic
		System.out.println("-------inic------");
		Csempe cs1 = new Csempe();
		Csempe cs2 = new Csempe();
		JatekGep j = new JatekGep();
		Panda pp = new PirosPanda();
		Orangutan l = new Orangutan();
		Csempe lcs = new Csempe();
		l.SetPosition(lcs);
		lcs.SetElem(l);
		cs1.AddNeighbour(cs2);
		cs2.AddNeighbour(cs1);
		j.SetPosition(cs1);
		cs1.SetElem(j);
		pp.SetPosition(cs2);
		cs2.SetElem(pp);
		pp.SetLeader(l);
		l.AddPandaToSor(pp);
		// Teszt10 run
		System.out.println("-------run------");
		pp.AffectedByJatekgep(j);

	}

	public static void Teszt11() {
		// Teszt11 inic
		System.out.println("-------inic------");
		Csempe cs1 = new Csempe();
		Csempe cs2 = new Csempe();
		CsokiAutomata csa = new CsokiAutomata();
		Panda kp = new KekPanda();
		cs1.AddNeighbour(cs2);
		cs2.AddNeighbour(cs1);
		csa.SetPosition(cs1);
		cs1.SetElem(csa);
		kp.SetPosition(cs2);
		cs2.SetElem(kp);
		// Teszt11 run
		System.out.println("-------run------");
		kp.AffectedByCsokiautomata(csa);;

	}

	public static void Teszt12() {
		// Teszt12 inic
		System.out.println("-------inic------");
		Kijarat k = new Kijarat();
		Bejarat b = new Bejarat();
		Csempe cs1 = new Csempe();
		Csempe cs2 = new Csempe();
		Csempe cs3 = new Csempe();
		Orangutan o = new Orangutan();
		Panda p1 = new KekPanda();
		Panda p2 = new KekPanda();
		k.AddNeighbour(cs1);
		cs1.AddNeighbour(k);
		cs1.AddNeighbour(cs2);
		cs2.AddNeighbour(cs1);
		cs2.AddNeighbour(cs3);
		cs3.AddNeighbour(cs2);
		o.SetPosition(cs1);
		cs1.SetElem(o);
		p1.SetPosition(cs2);
		cs2.SetElem(p1);
		p2.SetPosition(cs3);
		cs3.SetElem(p2);
		o.AddPandaToSor(p1);
		o.AddPandaToSor(p2);
		p1.SetLeader(o);
		p2.SetLeader(o);
		// Teszt12 run
		System.out.println("-------run------");
		k.SteppedOnByOrangutan(o);

	}

	public static void Teszt13() {
		// Teszt13 inic
		System.out.println("-------inic------");
		Csempe cs1 = new Csempe();
		Csempe cs2 = new Csempe();
		Orangutan o = new Orangutan();
		Panda p1 = new KekPanda();
		cs1.AddNeighbour(cs2);
		cs2.AddNeighbour(cs1);
		cs1.SetElem(o);
		o.SetPosition(cs1);
		p1.SetPosition(cs2);
		cs2.SetElem(p1);
		o.AddPandaToSor(p1);
		// Teszt13 run
		System.out.println("-------run------");
		p1.CollideWithOrangutan(o);
		

	}

	public static void Teszt14() {
		// Teszt14 inic
		System.out.println("-------inic------");
		Csempe cs1 = new Csempe();
		Csempe cs2 = new Csempe();
		Panda p1 = new KekPanda();
		cs1.AddNeighbour(cs2);
		cs2.AddNeighbour(cs1);
		p1.SetPosition(cs1);
		cs1.SetElem(p1);
		// Teszt14 run
		System.out.println("-------run------");
		p1.Step();
	}

	public static void Teszt15() {
		// Teszt15 inic
		System.out.println("-------inic------");
		Csempe cs1 = new Csempe();
		Csempe cs2 = new Csempe();
		Panda p1 = new KekPanda();
		JatekGep j = new JatekGep();
		cs1.AddNeighbour(cs2);
		cs2.AddNeighbour(cs1);
		p1.SetPosition(cs1);
		cs1.SetElem(p1);
		j.SetPosition(cs2);
		cs2.SetElem(j);
		// Teszt15 run
		System.out.println("-------run------");
		p1.Step();
	}

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
	
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
				System.out.println("Kek Panda mozog csokiautomata mellett\r\n");
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
				System.out.println("Orangutan kilep a kijaraton ket Pandaval\r\n");
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
			case 20:
				// reader teszt
				System.out.println("READERTESZT \r\n");
				String[][] tesztinput = readFile("readertesztinput.txt");
				System.out.println(tesztinput[1][1]+ "\r\n");
				System.out.println(tesztinput[2][2]+ "\r\n");
				System.out.println("----------------------------------\r\n");
				break;

			default:
				System.exit(0);
			}
		}
	}

}