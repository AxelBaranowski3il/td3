package exo3;

public class Renault extends Voiture {
  private int anneeFab;
  private double reduc;

  public Renault(int vitesseMax, double prix, String couleur, int anneeFab, double reduc) {
    super(vitesseMax, prix, couleur);
    this.anneeFab = anneeFab;
    this.reduc = reduc;
  }
  
  public double calculerPrixDeVente() {
    return super.calculerPrixDeVente() - reduc;
  }
  
}