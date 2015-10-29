/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author nofa@fiya service
 */
public class NamaKomputer {
    public static void main(String[] args) {
 
        InetAddress ip;
        String nama;
        try {
            ip = InetAddress.getLocalHost();
            nama = ip.getHostName();
            System.out.println("Alamat IP Kamu : " + ip);
            System.out.println("Nama Komputer Kamu : " + nama);
 
        } catch (UnknownHostException e) {
 
        }
    }
    
}
