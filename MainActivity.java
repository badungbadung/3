import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


//안드로이드에서 소켓 클라이언트를 사용하는 메인 액티비티의 코드 

public class MainActivity extends AppCompatActivity {
	
	public void onCreat(Bundle savedInstanceState){
		public void onClick(view v) {
			String addr = input01.getText().toString().trim();
			
			ConnectThread thread = new ConnectThread(addr);
			thread.start();
		}
	});
}



class ConnectThread extends Thread{
	String hostname;
	
	public ConnectThread(String addr){
		hostname = addr;
	}
	
	public void run(){
		try{
			int port = 11001;
			Socket sock = new Socket(hostname, port);
			
			ObjectOutputStream outsream = new ObjectOutputStream(sock.getOutputStream());
			outstream.writeObject("Hello AndroidTown on Android");
			outstream.flush();
			
			ObjectInputStream instream = new ObjectInputStream(sock.getInputStream());
			String obj = (String) instream.readObject();
			
			Log.d("MainActivity","서버에서 받은 메시지 : " + obj);
			
			sock.close();
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}
 }
}
