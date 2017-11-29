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

public class TrelloNovaBoard {

	public static void NovaBoard(String nomeB,String desc,String prefs_permissionLevel,String key, String token) throws ClientProtocolException, IOException
	{
		// Requesição de Key https://trello.com/app-key
		HttpClient httpclient = HttpClients.createDefault();
		HttpPost httppost = new HttpPost("https://api.trello.com/1/boards");
		List<NameValuePair> parametros = new ArrayList<NameValuePair>(2);
		
		parametros.add(new BasicNameValuePair("name", nomeB));
		parametros.add(new BasicNameValuePair("desc", desc));
		parametros.add(new BasicNameValuePair("prefs_permissionLevel", prefs_permissionLevel));
		parametros.add(new BasicNameValuePair("key", key));
		parametros.add(new BasicNameValuePair("token", token));
		httppost.setEntity(new UrlEncodedFormEntity(parametros, "UTF-8"));
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
		
		//Key Knivet teste: fae4acfcba958d16f9af4bef4f58156c
		//Token permanente: 850099ea061f8e06087f2a3fa4b2281b
		
	}
	
}
