package Servlet.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletLogin")
public class ServletLogin extends HttpServlet {

    public ServletLogin(){
        super();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Users u = new Users();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        u.setUsername(username);
        u.setPassword(password);
        if (u.getUsername().equals("admin") && u.getPassword().equals("admin")){
            response.sendRedirect(request.getContextPath()+"/login_success.jsp");
        }else{
            response.sendRedirect(response.getContentType()+"/login_failure.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void init() throws ServletException {
        // Put your code here
    }
}
