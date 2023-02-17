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
    
    public void ping(String IpAddress,String mask){
        String lastDigts = "";
        
        for (int i = 0; i < mask.length(); i++) {
            if(i >= mask.length()-3){
                lastDigts = lastDigts + i;
            }
        }
        
        String maskBin = convertirDecimalABinarioManual(Long.parseLong(lastDigts));
        String[] Ip1 = this.IpAddress.split(".");
        String IpBin1 = convertirDecimalABinarioManual(Long.parseLong(Ip1[3]));
        String[] Ip2 = IpAddress.split(".");
        String IpBin2 = convertirDecimalABinarioManual(Long.parseLong(Ip2[3]));
        
        int cantidadUno = 0;
        for (int i = 0; i < IpBin1.length(); i++) {
            if(mask.charAt(i) == '1'){
                cantidadUno++;
            }
        }
    }
    
    public String convertirDecimalABinarioManual(long decimal) {
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
