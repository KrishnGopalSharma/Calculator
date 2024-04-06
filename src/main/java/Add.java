import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends GenericServlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("num1");
		String s2=request.getParameter("num2");
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n=n1+n2;
		PrintWriter out=response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Addition</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Add App</h1>");
		out.print("<hr/>");
		out.print("<p>Addition of "+n1+" and "+n2+"= "+n+" </p>");
		out.print("<p>Using Generic Servlet</p>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
	
}
	


