package aslakjo;

import java.io.IOException;
import javax.servlet.http.*;

public class HelloWorldServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello world!");
	}
}