package EX2;

public class plante {
	protected String nom ;
	protected float hauteur;
	protected int age;
	protected float prix;
	public plante(String nom,float h,int age,float p) {
		this.nom = nom;
		this.hauteur = h;
		this.age = age;
		this.prix = p;
	}

	public String toString() {
        return "Nom: " + this.nom + ", Hauteur: " + this.hauteur + " cm, Age: " + this.age + " mois, Prix: " + this.prix ;
    }

    public void description() {
        System.out.println(this.toString());
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getHauteur() {
        return this.hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
	
	
}
