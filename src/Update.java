import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Update extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		int serialNo = Integer.parseInt(request.getParameter("ID"));
		String UserName = request.getParameter("userName");
		String UserPassword = request.getParameter("userPassword");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		RegisterDao dao = (RegisterDao)context.getBean("RegisterDao");
		
		RegisterBean be = new RegisterBean();
		be.setSerialNo(serialNo);
		be.setUserName(UserName);
		be.setUserPassword(UserPassword);
		
		String status = dao.update(be);
		System.out.println(status);
	}
}
