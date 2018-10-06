import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Delete extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			
		int serialNumber = Integer.parseInt(request.getParameter("ID"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		RegisterDao dao = (RegisterDao)context.getBean("RegisterDao");
		
		String status = dao.deleteBean(serialNumber);
		System.out.println(status);
		
	}
}
