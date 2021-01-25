package ua.kiev.prog;
import java.util.HashMap;
public class Parol {

 HashMap<String,String> hm = new HashMap<>();

  public void addUser(String login, String parol){
      hm.put(login,parol);
  }
}
