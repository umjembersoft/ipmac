import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
/**
 *
 *
 */
public class NewClass {
    public static void main (String[] args ) {
    
InetAddress ip;


try {
ip = InetAddress.getLocalHost();
System.out.println("Curent IP Address : " + ip.getHostAddress());
NetworkInterface network = NetworkInterface.getByInetAddress(ip);
byte[] mac = network.getHardwareAddress();
System.out.println("Current Mac Address : ");

StringBuilder sb = new StringBuilder();
for (int i = 0; i < mac.length; i++){
sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1)? "-" : ""));

}
System.out.println(sb.toString());
} catch (UnknownHostException e ) {
e.printStackTrace(); 
}
catch (SocketException e){
e.printStackTrace();
} 
}
}
    

    
    

