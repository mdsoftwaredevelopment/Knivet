package mains_trello;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import trello.TrelloNovaBoard;

public class MAIN__TESTE_TrelloNovaBoard {

	public static void main(String[] args) throws ClientProtocolException, IOException
	{
		
		TrelloNovaBoard novaboard = new TrelloNovaBoard();
		novaboard.NovaBoard("TesteMAIN", "Teste Feito para criar bords via java", "private", "fae4acfcba958d16f9af4bef4f58156c", "9968c14c495de358b21492260642f443bae32d7d7e6178ee558903e3b9791b9d");
		//https://api.trello.com/1/boards/?name=TesteLINKDireto&desc=FeitoAPartirDeLinkGTTP&prefs_permissionLevel=private&key=fae4acfcba958d16f9af4bef4f58156c&token=850099ea061f8e06087f2a3fa4b2281b
		
	}
	
}
