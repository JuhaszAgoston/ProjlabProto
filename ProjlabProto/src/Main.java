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