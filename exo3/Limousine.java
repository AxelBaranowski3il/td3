package exo3;

public class Limousine extends Voiture {
  private int longueur;

  public Limousine(int vitesseMax, double prix, String couleur, int longueur) {
    super(vitesseMax, prix, couleur);
    this.longueur = longueur;
  }

  @Override
  public double calculerPrixDeVente() {
    return ((longueur > 6) ? 0.95 : 0.90) * super.calculerPrixDeVente();
  }
}