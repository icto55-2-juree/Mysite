package com.sds.icto.mysite.servlet.action.board;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.dao.BoardDao;
import com.sds.icto.mysite.vo.BoardVo;
import com.sds.icto.web.Action;
import com.sds.icto.web.WebUtil;

public class GetBoardAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDao dao = new BoardDao();
		dao.updateCnt(no);
		BoardVo vo = dao.getBoard(no);
		
		request.setAttribute("vo", vo);
		
		WebUtil.forward("/views/board/board_detail.jsp", request, response);

	}

}
