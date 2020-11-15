import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UsernameSetter")
public class UsernameSetter extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usernameSet = request.getParameter("username");
        String parsedUsername = usernameSet==null || usernameSet==""?"Anonymous":usernameSet;
        request.getSession().setAttribute("username",parsedUsername);
        response.sendRedirect("chat.jsp?filter=false");
    }
}
