import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/order-form")
public class BonusFormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<form method=\"POST\" action=\"/order-summary\">\n" +
                "    <label for=\"product\">Product name:</label>\n" +
                "    <input id=\"product\" name=\"product\" placeholder=\"Enter a product here\" />\n" +
                "    <label for=\"amount\">Amount:</label>\n" +
                "    <input id=\"amount\" name=\"amount\" placeholder=\"Enter the amount you want\" />\n" +
                "<input type=\"submit\"></form>");
    }
}
