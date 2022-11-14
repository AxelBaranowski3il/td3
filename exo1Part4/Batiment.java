package exo1Part4;

public class Batiment {
  private String adresse;
  private double surface;

  public Batiment(String adresse, double surface) {
    this.adresse = adresse;
    this.surface = surface;
  }

  public String toString() {
    return "Le batiment est situé à l'adresse " + adresse + " et de surface " + surface + " m².";
  }
}