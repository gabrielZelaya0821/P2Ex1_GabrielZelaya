package thispc;

/**
 *
 * @author gabri
 */
public class Laptop extends PC{
    private String marca;
    private String pantalla;
    private boolean RGB;

    public Laptop(String marca, String pantalla, boolean RGB, String ipAddress, String mask, String hostname) {
        super(ipAddress, mask, hostname);
        this.marca = marca;
        this.pantalla = pantalla;
        this.RGB = RGB;
    }

    public Laptop() {
        super();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMarca: "+marca+"\nDefinición: "+pantalla+"\nRGB: "+RGB;
    }
}
