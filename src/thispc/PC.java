package thispc;

/**
 *
 * @author gabri
 */
public class PC {
    private String IpAddress;
    private String mask;
    private String hostname;

    public PC(String IpAddress, String mask, String hostname) {
        this.IpAddress = IpAddress;
        this.mask = mask;
        this.hostname = hostname;
    }

    public PC() {
    }
    
    public boolean ping(String IpAddress,String mask){
        String[] lastDigts = mask.split(".");//separa la mask por puntos
        String maskBin = convertirDecimalABinarioManual(Long.parseLong(lastDigts[3]));//convierte en decimal despues del ultimo punto
        
        String[] Ip1 = this.IpAddress.split(".");//separa la ip1 por puntos
        String IpBin1 = convertirDecimalABinarioManual(Long.parseLong(Ip1[3]));//convierte en decimal despues del ultimo punto
        
        String[] Ip2 = IpAddress.split(".");//separa la ip2 por puntos
        String IpBin2 = convertirDecimalABinarioManual(Long.parseLong(Ip2[3]));//convierte en decimal despues del ultimo punto
        
        int cantidadUnos = 0;
        //cuenta la cantidad de unos
        for (int i = 0; i < maskBin.length(); i++) {
            if(maskBin.charAt(i) == '1'){
                cantidadUnos++;
            }
        }
        
        String ip1 = "";
        String ip2 = "";
        for (int i = 0; i < cantidadUnos; i++) {
            ip1 = ip1+IpBin1.charAt(i);
            ip2 = ip1+IpBin2.charAt(i);
        }

        return ip1.equals(ip2);
    }
    
    
    
    private String convertirDecimalABinarioManual(long decimal) {
	if (decimal <= 0) {
		return "0";
	}
	StringBuilder binario = new StringBuilder();
	while (decimal > 0) {
		short residuo = (short) (decimal % 2);
		decimal = decimal / 2;
		// Insertar el dígito al inicio de la cadena
		binario.insert(0, String.valueOf(residuo));
	}
	return binario.toString();
}

    public String getIpAddress() {
        return IpAddress;
    }

    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public String toString() {
        return "Host: "+hostname+"\nIP: "+IpAddress+"\nMask: "+mask;
    }
}