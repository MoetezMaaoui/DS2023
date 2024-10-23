package EX2;

public class Pépinière {
	private plante[] inventaire;
	private int MAX_PLANTES = 1000;
	private int nombreDePlantes = 0;
	public Pépinière(int taille ) {
		if (taille < this.MAX_PLANTES) 
			inventaire = new plante[taille];	
	}
	
	public void ajoutPlante(plante plante) {
		if(this.nombreDePlantes >= inventaire.length)
			System.out.println(" L'inventaire est complet .");	
		else{
			inventaire[this.nombreDePlantes] = plante;
			this.nombreDePlantes++;
		}
	}
}
