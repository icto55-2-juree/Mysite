package com.sds.icto.mysite.servlet.action.member;

import com.sds.icto.mysite.servlet.action.main.IndexAction;
import com.sds.icto.web.Action;

public class GuestbookActionFactory {
	private static GuestbookActionFactory instance;
	static {
		instance = new GuestbookActionFactory(); 
	}
	
	private GuestbookActionFactory(){
	}
	
	public static GuestbookActionFactory getInstance() {
//		if( instance == null ) {
//			instance = new ActionFactory(); 
//		}
		return instance;
	}
	
	public Action getAction( String a ) {
		Action action = null;
		
		if( "insert".equals( a ) ) {
			action = new GuestbookInsertAction();
		}else if( "guestbook".equals( a ) ) {
			action = new GuestbookAction();
		}else if( "gdelete".equals( a ) ) {
			action = new GDeleteAction();
		}
		
		
		if( action == null ) {
			action = new IndexAction();
		}
		
		return action;
	}
}
