package com.sds.icto.mysite.servlet.action.guestbook;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.dao.GuestbookDao;
import com.sds.icto.mysite.vo.GuestbookVo;
import com.sds.icto.web.Action;
import com.sds.icto.web.WebUtil;

public class GDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		
		Long no = Long.parseLong(request.getParameter("no")); 
		String password = request.getParameter("password");
		
		System.out.println(no);
		GuestbookDao dao = new GuestbookDao();
		
		dao.delete(no, password);
		
		response.sendRedirect( "/mysite/guestbook?a=guestbook" );
		
	//	WebUtil.forward("/mysite/views/guestbook/list.jsp", request, response);
		
	//	response.sendRedirect( "/mysite/guestbook?a=guestbook" );


	}

}
