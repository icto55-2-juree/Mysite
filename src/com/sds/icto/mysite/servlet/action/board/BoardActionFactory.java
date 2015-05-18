package com.sds.icto.mysite.servlet.action.board;

import com.sds.icto.mysite.servlet.action.main.IndexAction;
import com.sds.icto.web.Action;

public class BoardActionFactory {
	private static BoardActionFactory instance;
	static {
		instance = new BoardActionFactory(); 
	}
	
	private BoardActionFactory(){
	}
	
	public static BoardActionFactory getInstance() {
//		if( instance == null ) {
//			instance = new ActionFactory(); 
//		}
		return instance;
	}
	
	public Action getAction( String a ) {
		Action action = null;
		
		if("board_list".equals(a)){
			action = new BoardListAction();
		}else if("insertBoard".equals(a)){
			action = new BoardInsertAction();
		}else if("insertBoardPage".equals(a)){
			action = new BoardInsertPageAction();
		}else if("getboard".equals(a)){
			action = new GetBoardAction();
		}else if("bmodifypage".equals(a)){
			action = new ModifyBoardPageAction();
		}else if("bmodify".equals(a)){
			action = new ModifyBoardAction();
		}else if("bdelete".equals(a)){
			action = new DeleteBoardAction();
		}
		
		
		if( action == null ) {
			action = new IndexAction();
		}
		
		return action;
	}
}
