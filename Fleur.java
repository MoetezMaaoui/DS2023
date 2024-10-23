package EX2;

public class Fleur extends plante {
	private String couleur;
	private int moisF;
	public Fleur(String nom,float h,int age,float p,String c,int m) {
		super(nom,h,age,p);
		this.couleur = c;
		this.moisF = m;
	}
	public void description() {
		super.description();
		System.out.println("couleur : "+this.couleur+" ,le mois de florissant : "+this.moisF);
	}
	
	public String getNom() {
        return this.couleur;
    }

    public void setNom(String c) {
        this.couleur = c;
    }

	public void fleurir() {
		if(this.moisF >= 4 && this.moisF <= 6) 
			System.out.println("La fleur est en fleurs");
		else
			System.out.println("La fleur n'est pas en fleurs");
	}
	

}
