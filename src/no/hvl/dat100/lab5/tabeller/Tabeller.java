package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
		public static void skrivUt(int[] tabell) {
			
		System.out.print("[ ");
			
			for (int i = 0; i < tabell.length; i++) {
				
				System.out.print(tabell[i] + " ");
			}
			
			System.out.println("]");
		}

		// b)
		
		public static String tilStreng(int[] tabell) {

			String streng = ("[");
			
			for (int i = 0; i < tabell.length; i++) {
				
				if (i != tabell.length-1) {
					
					streng += (tabell[i] + ",");
				
				} else {
					
					streng += (tabell[i]);
				}
			}
			
			streng += ("]");
			
			return streng;
		}
		// c)
		public static int summer(int[] tabell) {
		
			int i = 0;
			
			while(i < tabell.length) {
				int returnSum = tabell[i];
				i += 1;
			}
			return i;
			}
			

		// d)
		public static boolean finnesTall(int[] tabell, int tall) {

			boolean funnet = false;
			int pos = 0;
			
			while (!funnet && pos < tabell.length) {
				
				if (tall == tabell[pos]) {
					funnet = true;
				
				}
				
				pos++;
			}
				return funnet;
			
		}

		// e)
		public static int posisjonTall(int[] tabell, int tall) {

			int pos = -1;
		for (int i = 0; i < tabell.length; i++) {
			if(tabell[i] == 1) {
				pos = i;
				break;
			}
		}
		return pos;
		}
		

		// f)
		public static int[] reverser(int[] tabell) {

			System.out.println("Før reversering");
			for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + ", ");
			}
			System.out.println();
			System.out.println("etter reversering");
			for (int i = tabell.length-1; i >= 0; i--) {
				System.out.print(tabell[i] + ", ");
			}
			return tabell;
		}


		// g)
		public static boolean erSortert(int[] tabell) {
		
			int j = 0;
			boolean sortert = true;
			
			while (sortert && j < tabell.length-1) {
				if (tabell[j] > tabell[j+1]) {
					sortert = false;
				}
				j++;
			}
			return sortert;
		}


		// h)
		public static int[] settSammen(int[] tabell1, int[] tabell2) {

			int[]nyTabell = new int[tabell1.length + tabell2.length];
			int h = 0;
			
			for (int i = 0; i < tabell1.length; i++) {
				nyTabell[i] = tabell1[i];
				h++;
			}
			for (int j = 0; j < tabell2.length; j++) {
				nyTabell[h++] = tabell2[j];
			}
			for (int i = 0; i < nyTabell.length; i++) System.out.print(nyTabell[i] + " ");
			return nyTabell;
		}
	}
