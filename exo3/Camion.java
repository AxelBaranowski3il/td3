package exo3;

public class Camion extends Voiture {
  private int poids;

  public Camion(int vitesseMax, double prix, String couleur, int poids) {
    super(vitesseMax, prix, couleur);
    this.poids = poids;
  }

  @Override
  public double calculerPrixDeVente() {
    double prixDeBase = super.calculerPrixDeVente();
    return poids > 2000 ? prixDeBase * 0.9 : prixDeBase * 0.8;
  }
}