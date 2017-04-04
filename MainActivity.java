import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


//�ȵ���̵忡�� ���� Ŭ���̾�Ʈ�� ����ϴ� ���� ��Ƽ��Ƽ�� �ڵ� 

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
			
			Log.d("MainActivity","�������� ���� �޽��� : " + obj);
			
			sock.close();
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}
 }
}
