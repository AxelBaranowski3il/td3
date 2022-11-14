package exo1_Part_3;

public class Personne {
  private String nom;

  public Personne(String nom){
    this.nom = nom;
  }

  public void afficher() {
    System.out.println(nom + " est une personne.");
  }
}