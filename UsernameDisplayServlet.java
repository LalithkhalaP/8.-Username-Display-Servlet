package user;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/userdisplay")
public class UsernameDisplayServlet extends HttpServlet {
    

    public void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        PrintWriter out = res.getWriter();
        String username = req.getParameter("username");
        out.println("Welcome, " + username + "!");
    }
}
