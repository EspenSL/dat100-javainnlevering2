package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
		public static void skrivUt(int[][] matrise) {
			
			for (int[] rad : matrise) {
				for (int x : rad) {
					System.out.print(x + " ");
				}
			}
			}
		

		// b)
		public static String tilStreng(int[][] matrise) {
			
		StringBuilder a = new StringBuilder();
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				a.append(matrise);
			}
		}
		return a.toString();
		}
		
		
		

		// c)
		public static int[][] skaler(int tall, int[][] matrise) {
			
			int[][] newMatrix = new int[matrise.length][matrise[0].length];
			
			for (int i = 0; i < matrise.length; i++)
				for (int j = 0; j < matrise[i].length; j++)
					newMatrix[i][j] = matrise[i][j] * tall;
			
			return newMatrix;
		}


		// d)
		public static boolean erLik(int[][] a, int[][] b) {

		int row1, col1, row2, col2;
		
		boolean flag = true;
		
		row1 = a.length;
		col1 = a[0].length;
		
		row2 = b.length;
		col2 = b[0].length;
		
		if(row1 != row2 || col1 != col2) {
			System.out.println("Matrisene er ikke like");
		
		} else {
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j< col1; j++) {
					if (a[i][j] != b[i][j]) {
						flag = false;
						break;
					}
				}
			}
			if(flag)
				System.out.println("Matrisene er like");
			else
				System.out.println("Matrisene er ikke like");
		}
		return flag;
		}

		
		// e)
		public static int[][] speile(int[][] matrise) {

			for (int i = 0; i < matrise.length; i++) {
				for (int j = 0; j < i; j++) {
					int h = matrise[i][j];
				matrise[i][j] = matrise[j][i];
				matrise[j][i] = h;
			}
			}
			return matrise;
		}

		// f)
		public static int[][] multipliser(int[][] a, int[][] b) {

			        if (a.length == b[0].length) {
			            int sumRadOgKolonne = 0;
			            int [][] nyMatrise = new int[a.length][b[0].length];
			            
			            for (int n = 0; n < nyMatrise.length ; n ++) {
			                for (int m = 0; m < nyMatrise[n].length ; m ++) {
			                    for (int i = 0; i < a.length ; i++) {
			                         for (int j = 0; j < a[i].length ; j ++) {
			                             sumRadOgKolonne += a[i][j] * b[j][i];    
			                         }
			                    }
			                    nyMatrise[n][m] += sumRadOgKolonne;        
			                }
			                    
			            }
			            return nyMatrise;
			        } else {
			            throw new UnsupportedOperationException("Rad a =/= kolonne b");
			        }
			 }
		}

