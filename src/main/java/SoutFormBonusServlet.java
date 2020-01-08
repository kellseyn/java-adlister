import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/order-summary")
public class SoutFormBonusServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String product = request.getParameter("product");
        String amount = request.getParameter("amount");
        PrintWriter out = response.getWriter();
        out.println(product+ " " + amount);
    }
}
