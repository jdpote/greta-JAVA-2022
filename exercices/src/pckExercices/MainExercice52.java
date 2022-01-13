package pckExercices;

public class MainExercice52 {
	// Exercice consistant à écrire une fonction de tri. Ici, j'ai choisi d'écrire
	// la fonction récursive quicksort utilisant l'algorithme de tri rapide plutôt
	// que le tri à bulles. Quelle que soit la fonction de tri choisie, il est
	// indispensable d'écrire une fonction de concaténation des tableaux, ici
	// baptisée concatenateTabs.

	public static void main(String[] args) {
		// ici le main sert juste de test pour afficher mon tableau non trié, puis mon
		// tableau trié.
		int[] monTableau = { 2, 5, -22, 17, 9, 44 };

		for (int i = 0; i < 6; i++) {
			System.out.print(monTableau[i] + "; ");
		}
		System.out.println("");
		for (int i = 0; i < 6; i++) {
			System.out.print((quicksort(monTableau, 6))[i] + "; ");
		}
		System.out.println("");

	}

	// recursive function quicksort
	static int[] quicksort(int[] tab, int sizeTab) {

		if (sizeTab == 1 || sizeTab == 0)
			return tab;

		else {
			int sizeInf = 0;
			int sizeSup = 0;
			for (int i = 1; i < sizeTab; i++) {
				if (tab[i] < tab[0])
					sizeInf++;
				else
					sizeSup++;
			}
			int[] tabInf = new int[sizeInf];
			int[] tabSup = new int[sizeSup];
			int k1 = 0;
			int k2 = 0;
			int[] pivot = { tab[0] };
			for (int i = 1; i < sizeTab; i++) {
				if (tab[i] < tab[0]) {
					tabInf[k1] = tab[i];
					k1++;
				} else {
					tabSup[k2] = tab[i];
					k2++;
				}
			}
			return concatenateTabs(quicksort(tabInf, sizeInf), sizeInf,
					concatenateTabs(pivot, 1, quicksort(tabSup, sizeSup), sizeSup), sizeSup + 1);
		}
	}

	// concatenate function for int tabs
	static int[] concatenateTabs(int[] tab1, int sizeTab1, int[] tab2, int sizeTab2) {

		int[] concate = new int[sizeTab1 + sizeTab2];

		for (int i = 0; i < sizeTab1 + sizeTab2; i++) {
			if (i < sizeTab1)
				concate[i] = tab1[i];
			else
				concate[i] = tab2[i - sizeTab1];
		}

		return concate;
	}
}