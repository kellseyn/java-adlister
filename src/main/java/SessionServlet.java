import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        session.setAttribute("setAs", "Session attribute");
        session.setAttribute("theName", "Sam");

        session.setMaxInactiveInterval(5);


        Cart cart = new Cart();
        cart.setNumItems(7);
        session.setAttribute("cart", cart);


        request.setAttribute("reqAt", "Request Attribute");

        ServletContext context = getServletContext();
        context.setAttribute("conAt", "Context Attribute");

        request.getRequestDispatcher("/session.jsp").forward(request, response);

        request.getSession().setAttribute("access_code", "password");
        request.getRequestDispatcher("/WEB-INF/access.jsp").forward(request,response);
    }
}
