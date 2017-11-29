package trello;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
 
public class TrelloPOST {
 public static void main(String[] args) throws IOException {
	 //Knivet BOARD id: 5a1a49fe5e46d2058c0e46d4
	 //Digesto LIST id: 5a1a554e0a0fe8104f377f6d
	 //ContaAzul LIST id: 5a1a5ae80a1ebd75de2e1c24
	 
	 
	 //https://api.trello.com/1/cards?idList=5a1a554e0a0fe8104f377f6d
	 
	 //key = d0cf664d9010896fcb20b850451f6b3e token = d653f59a3118fcc5342a90b0e7ae4236220d4e3d4f137747dcc4506534564480
	 
//	 TrelloPOST trello = new TrelloPOST();
//	 System.out.println(trello.savePage("https://api.trello.com/1/lists?name=Digesto&idBoard=5a1a49fe5e46d2058c0e46d4&pos=top&key=d0cf66?key=d0cf664d9010896fcb20b850451f6b3e&token=84e7a6a668130967e93f7cd1fff79225ff584b5eae0c3438a38eb089f46d1d7a"));
//	 System.out.println(trello.savePage("https://api.trello.com/1/board/5a1a49fe5e46d2058c0e46d4?key=d0cf664d9010896fcb20b850451f6b3e&token=84e7a6a668130967e93f7cd1fff79225ff584b5eae0c3438a38eb089f46d1d7a"));
	 //System.out.println("https://api.trello.com/1/lists?name=Digesto&idBoard=5a1a49fe5e46d2058c0e46d4&pos=top&key=d0cf66");
	 
	 
 }
 	
 public void criarCard(String name, String desc, String due) throws ClientProtocolException, IOException
 {
	 HttpClient httpclient = HttpClients.createDefault();
	 HttpPost httppost = new HttpPost("https://api.trello.com/1/cards");

	 // Request parameters and other properties.
	 List<NameValuePair> params = new ArrayList<NameValuePair>(2);
	 params.add(new BasicNameValuePair("name", "Processo Nº "+name));
	 params.add(new BasicNameValuePair("desc", desc));
	 params.add(new BasicNameValuePair("due", due));
	 params.add(new BasicNameValuePair("idList", "5a1a554e0a0fe8104f377f6d"));
	 params.add(new BasicNameValuePair("key", "d0cf664d9010896fcb20b850451f6b3e"));
	 params.add(new BasicNameValuePair("token", "d653f59a3118fcc5342a90b0e7ae4236220d4e3d4f137747dcc4506534564480"));
	 httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

	 //Execute and get the response.
	 HttpResponse response = httpclient.execute(httppost);
	 HttpEntity entity = response.getEntity();

	 if (entity != null) {
	     InputStream instream = entity.getContent();
	     try {
	          // do something useful
	     } finally {
	         instream.close();
	     }
	 }
	 
 }
 
}