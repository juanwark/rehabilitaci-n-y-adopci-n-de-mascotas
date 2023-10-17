
package modelo;
public class Felino extends Mascota{
    protected String libreToxoplasmosis;
    public Felino(String tipo, String nombre, String raza, String color, int edad, String libreToxoplasmosis) {
        super(tipo, nombre, raza, color, edad);
        this.libreToxoplasmosis = libreToxoplasmosis;
    }

    public String getLibreToxoplasmosis() {
        return libreToxoplasmosis;//
    }
    public String isLibreToxoplasmosis() {
        return libreToxoplasmosis;
    }
    public void setLibreToxoplasmosis(String libreToxoplasmosis) {
        this.libreToxoplasmosis = libreToxoplasmosis;
    } 
    //
}
