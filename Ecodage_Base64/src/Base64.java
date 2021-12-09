public class Base64 {

	// Déclaration des Variables

	static byte taille;
	static String result;

	public static void main(String[] args) {
		byte source[] = { 0x6A, 0x11, 0x25 };
		// result = Encode(source);
		decToBin(source);

	}

	public static String Encode(int source[]) {

		// On récupère la longueur du tableau
		taille = (byte) source.length;

		// On vérifie la longueur du tableau
		if (taille % 3 == 0) {

			// On récupère les valeurs du tableau
			for (int j = 0; j <= taille; j++) {

				// On convertir les valeurs en binaire

				// On convertir les valeurs binaires sur 8 digit;
				for (int i = 0; i <= taille; i++) {

				}
				System.out.println(source[j]);

			}

			System.out.println("Good");

		} else {
			System.out.println("Fair");
		}

		return "";
	}

	public static void decToBin(byte[] convert) {
		char bin[] = new char[255];
		int index = 0;
		

		for (int i = 0; i <= convert.length; i++) {
			
			byte n= convert[i];
			int w=0;
			
			while (w < 8) {
				bin[index++] = (char) (n % 2);
				n /= 2;
				w++;
			}
		}

		System.out.println(java.util.Arrays.toString(bin));

	}

	// Cette méthodes permet de convertir en Alphabet
	public static char decToAplha(byte n) {
		char alpha = 0;
		switch (n) {
		case 0:
			alpha = 'A';
			break;
		case 1:
			alpha = 'B';
			break;
		case 2:
			alpha = 'C';
			break;
		case 3:
			alpha = 'D';
			break;
		case 4:
			alpha = 'E';
			break;
		case 5:
			alpha = 'F';
			break;
		case 6:
			alpha = 'G';
			break;
		case 7:
			alpha = 'H';
			break;
		case 8:
			alpha = 'I';
			break;
		case 9:
			alpha = 'J';
			break;
		case 10:
			alpha = 'K';
			break;
		case 11:
			alpha = 'L';
			break;
		case 12:
			alpha = 'M';
			break;
		case 13:
			alpha = 'N';
			break;
		case 14:
			alpha = 'O';
			break;
		case 15:
			alpha = 'P';
			break;
		case 16:
			alpha = 'Q';
			break;
		case 17:
			alpha = 'R';
			break;
		case 18:
			alpha = 'S';
			break;
		case 19:
			alpha = 'T';
			break;
		case 20:
			alpha = 'U';
			break;
		case 21:
			alpha = 'V';
			break;
		case 22:
			alpha = 'W';
			break;
		case 23:
			alpha = 'X';
			break;
		case 24:
			alpha = 'Y';
			break;
		case 25:
			alpha = 'Z';
			break;
		case 26:
			alpha = 'a';
			break;
		case 27:
			alpha = 'b';
			break;
		case 28:
			alpha = 'c';
			break;
		case 29:
			alpha = 'd';
			break;
		case 30:
			alpha = 'e';
			break;
		case 31:
			alpha = 'f';
			break;
		case 32:
			alpha = 'g';
			break;
		case 33:
			alpha = 'h';
			break;
		case 34:
			alpha = 'i';
			break;
		case 35:
			alpha = 'j';
			break;
		case 36:
			alpha = 'k';
			break;
		case 37:
			alpha = 'l';
			break;
		case 38:
			alpha = 'm';
			break;
		case 39:
			alpha = 'n';
			break;
		case 40:
			alpha = 'o';
			break;
		case 41:
			alpha = 'p';
			break;
		case 42:
			alpha = 'q';
			break;
		case 43:
			alpha = 'r';
			break;
		case 44:
			alpha = 's';
			break;
		case 45:
			alpha = 't';
			break;
		case 46:
			alpha = 'u';
			break;
		case 47:
			alpha = 'v';
			break;
		case 48:
			alpha = 'w';
			break;
		case 49:
			alpha = 'x';
			break;
		case 50:
			alpha = 'y';
			break;
		case 51:
			alpha = 'z';
			break;
		case 52:
			alpha = '0';
			break;
		case 53:
			alpha = '1';
			break;
		case 54:
			alpha = '2';
			break;
		case 55:
			alpha = '3';
			break;
		case 56:
			alpha = '4';
			break;
		case 57:
			alpha = '5';
			break;
		case 58:
			alpha = '6';
			break;
		case 59:
			alpha = '7';
			break;
		case 60:
			alpha = '8';
			break;
		case 61:
			alpha = '9';
			break;
		case 62:
			alpha = '/';
			break;
		case 63:
			alpha = '+';
			break;
		default:
		}
		return alpha;

	}

}
