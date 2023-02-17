package thispc;

/**
 *
 * @author gabri
 */
public class PC_Escritorio extends PC{
    private int RAM;
    private int storage;
    private String storageType;
    private boolean tarjetaGrafica;

    public PC_Escritorio(int RAM, int storage, String storageType, boolean tarjetaGrafica, 
            String ipAddress, String mask, String hostname) {
        super(ipAddress, mask, hostname);
        this.RAM = RAM;
        this.storage = storage;
        this.storageType = storageType;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    

    public PC_Escritorio() {
        super();
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public boolean isTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(boolean tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return super.toString()+"\nRAM: "+RAM+"\nAlmacenamiento: "+storage+"\nTipo: "+storageType+"\nTarjeta gráfica: "+tarjetaGrafica;
    }
}
