import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdsServlet", urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads adsDAO = DaoFactory.getAdsDao();
        List<Ad> AdList = adsDAO.all();
        request.setAttribute("AdList", AdList);



        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);

    }


//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        if (username != null && password != null) {
//            response.sendRedirect("/profile");
//        }
//
//    }
}
