package exo3;

public class Voiture {
  private int vitesseMax;
  private double prix;
  private String couleur;

  public Voiture(int vitesseMax, double prix, String couleur){
    this.vitesseMax = vitesseMax;
    this.prix = prix;
    this.couleur = couleur;
  }

  public double calculerPrixDeVente() {
    return prix;
  }
}