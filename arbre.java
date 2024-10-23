package EX2;

public class arbre extends plante{
	private String typeFeuillage;
	private int AbsorMoyenne = 22;
	public arbre(String nom,float h,int age,float p,String tf) {
		super (nom,h,age,p);
		this.typeFeuillage =tf;
	}
	public void description() {
		super.description();
		System.out.println("type : "+this.typeFeuillage+" , AbsorMoyenne : "+this.AbsorMoyenne);
	}
	public String getNom() {
        return this.typeFeuillage;
    }

    public void setNom(String tf) {
        this.typeFeuillage = tf;
    }
    public int getAbs() {
    	return this.AbsorMoyenne;
    }
    
	public double absorptionCO2() {
		if(this.hauteur < 50)
			return this.AbsorMoyenne;
		else
			return (this.AbsorMoyenne+3);
	}

}
