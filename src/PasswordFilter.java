import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PasswordFilter implements Filter {
	public void init(FilterConfig fconfig) throws ServletException {

	}
	public void doFilter(ServletRequest request, ServletResponse response , FilterChain fchain) throws IOException, ServletException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpServletRequest req	 = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String pass1 = request.getParameter("pass");
		String pass2 = request.getParameter("psw-repeat");
		
		if(pass1.equals(pass2) && pass2.length() > 4)
		{
			fchain.doFilter(req, res);
		}
		else
		{
			out.println("Dont Do Hurry Type Password Correctly");
			RequestDispatcher rd = req.getRequestDispatcher("Register.jsp");
			rd.include(req, res);
		}
	}
	public void destroy() {

	}
}
