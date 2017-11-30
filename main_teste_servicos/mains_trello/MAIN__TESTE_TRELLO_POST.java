package mains_trello;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import trello.TrelloPostBoard;
import trello.TrelloPostCard;
import trello.TrelloPostList;

//https://api.trello.com/1/boards/?name=TesteLINKDireto&desc=FeitoAPartirDeLinkGTTP&prefs_permissionLevel=private&key=fae4acfcba958d16f9af4bef4f58156c&token=850099ea061f8e06087f2a3fa4b2281b

public class MAIN__TESTE_TRELLO_POST {

	public static void main(String[] args) throws ClientProtocolException, IOException
	{		
		TrelloPostBoard postboard = new TrelloPostBoard();
		TrelloPostList postlist = new TrelloPostList();
		TrelloPostCard postcard = new TrelloPostCard();
		postboard.PostBoard(nomeB, desc, prefs_permissionLevel, key, token);
		postlist.PostList(nomeB, desc, data, idList, key, token);
		postcard.PostCard(nomeB, idBoard, key, token);
	}
	
}
