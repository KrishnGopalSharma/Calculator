import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class simple extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String s1=req.getParameter("num7");
		String s2=req.getParameter("num7");
		String s3=req.getParameter("num7");
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n3=Integer.parseInt(s3);
		int n=(n1*n2*n3)/100;
		PrintWriter out=res.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Simple Interest</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Calculate value</h1>");
		out.print("<hr/>");
		out.print("<p>S.I of "+n1+" = "+n+" </p>");
		out.print("<p>Using Generic Servlet</p>");
		out.print("</body>");
		out.print("</html>");
		out.close();
		
	}

}
