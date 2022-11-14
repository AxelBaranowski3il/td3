package Exo2Part3;

import java.lang.Math;

public class Cercle extends Forme {

  private double longueur;

  public Cercle(double longueur) {
    this.longueur = longueur;
  }

  @Override
  public double getSurface() {
    return Math.PI * longueur * longueur;
  }
}