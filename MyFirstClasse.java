public class MyFirstClasse {

	public static void main(String[] args) {
		System.out.println("Tableau à deux dimensions");
//		System.out.println("Factorielle de 2: " + fact(2));

		String[][] sama_tab = {{"Alex","Bob","Thomas"}, {"Emily","Jean","James"}};
		for(String[] s: sama_tab) {
			for(String ss: s) {
				System.out.print(ss + "\t");
			}
			System.out.println("\n------------------------");
		}
	}


//	public static int fact(int n) {
//		int f = 1;
//		for(int i=1; i<=n; i++) {
//			f = f*i;
//		}
//		return f;
//	}
}
