
package sock_serv_2023;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class Sock_Serv_2023 { 
    ServerSocket serverSocket;
    ArrayList<Manager> usersConnection = new ArrayList<Manager>();
    
    
    public Sock_Serv_2023(){
        try {
            serverSocket = new ServerSocket(5000);
            System.out.println("Starting Chat Server....");
            while(true){
                Socket clientSocket = serverSocket.accept();
                Manager conn = new Manager(clientSocket,this);
                conn.start();
                usersConnection.add(conn);
                
                
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        new Sock_Serv_2023();
        
    }
    
}
