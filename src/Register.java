
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Register extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("username");
		String userPassword = request.getParameter("pass");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		RegisterDao dao = (RegisterDao) context.getBean("RegisterDao");

		RegisterBean b = new RegisterBean();

		b.setUserName(userName);
		b.setUserPassword(userPassword);
		String Status = dao.insertUser(b);
		System.out.println(Status);
		response.sendRedirect("Manupulation.jsp");

	}
}
