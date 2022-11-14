package Exo2Part3;

public class Carre extends Forme {
  private double longueur;
  
  public Carre(double longueur) {
    this.longueur = longueur;
  }

  public double getSurface() {
    return longueur * longueur;
  }
}