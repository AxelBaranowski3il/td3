package exo1Part4;

public class Maison extends Batiment {
  private int nbPieces;
  private double surfaceJardin;

  public Maison(String adresse, int surface, int surfaceJardin, int nbPieces){
    super(adresse, surface);
    this.surfaceJardin = surfaceJardin;
    this.nbPieces = nbPieces;
  }

  @Override
  public String toString() {
    return super.toString() + "La surface du jardin est de " + surfaceJardin + " m² et contient " + nbPieces + " pieces.";
  } 
}