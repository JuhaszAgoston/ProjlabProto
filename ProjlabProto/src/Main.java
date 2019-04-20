//AKOS---nvm ebbe inkább nem nyúlok még bele--
//GABOR filereader
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	
	private static Scanner in;
	
	public static String[][] readFile(String filename) {
		BufferedReader reader;
		String[][] matrix = new String[0][0];
		try {
			//getting the sizes
			int lineNum = 0;
			int columnNum = 0;
			reader = new BufferedReader(new FileReader("../../inputs/"+filename+"/"));
			String lineForSize = reader.readLine();
			String[] attr = lineForSize.split(" ");
			
			columnNum = attr.length-2; //geting columnNum count
			while (lineForSize != null) {
				lineNum++;
			}
			lineNum = lineNum-2; //lines readed minus the first and last
			reader.close();
			matrix = new String[lineNum][columnNum];
			
			reader = new BufferedReader(new FileReader("../../inputs/"+filename+"/"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				String[] attributes = line.split(" ");
	            int i = 0;
				
				//getting the first and last line out
				if(attributes[0] == "-" && attributes[1] == "--")
	            {
					//DO NOTHING
	            }else {
	            	//starts from 1 so the first [ symbol is ignored
	            	//ends at length-1 so the last ] symbol is ignored
					for(int j = 1 ; j < line.length()-1 ; j++){
		            	attributes = reader.readLine().split(" ");
		            	
		            	//adding attributes to the program
		            	matrix[i][j] = attributes[j];
		            	
		            }
					i++;
	            }
				line = reader.readLine();
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
	public static void Teszt16() {
		//orangutan elhagyja a sorat
		System.out.println("-------inic------");
		System.out.println("-------run------");
	}
	public static void Teszt17() {
		// orangutan masik orangutannal utkozik
		System.out.println("-------inic------");
		System.out.println("-------run------");

	}

	public static void main(String[] args) throws IOException {

		in = new Scanner(System.in);
	
		while (true) {
			int menu = in.nextInt();
			switch (menu) {
			case 1:
				// Orangutan mozgasa szabad csempere
				System.out.println("Orangutan mozgasa szabad csempere\r\n");
				Teszt1();
				System.out.println("----------------------------------\r\n");
				break;

			case 2:
				// Orangutan lep olyan csempere ahol van egy jatekgep
				System.out.println("Orangutan lep olyan csempere ahol van egy jatekgep \r\n");
				Teszt2();
				System.out.println("----------------------------------\r\n");
				break;

			case 3:
				// Orangutan mozog gyenge csempere, aminek meg egynel tobb elete van
				System.out.println("Orangutan mozog gyenge csempere, aminek meg egynel tobb elete van\r\n");
				Teszt3();
				System.out.println("----------------------------------\r\n");
				break;

			case 4:
				// Orangutan mozog gyenge csempere ami eltorik(sor nelkul)
				System.out.println("Orangutan mozog gyenge csempere ami eltorik(sor nelkul)");
				Teszt4();
				System.out.println("----------------------------------\r\n");
				break;

			case 5:
				// Orangutan mozog gyenge csempere es az eltorik(ket elemu sorral)
				System.out.println("Orangutan mozog gyenge csempere es az eltorik(ket elemu sorral)");
				Teszt5();
				System.out.println("----------------------------------\r\n");
				break;

			case 6:
				// Panda mozog gyenge csemp�re �s az elt�rik
				System.out.println("Panda mozog gyenge csempere es az eltorik");
				Teszt6();
				System.out.println("----------------------------------\r\n");
				break;

			case 7:
				// Or�ngut�n pand�val tal�lkozik, ami szabad
				System.out.println("Orangutan pandaval talalkozik, ami szabad");
				Teszt7();
				System.out.println("----------------------------------\r\n");
				break;

			case 8:
				// Or�ngut�n szekr�nyen �tl�p
				System.out.println("Orangutan szekrenyen atlep");
				Teszt8();
				System.out.println("----------------------------------\r\n");
				break;

			case 9:
				// Z�ldPanda mozog fotel mellett
				System.out.println("ZoldPanda mozog fotel mellett");
				Teszt9();
				System.out.println("----------------------------------\r\n");
				break;

			case 10:
				// PirosPanda mozog j�t�kg�p mellett
				System.out.println("PirosPanda mozog jatekgep mellett");
				Teszt10();
				System.out.println("----------------------------------\r\n");
				break;

			case 11:
				// KekPanda mozog csokiautomata mellett
				System.out.println("KekPanda mozog csokiautomata mellett");
				Teszt11();
				System.out.println("----------------------------------\r\n");
				break;

			case 12:
				// Or�ngut�n kil�p a kij�raton k�t pand�val
				System.out.println("Orangutan kilep a kijaraton ket pandaval");
				Teszt12();
				System.out.println("----------------------------------\r\n");
				break;

			case 13:
				// Or�ngut�n pand�val tal�lkozik, ami nem szabad
				System.out.println("Orangutan pandaval talalkozik, ami nem szabad");
				Teszt13();
				System.out.println("----------------------------------\r\n");
				break;

			case 14:
				// Panda �n�ll�an mozog (Step) egyetlen l�phet� szomsz�dos mez�re
				System.out.println("Panda onalloan mozog (Step) egyetlen lepheto szomszedos mezore");
				Teszt14();
				System.out.println("----------------------------------\r\n");
				System.out.flush();
				break;

			case 15:
				// Panda �n�ll�an mozog (Step) de a szomsz�dos mez�n egy automata �ll
				System.out.println("Panda onalloan mozog (Step) de a szomszedos mezon egy automata all");
				Teszt15();
				System.out.println("----------------------------------\r\n");
				break;
			case 16:
				System.out.println("Orangutan elhagyja a sorat");
				Teszt16();
				System.out.println("----------------------------------\r\n");
				break;
			case 17:
				System.out.println("Orangutan masik Orangutannal utkozik");
				Teszt17();
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