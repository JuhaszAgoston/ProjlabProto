//AKOS
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
	
	public static String[][] readFile(String filename) throws FileNotFoundException {
		BufferedReader reader;
		Scanner in = new Scanner(new File("input01.txt"));
		int lineNum = 7; int columnNum = 6;
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

		//kiírom hogy lássuk miageci van
		for (int i = 0; i < 6; ++i) {
			for(int j = 0; j < 7; ++j) {
				System.out.print(result[i][j]); System.out.print(" ");
			}
			System.out.println("");
		}
		
		return result;
	}

	public static void Teszt1() {
		
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

	public static void main(String[] args) throws IOException {

		readFile("input01.txt");
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