
package sock_client_2023;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;

public class Param {
    public static DataInputStream input;
    public static DataOutputStream output;
    public static String client;
    public static String message;
       static HashMap<String,Chat> privateChatStore = new HashMap();
   static HashMap<String,Chat> oldChatStore = new HashMap();
   static String CH;
    
}
