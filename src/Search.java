import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;


public class Search extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		RegisterDao dao = (RegisterDao)context.getBean("RegisterDao");
		
		int inNo = Integer.parseInt(request.getParameter("ID"));
		
		RegisterBean be = dao.searchBean(inNo);
		
		System.out.println(be.getSerialNo() +" " + be.getUserName() +" " + be.getUserPassword());
		
		
	}

}
