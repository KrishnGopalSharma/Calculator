import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class square extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String s1=req.getParameter("num6");
		int n1=Integer.parseInt(s1);
		int n=n1*n1;
		PrintWriter out=res.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Square</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Calculate valuep</h1>");
		out.print("<hr/>");
		out.print("<p>Square of "+n1+" = "+n+" </p>");
		out.print("<p>Using Generic Servlet</p>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

}
