import java.util.*;

public class List {
	public static void main(String[] args) {
		int somme = 0, moy;
		ArrayList<Integer> liste = new ArrayList<Integer>();

		liste.add(120);
		liste.add(420);
		for (Integer ii: liste) {
			somme += ii;
		}

		System.out.println("la moyenne est: " + somme/liste.size());
	}
}
